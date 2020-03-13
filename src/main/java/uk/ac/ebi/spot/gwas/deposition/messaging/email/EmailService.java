package uk.ac.ebi.spot.gwas.deposition.messaging.email;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import uk.ac.ebi.spot.gwas.deposition.config.MailConfig;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.UnsupportedEncodingException;

@Service
@ConditionalOnProperty(name = "email.enabled", havingValue = "true")
public class EmailService {

    private static final Logger log = LoggerFactory.getLogger(EmailService.class);

    @Autowired(required = false)
    private JavaMailSender mailSender;

    @Autowired(required = false)
    private MailConfig mailConfig;

    @Async
    public void sendMessage(String emailAddress, String subject, String content) {
        if (mailConfig == null) {
            log.info("Email sending is disabled.");
            return;
        }

        if (mailSender != null) {
            if (content == null) {
                log.error("Unable to send email. Content is null.");
                return;
            }
            int retryCount = mailConfig.getRetryCount();
            for (int i = 0; i < retryCount; i++) {
                try {
                    log.info("Building the email message to be sent");
                    MimeMessage message = buildMessage(emailAddress, subject, content);
                    log.info("Preparing to send the email: {}", message);
                    mailSender.send(message);
                    log.info("Successfully sent the email message.");
                    break;
                } catch (Exception e) {
                    log.error("Exception received while trying to send out email: {}", e.getMessage(), e);
                }
            }
        } else {
            log.warn("Email sender configuration not present. Cannot send emails.");
        }
    }

    private MimeMessage buildMessage(String emailAddress,
                                     String subject,
                                     String content) throws MessagingException, UnsupportedEncodingException {
        log.info("Building the MimeMessage to be sent.");
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        mimeMessage.setFrom(new InternetAddress(mailConfig.getFromAddress(), mailConfig.getFromName()));

        mimeMessage.setContent(content, String.format("%s;%s",
                doesStringContainHtml(content) ? "text/html" : "text/plain", "charset=utf-8"));
        mimeMessage.setRecipients(Message.RecipientType.TO, InternetAddress.parse(emailAddress));

        mimeMessage.setSubject(subject);
        return mimeMessage;
    }

    private static boolean doesStringContainHtml(final String content) {
        return content.replaceAll("\r\n|\n", "").matches(".*\\<[a-zA-Z]{1,}\\>.*\\</[a-zA-Z]{1,}\\>.*");

    }

}
