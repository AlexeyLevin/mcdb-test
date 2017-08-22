package ru.moex.api.core.entity.test;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "OBJECT_TYPE", schema = "ICDB", catalog = "")
public class ObjectType {
    @Id@Column(name = "ID", nullable = false, precision = 0)
    private long id;
    @Basic@Column(name = "NAME", nullable = true, length = 500)
    private String name;
    @Basic@Column(name = "DESCRIPTION", nullable = true, length = 500)
    private String description;
    @Basic@Column(name = "NOTE", nullable = true, length = 4000)
    private String note;
    @Basic@Column(name = "OLD_NAME", nullable = false, length = 100)
    private String oldName;

}
