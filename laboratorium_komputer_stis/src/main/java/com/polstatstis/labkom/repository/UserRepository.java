package com.polstatstis.labkom.repository;

/**
 * @author Agape Bagus Rega Anggara (222212455)
 */
import com.polstatstis.labkom.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "user", path = "user")
public interface UserRepository extends JpaRepository<User,String>,PagingAndSortingRepository<User,String>,
CrudRepository<User,String> {
    public User findByNim(String nim);
}
