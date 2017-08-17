package ru.moex.api.property.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "DATA_TYPE")
public class DataType {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String description;
}
