package ru.moex.api.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.moex.api.core.model.PropertyChange;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "property_changes", path = "property_changes")
public interface PropertyChangeRepository extends JpaRepository<PropertyChange, Long> {

    List<PropertyChange> findByDocumentId(@Param("documentId")long id);
}
