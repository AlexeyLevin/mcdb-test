package ru.moex.api.permission.model;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "ROLES")
public class Roles {
    @Id
    private long id;
    @Basic@Column(name = "NAME", nullable = false, length = 128)
    private String name;
    @Basic@Column(name = "CAPTION", nullable = false, length = 200)
    private String caption;
    @Basic@Column(name = "MSSQL_ID", nullable = false, precision = 0)
    private long mssqlId;
    @Basic@Column(name = "READ_INFO", nullable = true, length = 4000)
    private String readInfo;
    @Basic@Column(name = "WRITE_INFO", nullable = true, length = 4000)
    private String writeInfo;

}
