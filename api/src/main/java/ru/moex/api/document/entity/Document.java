package ru.moex.api.document.entity;

import ru.moex.api.documentType.entity.DocumentType;

import javax.persistence.*;

@Entity
@Table(name = "DOCUMENT")
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JoinColumn(name = "DOCUMENT_TYPE_ID")
    private DocumentType documentType;

    public Long getId() {
        return id;
    }

    public DocumentType getDocumentType() {
        return documentType;
    }

    public void setDocumentType(DocumentType documentType) {
        this.documentType = documentType;
    }
}
