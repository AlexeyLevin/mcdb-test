package ru.moex.api.permission.model;

import lombok.Data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table
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
