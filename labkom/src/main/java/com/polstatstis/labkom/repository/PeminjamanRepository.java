package com.polstatstis.labkom.repository;

/**
 * @author Agape Bagus Rega Anggara (222212455)
 */

import com.polstatstis.labkom.entity.Peminjaman;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "peminjaman", path = "peminjaman")
public interface PeminjamanRepository extends PagingAndSortingRepository<Peminjaman,Long>,
CrudRepository<Peminjaman,Long>, JpaRepository<Peminjaman, Long>{
    
}
