package ru.moex.api.core.entity.test;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "DOCUMENT_OBJECT_LINK", schema = "ICDB", catalog = "")
public class DocumentObjectLink {
    @Id@Column(name = "ID", nullable = false, precision = 0)
    private long id;
    @Basic@Column(name = "OBJECT_ID", nullable = false, precision = 0)
    private long objectId;
    @ManyToOne@JoinColumn(name = "DOCUMENT_ID", referencedColumnName = "ID", nullable = false)
    private Document documentByDocumentId;
    @ManyToOne@JoinColumn(name = "OBJECT_TYPE", referencedColumnName = "ID", nullable = false)
    private ObjectType objectTypeByObjectType;

}
