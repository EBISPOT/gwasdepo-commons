package uk.ac.ebi.spot.gwas.deposition.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class FtpConfig {

    @Value("${ftp.link:#{NULL}}")
    private String ftpLink;

    @Value("${ftp.user:#{NULL}")
    private String ftpUser;

    @Value("${ftp.pass:#{NULL}}")
    private String ftpPass;

    @Value("${ftp.app_folder:#{NULL}}")
    private String appFolder;
}

