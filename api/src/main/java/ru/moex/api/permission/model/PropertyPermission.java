package ru.moex.api.permission.model;

import lombok.Data;
import ru.moex.api.core.model.Property;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "PROPERTY_PERMISSION"/*, schema = "ICDB", catalog = ""*/)
public class PropertyPermission {
    @Id
    private long id;
    @Basic@Column(name = "ROLE_NAME", nullable = false, length = 500)
    private String roleName;
    @Basic@Column(name = "PERMISSION", nullable = false, length = 500)
    private String permission;
    @Basic@Column(name = "PERMISSION_OLD", nullable = true, length = 500)
    private String permissionOld;
    @ManyToOne@JoinColumn(name = "PROPERTY_ID", referencedColumnName = "ID")
    private Property propertyByPropertyId;
    @ManyToOne@JoinColumn(name = "PROPERTY_ACTION", referencedColumnName = "ID", nullable = false)
    private PropertyAction propertyActionByPropertyAction;

}
