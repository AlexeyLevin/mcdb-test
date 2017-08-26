package ru.moex.api.document.model;

import lombok.Data;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import ru.moex.api.core.model.ObjectType;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@Data
@Entity
@Table
public class DocumentGroup {
    @Id@Column(name = "ID", nullable = false, precision = 0)
    private long id;
    @Basic@Column(name = "NAME", nullable = true, length = 500)
    private String name;
    @Basic@Column(name = "ORDER_STATE", nullable = true, precision = 0)
    private Long orderState;
    @ManyToOne(fetch=FetchType.EAGER)@JoinColumn(name = "PARENT_GROUP", referencedColumnName = "ID")
    private DocumentGroup parentGroup;
    @ManyToOne(fetch=FetchType.EAGER)@JoinColumn(name = "OBJECT_TYPE_TREE_OF_ROOT", referencedColumnName = "ID")
    private ObjectType objectTypeTreeOfRoot;
    @OneToMany(mappedBy = "parentGroup", fetch= FetchType.EAGER)
    private Collection<DocumentGroup> documentGroups;
    @OneToMany(mappedBy = "documentGroup", fetch=FetchType.EAGER)
    private Collection<DocumentTypeGroupLink> documentTypeGroupLinks;

}
