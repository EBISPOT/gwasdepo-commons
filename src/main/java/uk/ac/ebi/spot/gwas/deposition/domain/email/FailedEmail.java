package uk.ac.ebi.spot.gwas.deposition.domain.email;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "failedEmails")
public class FailedEmail {

    @Id
    private String id;

    private String emailAddress;

    private String subject;

    private String content;

    private int currentCount;

    public FailedEmail() {

    }

    public FailedEmail(String emailAddress, String subject, String content, int currentCount) {
        this.emailAddress = emailAddress;
        this.subject = subject;
        this.content = content;
        this.currentCount = currentCount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getCurrentCount() {
        return currentCount;
    }

    public void setCurrentCount(int currentCount) {
        this.currentCount = currentCount;
    }
}
