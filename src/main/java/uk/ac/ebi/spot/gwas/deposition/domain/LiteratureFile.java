package uk.ac.ebi.spot.gwas.deposition.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "literature-file")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LiteratureFile {

    @Id
    private String id;

    private String name;

    private String fileOriginalName;

    private String pubmedId;

    @CreatedBy
    private String createdBy;

    @CreatedDate
    private Date createDate;

}
