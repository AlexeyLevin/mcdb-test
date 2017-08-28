package ru.moex.api.permission.model;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table
public class ObjectAction {
    @Id@Column(name = "ID", nullable = false, precision = 0)
    private long id;
    @Basic@Column(name = "NAME", nullable = true, length = 50)
    private String name;

}
