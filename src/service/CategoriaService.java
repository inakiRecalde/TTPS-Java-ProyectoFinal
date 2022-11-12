package service;

import org.springframework.beans.factory.annotation.Autowired;

import model.Categoria;
import repositories.CategoriaRepository;


public class CategoriaService {

	@Autowired
	 private CategoriaRepository categoriaRepository;
	
	 public Categoria create(Categoria categoria) {
		 // validaciones
		 return categoriaRepository.save(categoria);
	
	 }
}
