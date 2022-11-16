package ttps.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ttps.spring.model.Rol;

@Repository
public interface RolRepository extends JpaRepository<Rol, Long>{

}
