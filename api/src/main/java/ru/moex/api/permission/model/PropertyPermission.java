package ru.moex.api.permission.model;

import lombok.Data;
import ru.moex.api.core.model.Property;

import javax.persistence.*;

@Data
@Entity
@Table
public class PropertyPermission {
    @Id
    private long id;
    @Basic@Column(name = "ROLE_NAME", nullable = false, length = 500)
    private String roleName;
    @Basic@Column(name = "PERMISSION", nullable = false, length = 500)
    private String permission;
    @Basic@Column(name = "PERMISSION_OLD", nullable = true, length = 500)
    private String permissionOld;
    @ManyToOne(fetch= FetchType.EAGER)@JoinColumn(name = "PROPERTY_ID", referencedColumnName = "ID")
    private Property property;
    @ManyToOne(fetch=FetchType.EAGER)@JoinColumn(name = "PROPERTY_ACTION", referencedColumnName = "ID", nullable = false)
    private PropertyAction propertyAction;

}
