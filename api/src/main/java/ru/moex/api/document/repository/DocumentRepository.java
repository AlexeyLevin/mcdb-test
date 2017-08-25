package ru.moex.api.document.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.moex.api.core.model.Property;
import ru.moex.api.document.model.Document;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "documents", path = "documents")
public interface DocumentRepository extends JpaRepository<Document, Long> {

    List<Document> findByDocumentTypeByDocumentTypeName(@Param("name") String name);

}
