package ru.moex.api.documentType.entity;

import javax.persistence.*;

@Entity
@Table(name = "DOCUMENT_TYPES")
public class DocumentType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "NAME")
    private String name;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
