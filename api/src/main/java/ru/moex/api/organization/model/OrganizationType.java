package ru.moex.api.organization.model;

import lombok.Data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table
public class OrganizationType {
    @Id
    @Column(name = "ID", nullable = false, precision = 0)
    private long id;
    @Basic
    @Column(name = "NAME", nullable = true, length = 50)
    private String name;
}
