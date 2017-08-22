package ru.moex.api.core.entity.test;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "DOCUMENT_TYPE_GROUP_LINK", schema = "ICDB", catalog = "")
public class DocumentTypeGroupLink {
    @Id@Column(name = "ID", nullable = false, precision = 0)
    private long id;
    @Basic@Column(name = "ORDER_STATE", nullable = false, precision = 0)
    private long orderState;
    @ManyToOne@JoinColumn(name = "DOCUMENT_TYPE", referencedColumnName = "ID", nullable = false)
    private DocumentType documentTypeByDocumentType;

}
