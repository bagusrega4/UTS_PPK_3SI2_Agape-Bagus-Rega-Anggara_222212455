package com.polstatstis.labkom.repository;

/**
 * @author Agape Bagus Rega Anggara (222212455)
 */

import com.polstatstis.labkom.entity.Komputer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "komputer", path = "komputer")
public interface KomputerRepository extends PagingAndSortingRepository<Komputer,Long>,
CrudRepository<Komputer,Long>, JpaRepository<Komputer, Long>{
    
}
