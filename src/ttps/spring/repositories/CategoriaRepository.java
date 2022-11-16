package ttps.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ttps.spring.model.Categoria;


public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
