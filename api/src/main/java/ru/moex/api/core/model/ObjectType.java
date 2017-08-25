package ru.moex.api.core.model;

import lombok.Data;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import ru.moex.api.document.model.DocumentGroup;
import ru.moex.api.document.model.DocumentObjectLink;
import ru.moex.api.document.model.DocumentTypeObjectTypeLink;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@Data
@Entity
@Table
public class ObjectType {
    @Id@Column(name = "ID", nullable = false, precision = 0)
    private long id;
    @Basic@Column(name = "NAME", nullable = true, length = 500)
    private String name;
    @Basic@Column(name = "DESCRIPTION", nullable = true, length = 500)
    private String description;
    @Basic@Column(name = "NOTE", nullable = true, length = 4000)
    private String note;
    @Basic@Column(name = "OLD_NAME", nullable = false, length = 100)
    private String oldName;
    @OneToMany(mappedBy = "objectTypeByObjectTypeTreeOfRoot", fetch=FetchType.EAGER)
    private Set<DocumentGroup> documentGroupsById;
    @OneToMany(mappedBy = "objectTypeByObjectType", fetch=FetchType.EAGER)
    private Collection<DocumentObjectLink> documentObjectLinksById;
    @OneToMany(mappedBy = "objectTypeByObjectType", fetch=FetchType.EAGER)
    private Set<DocumentTypeObjectTypeLink> documentTypeObjectTypeLinksById;
    @ManyToMany(mappedBy = "objectTypeByObjectType", fetch=FetchType.EAGER)
    private Collection<Property> propertiesById;
    @OneToMany(mappedBy = "objectTypeByObjectType", fetch=FetchType.EAGER)
    private Collection<PropertyChange> propertyChangesById;
}
