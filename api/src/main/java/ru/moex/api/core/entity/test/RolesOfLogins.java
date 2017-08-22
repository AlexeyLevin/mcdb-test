package ru.moex.api.core.entity.test;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "ROLES_OF_LOGINS", schema = "ICDB", catalog = "")
public class RolesOfLogins {
    @Id
    private String id;
    @Basic@Column(name = "ROLE_ID", nullable = true, precision = 0)
    private Long roleId;
    @Basic@Column(name = "ROLE_NAME", nullable = true, length = 128)
    private String roleName;
    @Basic@Column(name = "LOGIN", nullable = true, length = 100)
    private String login;
    @Basic@Column(name = "EMPLOYEE_ID", nullable = false, precision = 0)
    private long employeeId;
    @Basic@Column(name = "FIRED", nullable = true, precision = 0)
    private Long fired;

}
