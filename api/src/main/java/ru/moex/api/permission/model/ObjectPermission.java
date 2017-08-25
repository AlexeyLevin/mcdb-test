package ru.moex.api.permission.model;

import lombok.*;
import ru.moex.api.core.model.ObjectType;

import javax.persistence.*;

@Data
@Entity
@Table(name = "OBJECT_PERMISSION"/*, schema = "ICDB", catalog = ""*/)
public class ObjectPermission {
    @Id@GeneratedValue
    private Long id;
    @Basic@Column(name = "ROLE_NAME", nullable = false, length = 100)
    private String roleName;
    @Basic@Column(name = "PERMISSION", nullable = false, length = 500)
    private String permission;
    @Basic@Column(name = "PERMISSION_OLD", nullable = true, length = 500)
    private String permissionOld;
    @ManyToOne(fetch=FetchType.EAGER)@JoinColumn(name = "OBJECT_TYPE", referencedColumnName = "ID")
    private ObjectType objectTypeByObjectType;
    @ManyToOne(fetch=FetchType.EAGER)@JoinColumn(name = "OBJECT_ACTION", referencedColumnName = "ID", nullable = false)
    private ObjectAction objectActionByObjectAction;

}
