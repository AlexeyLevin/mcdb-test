package ru.moex.api.document.model;

import lombok.*;
import ru.moex.api.core.model.ObjectType;

import javax.persistence.*;

@Data
@Entity
@Table
public class DocumentObjectLink {
    @Id@Column(name = "ID", nullable = false, precision = 0)
    private long id;
    @Basic@Column(name = "OBJECT_ID", nullable = false, precision = 0)
    private long objectId;
    @ManyToOne(fetch=FetchType.EAGER)@JoinColumn(name = "DOCUMENT_ID", referencedColumnName = "ID", nullable = false)
    private Document documentByDocumentId;
    @ManyToOne(fetch=FetchType.EAGER)@JoinColumn(name = "OBJECT_TYPE", referencedColumnName = "ID", nullable = false)
    private ObjectType objectTypeByObjectType;

}
