package uk.ac.ebi.spot.gwas.deposition.europmc;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class JournalInfo {

   @JsonProperty("journal")
   private Journal journal;

   @JsonProperty("printPublicationDate")
   private String printPublicationDate;

   public JournalInfo(@JsonProperty("journal") Journal journal,
                      @JsonProperty("printPublicationDate") String printPublicationDate) {
      this.journal = journal;
      this.printPublicationDate = printPublicationDate;
   }

   public Journal getJournal() {
      return journal;
   }

   public void setJournal(Journal journal) {
      this.journal = journal;
   }

   public String getPrintPublicationDate() {
      return printPublicationDate;
   }

   public void setPrintPublicationDate(String printPublicationDate) {
      this.printPublicationDate = printPublicationDate;
   }
}
