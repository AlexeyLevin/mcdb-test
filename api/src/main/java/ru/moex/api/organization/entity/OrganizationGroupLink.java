package ru.moex.api.organization.entity;

import javax.persistence.*;

@Entity
@Table(name = "ORGANIZATION_GROUP_LINK")
public class OrganizationGroupLink {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JoinColumn(name = "ORGANIZATION_ID")
    private Organization organization;

    @JoinColumn(name = "ORGANIZATION_GROUP")
    private OrganizationGroup organizationGroup;

    public Long getId() {
        return id;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public OrganizationGroup getOrganizationGroup() {
        return organizationGroup;
    }

    public void setOrganizationGroup(OrganizationGroup organizationGroup) {
        this.organizationGroup = organizationGroup;
    }
}
