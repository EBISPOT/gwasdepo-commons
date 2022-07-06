package uk.ac.ebi.spot.gwas.deposition.domain;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "diseaseTraits")
public class DiseaseTrait {

    @Id
    private String id;

    @Indexed(unique = true)
    private String trait;


    private Provenance created;

    private Provenance updated;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getTrait() {
        return trait;
    }

    public void setTrait(String trait) {
        this.trait = trait;
    }

    public Provenance getCreated() {
        return created;
    }

    public void setCreated(Provenance created) {
        this.created = created;
    }

    public Provenance getUpdated() {
        return updated;
    }

    public void setUpdated(Provenance updated) {
        this.updated = updated;
    }
}
