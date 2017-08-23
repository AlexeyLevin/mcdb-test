package ru.moex.api.document.model;

import lombok.Data;
import ru.moex.api.core.model.ObjectType;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Collection;

@Data
@Entity
@Table(name = "DOCUMENT_GROUP")
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

    @OneToMany(mappedBy = "documentGroupByParentGroup")
    private Collection<DocumentGroup> documentGroupsById;
    @OneToMany(mappedBy = "documentGroupByDocumentGroup")
    private Collection<DocumentTypeGroupLink> documentTypeGroupLinksById;

}
