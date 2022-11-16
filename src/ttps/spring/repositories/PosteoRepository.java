package ttps.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ttps.spring.model.Posteo;

@Repository
public interface PosteoRepository extends JpaRepository<Posteo, Long>{

}
