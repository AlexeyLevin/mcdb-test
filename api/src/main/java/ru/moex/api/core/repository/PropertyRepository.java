package ru.moex.api.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.moex.api.core.model.Property;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "properties", path = "propert")
public interface PropertyRepository extends JpaRepository<Property, Long> {

    List<Property> findByName(@Param("name") String name);

}
