package ru.moex.api.organization.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "ORGANIZATION_GROUP_LINK")
public class OrganizationGroupLink {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ORGANIZATION_ID")
    private Organization organization;

    @ManyToOne
    @JoinColumn(name = "ORGANIZATION_GROUP_ID")
    private OrganizationGroup organizationGroup;

}
