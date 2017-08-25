package ru.moex.api.document.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.moex.api.document.model.DocumentType;

@RepositoryRestResource(collectionResourceRel = "document_types", path = "document_types")
public interface DocumentTypeRepository extends JpaRepository<DocumentType, Long> {

    DocumentType findOneByName(@Param("name") String name);

}
