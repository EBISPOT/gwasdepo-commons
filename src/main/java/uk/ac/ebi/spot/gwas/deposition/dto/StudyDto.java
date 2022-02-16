package uk.ac.ebi.spot.gwas.deposition.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import org.springframework.hateoas.ResourceSupport;
import org.springframework.hateoas.core.Relation;
import uk.ac.ebi.spot.gwas.deposition.dto.curation.DiseaseTraitDto;
import uk.ac.ebi.spot.gwas.deposition.dto.curation.EfoTraitDto;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@Relation(value = "study", collectionRelation = "studies")
public final class StudyDto extends ResourceSupport implements Serializable {

    private static final long serialVersionUID = -2822216095301860842L;

    @NotEmpty
    @JsonProperty("study_tag")
    private final String studyTag;

    @JsonProperty("studyId")
    private final String studyId;

    @JsonProperty("study_accession")
    private final String accession;

    @JsonProperty("genotyping_technology")
    private final String genotypingTechnology;

    @JsonProperty("array_manufacturer")
    private final String arrayManufacturer;

    @JsonProperty("array_information")
    private final String arrayInformation;

    @JsonProperty("imputation")
    private final Boolean imputation;

    @JsonProperty("variant_count")
    private final Integer variantCount;

    @JsonProperty("sample_description")
    private final String sampleDescription;

    @JsonProperty("statistical_model")
    private final String statisticalModel;

    @JsonProperty("study_description")
    private final String studyDescription;

    @JsonProperty("trait")
    private final String trait;

    @JsonProperty("efo_trait")
    private final String efoTrait;

    @JsonProperty("background_trait")
    private final String backgroundTrait;

    @JsonProperty("background_efo_trait")
    private final String backgroundEfoTrait;

    @JsonProperty("checksum")
    private final String checksum;

    @JsonProperty("summary_statistics_file")
    private final String summaryStatisticsFile;

    @JsonProperty("raw_sumstats_file")
    private final String rawSumstatsFile;

    @JsonProperty("summary_statistics_assembly")
    private final String summaryStatisticsAssembly;

    @JsonProperty("readme_file")
    private final String readmeFile;

    @JsonProperty("cohort")
    private final String cohort;

    @JsonProperty("cohort_id")
    private final String cohortId;

    @JsonProperty("associations")
    private final List<AssociationDto> associations;

    @JsonProperty("samples")
    private final List<SampleDto> samples;

    @JsonProperty("notes")
    private final List<NoteDto> notes;

    @JsonProperty("agreedToCc0")
    private final Boolean agreedToCc0;

    @JsonProperty("diseaseTraits")
    private List<DiseaseTraitDto> diseaseTraits;

    @JsonProperty("efoTraits")
    private List<EfoTraitDto> efoTraits;

    @JsonCreator
    public StudyDto(@JsonProperty("study_tag") String studyTag,
                    @JsonProperty("studyId") String studyId,
                    @JsonProperty("study_accession") String accession,
                    @JsonProperty("genotyping_technology") String genotypingTechnology,
                    @JsonProperty("array_manufacturer") String arrayManufacturer,
                    @JsonProperty("array_information") String arrayInformation,
                    @JsonProperty("imputation") Boolean imputation,
                    @JsonProperty("variant_count") Integer variantCount,
                    @JsonProperty("sample_description") String sampleDescription,
                    @JsonProperty("statistical_model") String statisticalModel,
                    @JsonProperty("study_description") String studyDescription,
                    @JsonProperty("trait") String trait,
                    @JsonProperty("efo_trait") String efoTrait,
                    @JsonProperty("background_trait") String backgroundTrait,
                    @JsonProperty("background_efo_trait") String backgroundEfoTrait,
                    @JsonProperty("summary_statistics_file") String summaryStatisticsFile,
                    @JsonProperty("raw_sumstats_file") String rawSumstatsFile,
                    @JsonProperty("checksum") String checksum,
                    @JsonProperty("summary_statistics_assembly") String summaryStatisticsAssembly,
                    @JsonProperty("readme_file") String readmeFile,
                    @JsonProperty("cohort") String cohort,
                    @JsonProperty("cohort_id") String cohortId,
                    @JsonProperty("associations") List<AssociationDto> associations,
                    @JsonProperty("samples") List<SampleDto> samples,
                    @JsonProperty("notes") List<NoteDto> notes,
                    @JsonProperty("agreedToCc0") Boolean agreedToCc0,
                    @JsonProperty("diseaseTraits") List<DiseaseTraitDto> diseaseTraits,
                    @JsonProperty("efoTraits") List<EfoTraitDto> efoTraits) {
        this.studyTag = studyTag;
        this.studyId = studyId;
        this.accession = accession;
        this.genotypingTechnology = genotypingTechnology;
        this.arrayManufacturer = arrayManufacturer;
        this.arrayInformation = arrayInformation;
        this.imputation = imputation;
        this.sampleDescription = sampleDescription;
        this.variantCount = variantCount;
        this.statisticalModel = statisticalModel;
        this.studyDescription = studyDescription;
        this.trait = trait;
        this.efoTrait = efoTrait;
        this.backgroundTrait = backgroundTrait;
        this.backgroundEfoTrait = backgroundEfoTrait;
        this.summaryStatisticsFile = summaryStatisticsFile;
        this.rawSumstatsFile = rawSumstatsFile;
        this.checksum = checksum;
        this.summaryStatisticsAssembly = summaryStatisticsAssembly;
        this.readmeFile = readmeFile;
        this.cohort = cohort;
        this.cohortId = cohortId;
        this.associations = associations;
        this.samples = samples;
        this.notes = notes;
        this.agreedToCc0 = agreedToCc0;
        this.diseaseTraits = diseaseTraits;
        this.efoTraits = efoTraits;
    }

    public String getStudyTag() {
        return studyTag;
    }

    public String getGenotypingTechnology() {
        return genotypingTechnology;
    }

    public String getArrayManufacturer() {
        return arrayManufacturer;
    }

    public String getArrayInformation() {
        return arrayInformation;
    }

    public Boolean getImputation() {
        return imputation;
    }

    public Integer getVariantCount() {
        return variantCount;
    }

    public String getStatisticalModel() {
        return statisticalModel;
    }

    public String getStudyDescription() {
        return studyDescription;
    }

    public String getTrait() {
        return trait;
    }

    public String getEfoTrait() {
        return efoTrait;
    }

    public String getBackgroundTrait() {
        return backgroundTrait;
    }

    public String getBackgroundEfoTrait() {
        return backgroundEfoTrait;
    }

    public String getSummaryStatisticsFile() {
        return summaryStatisticsFile;
    }

    public String getRawSumstatsFile() {
        return rawSumstatsFile;
    }

    public String getChecksum() {
        return checksum;
    }

    public String getSummaryStatisticsAssembly() {
        return summaryStatisticsAssembly;
    }

    public String getAccession() {
        return accession;
    }

    public String getSampleDescription() {
        return sampleDescription;
    }

    public String getCohort() {
        return cohort;
    }

    public String getCohortId() {
        return cohortId;
    }

    public String getReadmeFile() {
        return readmeFile;
    }

    public List<AssociationDto> getAssociations() {
        return associations;
    }

    public List<SampleDto> getSamples() {
        return samples;
    }

    public List<NoteDto> getNotes() {
        return notes;
    }

    public Boolean isAgreedToCc0() {
        return agreedToCc0;
    }

    public String getStudyId() { return studyId; }

    public List<DiseaseTraitDto> getDiseaseTraits() { return diseaseTraits; }

    public List<EfoTraitDto> getEfoTraits() { return efoTraits; }
}
