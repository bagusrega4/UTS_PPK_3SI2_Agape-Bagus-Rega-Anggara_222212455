package com.polstatstis.labkom.repository;

/**
 * @author Agape Bagus Rega Anggara (222212455)
 */

import com.polstatstis.labkom.entity.Laboratorium;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "laboratorium", path = "laboratorium")
public interface LaboratoriumRepository extends PagingAndSortingRepository<Laboratorium, Long>, CrudRepository<Laboratorium, Long>, JpaRepository<Laboratorium, Long>{
    
}
