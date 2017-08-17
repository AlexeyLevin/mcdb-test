package ru.moex.api.property.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "PROPERTY")
public class Property {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @OneToOne
    @JoinColumn(name = "DATA_TYPE_ID")
    private DataType dataType;
}
