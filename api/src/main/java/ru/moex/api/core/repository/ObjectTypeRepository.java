package ru.moex.api.core.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.moex.api.core.model.ObjectType;

@RepositoryRestResource(collectionResourceRel = "object_types", path = "object_types")
public interface ObjectTypeRepository extends JpaRepository<ObjectType, Long> {

    ObjectType findOneByName(@Param("name") String name);

}
