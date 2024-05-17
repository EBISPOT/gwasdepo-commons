package uk.ac.ebi.spot.gwas.deposition.dto.curation;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import org.springframework.hateoas.core.Relation;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.AssertTrue;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Relation(
        value = "literature-file",
        collectionRelation = "literature-files"
)
public class LiteratureFileDto {

    private String id;
    private String fileName;
    private String name;
    private String createdBy;
    private Date createDate;

    @JsonIgnore
    private List<MultipartFile> multipartFile;

    @JsonIgnore
    @AssertTrue(message = "File must be provided")
    public boolean isFileProvided() {
        return (multipartFile != null) && ( multipartFile.get(0).getSize() > 0);
    }
}
