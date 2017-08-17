package ru.moex.api.document.entity;

import lombok.Data;
import ru.moex.api.property.entity.Property;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "DOCUMENT_ATTRIBUTE")
public class DocumentAttribute {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "DOCUMENT_TYPE_ID")
    private DocumentType documentType;

    @ManyToOne
    @JoinColumn(name = "PROPERTY_ID")
    private Property property;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "EDIT")
    private Boolean isEdit;
}
