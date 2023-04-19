package dev.domain;

import jakarta.persistence.*;

import java.util.Set;
@Entity
@Table(name = "md_language")
public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer language_id;

    @Column(unique = true, name = "language_wording")
    private String language_wording;

    public Language() {
    }

    public Language(Integer language_id, String language_wording) {
        this.language_id = language_id;
        this.language_wording = language_wording;
    }

    public Integer getLanguage_id() {
        return language_id;
    }

    public void setLanguage_id(Integer language_id) {
        this.language_id = language_id;
    }

    public String getLanguage_wording() {
        return language_wording;
    }

    public void setLanguage_wording(String language_wording) {
        this.language_wording = language_wording;
    }

    @Override
    public String toString() {
        return "Language{" +
                "language_id=" + language_id +
                ", language_wording='" + language_wording + '\'' +
                '}';
    }
}
