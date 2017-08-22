package ru.moex.api.core.entity.test;

import lombok.*;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Market {
    @Id@Column(name = "ID", nullable = false, precision = 0)
    private long id;
    @Basic@Column(name = "NAME", nullable = false, length = 100)
    private String name;
    @Basic@Column(name = "CODE", nullable = true, length = 100)
    private String code;
    @Basic@Column(name = "TS_ID", nullable = true, length = 100)
    private String tsId;

}
