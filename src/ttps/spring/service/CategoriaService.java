package ttps.spring.service;

import org.springframework.beans.factory.annotation.Autowired;

import ttps.spring.model.Categoria;
import ttps.spring.repositories.CategoriaRepository;


public class CategoriaService {

	@Autowired
	 private CategoriaRepository categoriaRepository;
	
	 public Categoria create(Categoria categoria) {
		 // validaciones
		 return categoriaRepository.save(categoria);
	
	 }
}
