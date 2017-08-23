package ru.moex.api.document.model;

import lombok.Data;
import ru.moex.api.core.model.Property;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "DOCUMENT_ATTRIBUTE")
public class DocumentAttribute {
    @Id@Column(name = "ID", nullable = false, precision = 0)
    private long id;
    @Basic@Column(name = "REQUIRED", nullable = true, precision = 0)
    private Boolean required;
    @Basic@Column(name = "AUTOMATIC", nullable = true, precision = 0)
    private Boolean automatic;
    @Basic@Column(name = "EDIT", nullable = true, precision = 0)
    private Boolean edit;
    @Basic@Column(name = "TITLE", nullable = true, length = 150)
    private String title;
    @Basic@Column(name = "ORDER_STATE", nullable = true, precision = 0)
    private Long orderState;
    @Basic@Column(name = "VISIBLE", nullable = false, precision = 0)
    private boolean visible;
    @Basic@Column(name = "OBJECT_REQUEST", nullable = true)
    private String objectRequest;

    @ManyToOne@JoinColumn(name = "DOCUMENT_TYPE", referencedColumnName = "ID", nullable = false)
    private DocumentType documentTypeByDocumentType;
    @ManyToOne@JoinColumn(name = "PROPERTY", referencedColumnName = "ID", nullable = false)
    private Property propertyByProperty;

}
