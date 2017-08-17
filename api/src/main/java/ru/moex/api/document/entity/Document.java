package ru.moex.api.document.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "DOCUMENT")
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DOCUMENT_TYPE_ID")
    private DocumentType documentType;
}
