package uk.ac.ebi.spot.gwas.deposition.dto.curation;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.AssertTrue;

@Data
public class FileUploadRequest {

    private MultipartFile multipartFile;

    @AssertTrue(message = "File must be provided")
    public boolean isFileProvided() {
        return (multipartFile != null) && ( ! multipartFile.isEmpty());
    }
}
