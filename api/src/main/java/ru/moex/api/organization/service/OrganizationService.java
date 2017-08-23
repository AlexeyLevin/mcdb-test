package ru.moex.api.organization.service;

import ru.moex.api.organization.model.Organization;

import java.util.List;

public interface OrganizationService {
    void add(Organization organization);
    void delete(Organization organization);
    Organization update(Organization organization);
    List<Organization> findAll(int page, int limit);
    List<Organization> findAllByOrganizationGroupId(long id, int page, int limit);
    Organization findById(long id);
    Long totalCount();
}
