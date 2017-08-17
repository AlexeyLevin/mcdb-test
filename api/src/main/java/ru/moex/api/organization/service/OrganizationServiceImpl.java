package ru.moex.api.organization.service;

import org.springframework.stereotype.Service;
import ru.moex.api.organization.entity.Organization;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
public class OrganizationServiceImpl implements OrganizationService {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void add(Organization organization) {

    }

    @Override
    public void delete(Organization organization) {

    }

    @Override
    public Organization update(Organization organization) {
        return null;
    }

    @Override
    public List<Organization> findAll(int page, int limit) {
        List<Organization> resultList = em.createQuery("select o from Organization o").getResultList();
        return resultList;
    }

    @Override
    public List<Organization> findAllByOrganizationGroupId(long id, int page, int limit) {
        return null;
    }

    @Override
    public Organization findById(long id) {
        return null;
    }

    @Override
    public Long totalCount() {
        return null;
    }
}
