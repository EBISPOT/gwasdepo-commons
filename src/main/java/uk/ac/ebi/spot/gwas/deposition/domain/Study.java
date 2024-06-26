package uk.ac.ebi.spot.gwas.deposition.domain;

//import com.querydsl.core.annotations.QueryEntity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;
//@QueryEntity
@Document(collection = "studies")
public class Study {

    @Id
    private String id;

    @Indexed
    private String studyTag;

    @Indexed
    private String submissionId;

    @Indexed
    private List<String> pmids;

    @Indexed
    private String accession;

    @Indexed
    private String diseaseTrait;

    private String genotypingTechnology;

    private String arrayManufacturer;

    private String arrayInformation;

    private Boolean imputation;

    private Integer variantCount;

    private String statisticalModel;

    private String studyDescription;

    private String trait;

    private String sampleDescription;

    private String efoTrait;

    private String backgroundTrait;

    @Indexed
    private List<String> backgroundEfoTraits;

    private String backgroundEfoTrait;

    @Indexed
    private List<String> efoTraits;

    private String summaryStatisticsFile;

    private String rawFilePath;

    private String checksum;

    private String summaryStatisticsAssembly;

    private String readmeFile;

    private String cohort;

    private String cohortId;

    @Indexed
    private List<String> bodyOfWorkList;

    private Boolean agreedToCc0;

    private String initialSampleDescription;

    private String replicateSampleDescription;

    private Boolean sumstatsFlag;

    private Boolean pooledFlag;

    private Boolean gxeFlag;

    private String imputationPanel;

    private String imputationSoftware;

    private String adjustedCovariates;

    private Boolean neg_log_p_value;

    private Double effect_allele_frequency_lower_limit;

    private String sex;

    private String coordinateSystem;

    private String analysisSoftware;


    public Study() {
        bodyOfWorkList = new ArrayList<>();
        pmids = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSubmissionId() {
        return submissionId;
    }

    public void setSubmissionId(String submissionId) {
        this.submissionId = submissionId;
    }

    public String getStudyTag() {
        return studyTag;
    }

    public void setStudyTag(String studyTag) {
        this.studyTag = studyTag;
    }

    public String getGenotypingTechnology() {
        return genotypingTechnology;
    }

    public void setGenotypingTechnology(String genotypingTechnology) {
        this.genotypingTechnology = genotypingTechnology;
    }

    public String getArrayManufacturer() {
        return arrayManufacturer;
    }

    public void setArrayManufacturer(String arrayManufacturer) {
        this.arrayManufacturer = arrayManufacturer;
    }

    public String getArrayInformation() {
        return arrayInformation;
    }

    public void setArrayInformation(String arrayInformation) {
        this.arrayInformation = arrayInformation;
    }

    public Boolean getImputation() {
        return imputation;
    }

    public void setImputation(Boolean imputation) {
        this.imputation = imputation;
    }

    public Integer getVariantCount() {
        return variantCount;
    }

    public void setVariantCount(Integer variantCount) {
        this.variantCount = variantCount;
    }

    public String getStatisticalModel() {
        return statisticalModel;
    }

    public void setStatisticalModel(String statisticalModel) {
        this.statisticalModel = statisticalModel;
    }

    public String getStudyDescription() {
        return studyDescription;
    }

    public void setStudyDescription(String studyDescription) {
        this.studyDescription = studyDescription;
    }

    public String getTrait() {
        return trait;
    }

    public void setTrait(String trait) {
        this.trait = trait;
    }

    public String getEfoTrait() {
        return efoTrait;
    }

    public void setEfoTrait(String efoTrait) {
        this.efoTrait = efoTrait;
    }

    public String getBackgroundTrait() {
        return backgroundTrait;
    }

    public void setBackgroundTrait(String backgroundTrait) {
        this.backgroundTrait = backgroundTrait;
    }

    public String getBackgroundEfoTrait() {
        return backgroundEfoTrait;
    }

    public void setBackgroundEfoTrait(String backgroundEfoTrait) {
        this.backgroundEfoTrait = backgroundEfoTrait;
    }

    public String getSummaryStatisticsFile() {
        return summaryStatisticsFile;
    }

    public void setSummaryStatisticsFile(String summaryStatisticsFile) {
        this.summaryStatisticsFile = summaryStatisticsFile;
    }

    public String getSummaryStatisticsAssembly() {
        return summaryStatisticsAssembly;
    }

    public void setSummaryStatisticsAssembly(String summaryStatisticsAssembly) {
        this.summaryStatisticsAssembly = summaryStatisticsAssembly;
    }

    public String getChecksum() {
        return checksum;
    }

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    public String getAccession() {
        return accession;
    }

    public void setAccession(String accession) {
        this.accession = accession;
    }

    public String getSampleDescription() {
        return sampleDescription;
    }

    public void setSampleDescription(String sampleDescription) {
        this.sampleDescription = sampleDescription;
    }

    public String getCohort() {
        return cohort;
    }

    public void setCohort(String cohort) {
        this.cohort = cohort;
    }

    public String getCohortId() {
        return cohortId;
    }

    public void setCohortId(String cohortId) {
        this.cohortId = cohortId;
    }

    public String getReadmeFile() {
        return readmeFile;
    }

    public void setReadmeFile(String readmeFile) {
        this.readmeFile = readmeFile;
    }

    public List<String> getBodyOfWorkList() {
        return bodyOfWorkList;
    }

    public void setBodyOfWorkList(List<String> bodyOfWorkList) {
        this.bodyOfWorkList = bodyOfWorkList;
    }

    public List<String> getPmids() {
        return pmids;
    }

    public void setPmids(List<String> pmids) {
        this.pmids = pmids;
    }

    public String getRawFilePath() {
        return rawFilePath;
    }

    public void setRawFilePath(String rawFilePath) {
        this.rawFilePath = rawFilePath;
    }

    public Boolean isAgreedToCc0() {
        return agreedToCc0;
    }

    public void setAgreedToCc0(Boolean agreedToCc0) {
        this.agreedToCc0 = agreedToCc0;
    }


    public String getDiseaseTrait() {
        return diseaseTrait;
    }

    public void setDiseaseTrait(String diseaseTrait) {
        this.diseaseTrait = diseaseTrait;
    }

    public List<String> getEfoTraits() { return efoTraits; }

    public void setEfoTraits(List<String> efoTraits) { this.efoTraits = efoTraits; }

    public List<String> getBackgroundEfoTraits() { return backgroundEfoTraits; }

    public void setBackgroundEfoTraits(List<String> backgroundEfoTraits) { this.backgroundEfoTraits = backgroundEfoTraits; }

    public String getInitialSampleDescription() {
        return initialSampleDescription;
    }

    public void setInitialSampleDescription(String initialSampleDescription) {
        this.initialSampleDescription = initialSampleDescription;
    }

    public String getReplicateSampleDescription() {
        return replicateSampleDescription;
    }

    public void setReplicateSampleDescription(String replicateSampleDescription) {
        this.replicateSampleDescription = replicateSampleDescription;
    }

    public Boolean getSumstatsFlag() {
        return sumstatsFlag;
    }

    public void setSumstatsFlag(Boolean sumstatsFlag) {
        this.sumstatsFlag = sumstatsFlag;
    }

    public Boolean getPooledFlag() {
        return pooledFlag;
    }

    public void setPooledFlag(Boolean pooledFlag) {
        this.pooledFlag = pooledFlag;
    }

    public Boolean getGxeFlag() {
        return gxeFlag;
    }

    public void setGxeFlag(Boolean gxeFlag) {
        this.gxeFlag = gxeFlag;
    }

    public String getImputationPanel() {
        return imputationPanel;
    }

    public void setImputationPanel(String imputationPanel) {
        this.imputationPanel = imputationPanel;
    }

    public String getImputationSoftware() {
        return imputationSoftware;
    }

    public void setImputationSoftware(String imputationSoftware) {
        this.imputationSoftware = imputationSoftware;
    }

    public String getAdjustedCovariates() {
        return adjustedCovariates;
    }

    public void setAdjustedCovariates(String adjustedCovariates) {
        this.adjustedCovariates = adjustedCovariates;
    }

    public Boolean getNeg_log_p_value() {
        return neg_log_p_value;
    }

    public void setNeg_log_p_value(Boolean neg_log_p_value) {
        this.neg_log_p_value = neg_log_p_value;
    }

    public Double getEffect_allele_frequency_lower_limit() {
        return effect_allele_frequency_lower_limit;
    }

    public void setEffect_allele_frequency_lower_limit(Double effect_allele_frequency_lower_limit) {
        this.effect_allele_frequency_lower_limit = effect_allele_frequency_lower_limit;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCoordinateSystem() {
        return coordinateSystem;
    }

    public void setCoordinateSystem(String coordinateSystem) {
        this.coordinateSystem = coordinateSystem;
    }

    public String getAnalysisSoftware() {
        return analysisSoftware;
    }

    public void setAnalysisSoftware(String analysisSoftware) {
        this.analysisSoftware = analysisSoftware;
    }
}
