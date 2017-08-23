package ru.moex.api.core.model;

import lombok.Data;
import ru.moex.api.document.model.DocumentAttribute;

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
@Table(name = "PROPERTY")
public class Property {
    @Id@Column(name = "ID", nullable = false, precision = 0)
    private long id;
    @Basic@Column(name = "NAME", nullable = false, length = 100)
    private String name;
    @Basic@Column(name = "DESCRIPTION", nullable = true, length = 500)
    private String description;
    @Basic@Column(name = "PROPERTY_SIZE", nullable = true, precision = 0)
    private Long propertySize;
    @Basic@Column(name = "PROPERTY_GROUP", nullable = true, length = 500)
    private String propertyGroup;
    @Basic@Column(name = "NOTE", nullable = true, length = 1500)
    private String note;
    @Basic@Column(name = "REQUIRED", nullable = false, precision = 0)
    private long required;
    @Basic@Column(name = "VALUE_FUNCTION", nullable = true, length = 100)
    private String valueFunction;
    @Basic@Column(name = "CONTROLLED", nullable = true, precision = 0)
    private Long controlled;
    @Basic@Column(name = "OLD_NAME", nullable = false, length = 100)
    private String oldName;
    @Basic@Column(name = "USING_VIEW", nullable = true, precision = 0)
    private Boolean usingView;
    @ManyToOne@JoinColumn(name = "REFERENCE_PROPERTY", referencedColumnName = "ID")
    private Property propertyByReferenceProperty;
    @OneToMany(mappedBy = "propertyByProperty")
    private Collection<DocumentAttribute> documentAttributesById;
    @ManyToOne@JoinColumn(name = "OBJECT_TYPE", referencedColumnName = "ID", nullable = false)
    private ObjectType objectTypeByObjectType;
}
