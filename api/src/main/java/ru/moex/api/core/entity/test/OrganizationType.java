package ru.moex.api.core.entity.test;

import lombok.Data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "ORGANIZATION_TYPE", schema = "ICDB", catalog = "")
public class OrganizationType {
    @Id
    @Column(name = "ID", nullable = false, precision = 0)
    private long id;
    @Basic
    @Column(name = "NAME", nullable = true, length = 50)
    private String name;
}
