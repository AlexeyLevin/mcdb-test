package ru.moex.api.document.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.moex.api.document.model.DocumentGroup;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "document_groups", path = "document_groups")
public interface DocumentGroupRepository extends JpaRepository<DocumentGroup, Long> {

    List<DocumentGroup> findByName(@Param("name") String name);

}
