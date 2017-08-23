package ru.moex.api.organization.model;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "MARKET")
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
