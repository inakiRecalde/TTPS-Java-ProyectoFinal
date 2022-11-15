package ttps.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ttps.spring.model.Categoria;
import ttps.spring.service.CategoriaService;


@RestController
@RequestMapping("/categoria")
public class CategoriaController {

	 @Autowired
	 private CategoriaService categoriaService;
	 
	 @PostMapping
	 public Categoria create(@RequestBody Categoria categoria) {
		 return categoriaService.create(categoria);
	 }
}
