package ru.moex.api.core.model;

import lombok.Data;
import ru.moex.api.document.model.DocumentGroup;
import ru.moex.api.document.model.DocumentObjectLink;
import ru.moex.api.document.model.DocumentTypeObjectTypeLink;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Collection;

@Data
@Entity
@Table(name = "OBJECT_TYPE")
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

    @OneToMany(mappedBy = "objectTypeByObjectTypeTreeOfRoot")
    private Collection<DocumentGroup> documentGroupsById;
    @OneToMany(mappedBy = "objectTypeByObjectType")
    private Collection<DocumentObjectLink> documentObjectLinksById;
    @OneToMany(mappedBy = "objectTypeByObjectType")
    private Collection<DocumentTypeObjectTypeLink> documentTypeObjectTypeLinksById;
    @OneToMany(mappedBy = "objectTypeByObjectType")
    private Collection<Property> propertiesById;
    @OneToMany(mappedBy = "objectTypeByObjectType")
    private Collection<PropertyChange> propertyChangesById;

}
