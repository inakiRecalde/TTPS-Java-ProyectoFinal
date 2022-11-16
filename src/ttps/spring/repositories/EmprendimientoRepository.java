package ttps.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ttps.spring.model.Emprendimiento;


public interface EmprendimientoRepository extends JpaRepository<Emprendimiento, Long>{

}
