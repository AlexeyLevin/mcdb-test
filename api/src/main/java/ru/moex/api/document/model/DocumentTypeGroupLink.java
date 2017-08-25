package ru.moex.api.document.model;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table
public class DocumentTypeGroupLink {
    @Id@Column(name = "ID", nullable = false, precision = 0)
    private long id;
    @Basic@Column(name = "ORDER_STATE", nullable = false, precision = 0)
    private long orderState;
    @ManyToOne(fetch=FetchType.EAGER)@JoinColumn(name = "DOCUMENT_TYPE", referencedColumnName = "ID", nullable = false)
    private DocumentType documentTypeByDocumentType;
    @ManyToOne(fetch=FetchType.EAGER)@JoinColumn(name = "DOCUMENT_GROUP", referencedColumnName = "ID", nullable = false)
    private DocumentGroup documentGroupByDocumentGroup;

}
