package ru.moex.api.organization.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "ORGANIZATION_GROUP")
public class OrganizationGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "NAME")
    private String name;

}
