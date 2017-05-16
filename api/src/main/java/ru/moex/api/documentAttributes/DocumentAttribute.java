package ru.moex.api.documentAttributes;

import ru.moex.api.documentType.entity.DocumentType;
import ru.moex.api.property.entity.Property;

import javax.persistence.*;

@Entity
@Table(name = "DOCUMENT_ATTRIBUTE")
public class DocumentAttribute {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JoinColumn(name = "DOCUMENT_TYPE_ID")
    private DocumentType documentType;

    @JoinColumn(name = "PROPERTY")
    private Property property;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "EDIT")
    private Boolean isEdit;
}
