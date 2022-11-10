package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Donacion;

public interface DonacionRepository extends JpaRepository<Donacion, Long>{

}
