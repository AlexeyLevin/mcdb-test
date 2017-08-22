package ru.moex.api.core.entity.test;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "OBJECT_KIND", schema = "ICDB", catalog = "")
public class ObjectKind {
    @Id@Column(name = "ID", nullable = false, precision = 0)
    private long id;
    @Basic@Column(name = "NAME", nullable = true, length = 70)
    private String name;

}
