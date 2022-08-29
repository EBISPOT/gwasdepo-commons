package uk.ac.ebi.spot.gwas.deposition.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "associations")
@CompoundIndexes({@CompoundIndex(name = "asTag_sId", def = "{'studyTag': 1, 'submissionId': 1}")})
public class Association {

    @Id
    private String id;

    @Indexed
    private String studyTag;

    @Indexed
    private String submissionId;

    private String haplotypeId;

    private String variantId;

    private String pvalue;

    private String pvalueText;

    private String proxyVariant;

    private String effectAllele;

    private String otherAllele;

    private Double effectAlleleFrequency;

    private Double oddsRatio;

    private Double beta;

    private String betaUnit;

    private Double ciLower;

    private Double ciUpper;

    private Double standardError;

    private Boolean isValid;

    public Association() {

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

    public String getHaplotypeId() {
        return haplotypeId;
    }

    public void setHaplotypeId(String haplotypeId) {
        this.haplotypeId = haplotypeId;
    }

    public String getVariantId() {
        return variantId;
    }

    public void setVariantId(String variantId) {
        this.variantId = variantId;
    }

    public String getPvalue() {
        return pvalue;
    }

    public void setPvalue(String pvalue) {
        this.pvalue = pvalue;
    }

    public String getPvalueText() {
        return pvalueText;
    }

    public void setPvalueText(String pvalueText) {
        this.pvalueText = pvalueText;
    }

    public String getProxyVariant() {
        return proxyVariant;
    }

    public void setProxyVariant(String proxyVariant) {
        this.proxyVariant = proxyVariant;
    }

    public String getEffectAllele() {
        return effectAllele;
    }

    public void setEffectAllele(String effectAllele) {
        this.effectAllele = effectAllele;
    }

    public String getOtherAllele() {
        return otherAllele;
    }

    public void setOtherAllele(String otherAllele) {
        this.otherAllele = otherAllele;
    }

    public Double getEffectAlleleFrequency() {
        return effectAlleleFrequency;
    }

    public void setEffectAlleleFrequency(Double effectAlleleFrequency) {
        this.effectAlleleFrequency = effectAlleleFrequency;
    }

    public Double getOddsRatio() {
        return oddsRatio;
    }

    public void setOddsRatio(Double oddsRatio) {
        this.oddsRatio = oddsRatio;
    }

    public Double getBeta() {
        return beta;
    }

    public void setBeta(Double beta) {
        this.beta = beta;
    }

    public String getBetaUnit() {
        return betaUnit;
    }

    public void setBetaUnit(String betaUnit) {
        this.betaUnit = betaUnit;
    }

    public Double getCiLower() {
        return ciLower;
    }

    public void setCiLower(Double ciLower) {
        this.ciLower = ciLower;
    }

    public Double getCiUpper() {
        return ciUpper;
    }

    public void setCiUpper(Double ciUpper) {
        this.ciUpper = ciUpper;
    }

    public Double getStandardError() {
        return standardError;
    }

    public void setStandardError(Double standardError) {
        this.standardError = standardError;
    }

    public Boolean getValid() {
        return isValid;
    }

    public void setValid(Boolean valid) {
        isValid = valid;
    }
}
