package ttps.spring.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Donacion;

public interface DonacionRepository extends JpaRepository<Donacion, Long>{

	List<Donacion> findByEmprendimiento(Long id);
}
