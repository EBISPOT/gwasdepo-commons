package uk.ac.ebi.spot.gwas.deposition.dto.curation;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.List;

@Data
@Builder
public class StudyRabbitMessage implements Serializable {

    private static final long serialVersionUID = -2905473437506701688L;

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



    @JsonProperty("agreedToCc0")
    private final Boolean agreedToCc0;

    @JsonProperty("diseaseTrait")
    private String diseaseTrait;

    @JsonProperty("efoTraits")
    private List<String> efoTraits;

    @JsonProperty("backgroundEfoTraits")
    private List<String> backgroundEfoTraits;

    @JsonProperty("initialSampleDescription")
    private String initialSampleDescription;

    @JsonProperty("replicateSampleDescription")
    private String replicateSampleDescription;

    @JsonProperty("sumstats_flag")
    private Boolean sumstatsFlag;

    @JsonProperty("pooled_flag")
    private Boolean pooledFlag;

    @JsonProperty("gxe_flag")
    private Boolean gxeFlag;

    @JsonProperty("submissionId")
    private String submissionId;

    @JsonProperty("imputationPanel")
    private String imputationPanel;

    @JsonProperty("imputationSoftware")
    private String imputationSoftware;

    @JsonProperty("adjustedCovariates")
    private String adjustedCovariates;


    @JsonProperty("minor_allele_frequency_lower_limit")
    private Double minor_allele_frequency_lower_limit;

    @JsonProperty("sex")
    private String sex;

    @JsonProperty("coordinateSystem")
    private String coordinateSystem;

    @JsonProperty("analysisSoftware")
    private String analysisSoftware;

    public StudyRabbitMessage(@JsonProperty("study_tag") String studyTag,
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
                              @JsonProperty("checksum") String checksum,
                              @JsonProperty("summary_statistics_file") String summaryStatisticsFile,
                              @JsonProperty("raw_sumstats_file") String rawSumstatsFile,
                              @JsonProperty("summary_statistics_assembly") String summaryStatisticsAssembly,
                              @JsonProperty("readme_file") String readmeFile,
                              @JsonProperty("cohort") String cohort,
                              @JsonProperty("cohort_id") String cohortId,
                              @JsonProperty("agreedToCc0") Boolean agreedToCc0,
                              @JsonProperty("diseaseTrait") String diseaseTrait,
                              @JsonProperty("efoTraits") List<String> efoTraits,
                              @JsonProperty("backgroundEfoTraits") List<String> backgroundEfoTraits,
                              @JsonProperty("initialSampleDescription") String initialSampleDescription,
                              @JsonProperty("replicateSampleDescription") String replicateSampleDescription,
                              @JsonProperty("sumstats_flag") Boolean sumstatsFlag,
                              @JsonProperty("pooled_flag") Boolean pooledFlag,
                              @JsonProperty("gxe_flag") Boolean gxeFlag,
                              @JsonProperty("submissionId") String submissionId,
                              @JsonProperty("imputationPanel") String imputationPanel,
                              @JsonProperty("imputationSoftware") String imputationSoftware,
                              @JsonProperty("adjustedCovariates") String adjustedCovariates,
                              @JsonProperty("minor_allele_frequency_lower_limit") Double minor_allele_frequency_lower_limit,
                              @JsonProperty("sex") String sex,
                              @JsonProperty("coordinateSystem") String coordinateSystem,
                              @JsonProperty("analysisSoftware") String analysisSoftware) {
        this.studyTag = studyTag;
        this.studyId = studyId;
        this.accession = accession;
        this.genotypingTechnology = genotypingTechnology;
        this.arrayManufacturer = arrayManufacturer;
        this.arrayInformation = arrayInformation;
        this.imputation = imputation;
        this.variantCount = variantCount;
        this.sampleDescription = sampleDescription;
        this.statisticalModel = statisticalModel;
        this.studyDescription = studyDescription;
        this.trait = trait;
        this.efoTrait = efoTrait;
        this.backgroundTrait = backgroundTrait;
        this.backgroundEfoTrait = backgroundEfoTrait;
        this.checksum = checksum;
        this.summaryStatisticsFile = summaryStatisticsFile;
        this.rawSumstatsFile = rawSumstatsFile;
        this.summaryStatisticsAssembly = summaryStatisticsAssembly;
        this.readmeFile = readmeFile;
        this.cohort = cohort;
        this.cohortId = cohortId;
        this.agreedToCc0 = agreedToCc0;
        this.diseaseTrait = diseaseTrait;
        this.efoTraits = efoTraits;
        this.backgroundEfoTraits = backgroundEfoTraits;
        this.initialSampleDescription = initialSampleDescription;
        this.replicateSampleDescription = replicateSampleDescription;
        this.sumstatsFlag = sumstatsFlag;
        this.pooledFlag = pooledFlag;
        this.gxeFlag = gxeFlag;
        this.submissionId = submissionId;
        this.imputationPanel = imputationPanel;
        this.imputationSoftware = imputationSoftware;
        this.adjustedCovariates = adjustedCovariates;
        this.minor_allele_frequency_lower_limit = minor_allele_frequency_lower_limit;
        this.sex = sex;
        this.coordinateSystem = coordinateSystem;
        this.analysisSoftware = analysisSoftware;
    }


}
