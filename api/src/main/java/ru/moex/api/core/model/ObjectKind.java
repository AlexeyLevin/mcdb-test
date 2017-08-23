package ru.moex.api.core.model;

import lombok.Data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "OBJECT_KIND")
public class ObjectKind {
    @Id@Column(name = "ID", nullable = false, precision = 0)
    private long id;
    @Basic@Column(name = "NAME", nullable = true, length = 70)
    private String name;

}
