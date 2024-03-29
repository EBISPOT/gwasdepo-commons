package uk.ac.ebi.spot.gwas.deposition.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import org.springframework.hateoas.core.Relation;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
@Relation(value = "sample", collectionRelation = "samples")
public final class SampleDto implements Serializable {

    private static final long serialVersionUID = -1115661685340650284L;

    @NotEmpty
    @JsonProperty("study_tag")
    private final String studyTag;

    @NotEmpty
    @JsonProperty("stage")
    private final String stage;

    @NotNull
    @JsonProperty("size")
    private final Integer size;

    @JsonProperty("cases")
    private final Integer cases;

    @JsonProperty("controls")
    private final Integer controls;

    @JsonProperty("sample_description")
    private final String sampleDescription;

    @NotEmpty
    @JsonProperty("ancestry_category")
    private final String ancestryCategory;

    @JsonProperty("ancestry")
    private final String ancestry;

    @JsonProperty("ancestry_description")
    private final String ancestryDescription;

    @NotEmpty
    @JsonProperty("country_recruitement")
    private final String countryRecruitement;

    @JsonProperty("caseControlStudy")
    private Boolean caseControlStudy;

    @JsonProperty("ancestryMethod")
    private String ancestryMethod;

    @JsonCreator
    public SampleDto(@JsonProperty("study_tag") String studyTag,
                     @JsonProperty("note") String stage,
                     @JsonProperty("size") Integer size,
                     @JsonProperty("cases") Integer cases,
                     @JsonProperty("controls") Integer controls,
                     @JsonProperty("sample_description") String sampleDescription,
                     @JsonProperty("ancestry_category") String ancestryCategory,
                     @JsonProperty("ancestry") String ancestry,
                     @JsonProperty("ancestry_description") String ancestryDescription,
                     @JsonProperty("country_recruitement") String countryRecruitement,
                     @JsonProperty("caseControlStudy") Boolean caseControlStudy,
                     @JsonProperty("ancestryMethod") String ancestryMethod) {
        this.studyTag = studyTag;
        this.stage = stage;
        this.size = size;
        this.cases = cases;
        this.controls = controls;
        this.sampleDescription = sampleDescription;
        this.ancestryCategory = ancestryCategory;
        this.ancestry = ancestry;
        this.ancestryDescription = ancestryDescription;
        this.countryRecruitement = countryRecruitement;
        this.caseControlStudy = caseControlStudy;
        this.ancestryMethod = ancestryMethod;
    }

    public String getStudyTag() {
        return studyTag;
    }

    public String getStage() {
        return stage;
    }

    public Integer getSize() {
        return size;
    }

    public Integer getCases() {
        return cases;
    }

    public Integer getControls() {
        return controls;
    }

    public String getSampleDescription() {
        return sampleDescription;
    }

    public String getAncestryCategory() {
        return ancestryCategory;
    }

    public String getAncestry() {
        return ancestry;
    }

    public String getAncestryDescription() {
        return ancestryDescription;
    }

    public String getCountryRecruitement() {
        return countryRecruitement;
    }


    public Boolean getCaseControlStudy() {
        return caseControlStudy;
    }

    public void setCaseControlStudy(Boolean caseControlStudy) {
        this.caseControlStudy = caseControlStudy;
    }

    public String getAncestryMethod() {
        return ancestryMethod;
    }

    public void setAncestryMethod(String ancestryMethod) {
        this.ancestryMethod = ancestryMethod;
    }
}
