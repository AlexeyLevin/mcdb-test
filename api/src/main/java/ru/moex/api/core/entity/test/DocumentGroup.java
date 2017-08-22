package ru.moex.api.core.entity.test;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "DOCUMENT_GROUP", schema = "ICDB", catalog = "")
public class DocumentGroup {
    @Id@Column(name = "ID", nullable = false, precision = 0)
    private long id;
    @Basic@Column(name = "NAME", nullable = true, length = 500)
    private String name;
    @Basic@Column(name = "ORDER_STATE", nullable = true, precision = 0)
    private Long orderState;
    @ManyToOne@JoinColumn(name = "PARENT_GROUP", referencedColumnName = "ID")
    private DocumentGroup documentGroupByParentGroup;
    @ManyToOne@JoinColumn(name = "OBJECT_TYPE_TREE_OF_ROOT", referencedColumnName = "ID")
    private ObjectType objectTypeByObjectTypeTreeOfRoot;

}
