package uk.ac.ebi.spot.gwas.deposition.domain;

import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode
@Document(collection = "users")
public class User {

    @Id
    private String id;

    private String name;

    private String nickname;

    private String userReference;

    private List<String> domains;

    @Indexed
    private String email;

    public User() {
        this.domains = new ArrayList<>();
    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
        this.domains = new ArrayList<>();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserReference() {
        return userReference;
    }

    public void setUserReference(String userReference) {
        this.userReference = userReference;
    }

    @Override
    public String toString() {
        return name + " (" + email + "): " + domains;
    }
}
