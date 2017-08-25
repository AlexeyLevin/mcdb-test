package ru.moex.api.document.model;

import lombok.Data;
import ru.moex.api.core.model.ObjectType;
import ru.moex.api.core.model.Property;

import javax.persistence.*;

@Data
@Entity
@Table
public class DocumentTypeObjectTypeLink {
    @Id@Column(name = "ID", nullable = false, precision = 0)
    private long id;
    @Basic@Column(name = "IN_LIST", nullable = true, precision = 0)
    private Boolean inList;
    @Basic@Column(name = "REQUIRED", nullable = true, precision = 0)
    private Boolean required;
    @Basic@Column(name = "MULTIPLE", nullable = true, precision = 0)
    private Boolean multiple;
    @Basic@Column(name = "AUTOMATIC", nullable = true, precision = 0)
    private Boolean automatic;
    @Basic@Column(name = "OBJECT_REQUEST", nullable = true)
    private String objectRequest;
    @Basic@Column(name = "ORDER_STATE", nullable = true, precision = 0)
    private Long orderState;
    @Basic@Column(name = "ACTUAL", nullable = true, precision = 0)
    private Boolean actual;
    @ManyToOne(fetch=FetchType.EAGER)@JoinColumn(name = "DOCUMENT_TYPE", referencedColumnName = "ID", nullable = false)
    private DocumentType documentTypeByDocumentType;
    @ManyToOne(fetch= FetchType.EAGER)@JoinColumn(name = "OBJECT_DISPLAY", referencedColumnName = "ID", nullable = false)
    private Property propertyByObjectDisplay;
    @ManyToOne(fetch=FetchType.EAGER)@JoinColumn(name = "OBJECT_TYPE", referencedColumnName = "ID", nullable = false)
    private ObjectType objectTypeByObjectType;

}
