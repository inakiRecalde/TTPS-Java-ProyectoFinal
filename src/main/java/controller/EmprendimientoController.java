package controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Emprendimiento;
import service.EmprendimientoService;

@RestController
@RequestMapping("/emprendimiento")
public class EmprendimientoController {

	
	 @Autowired
	 private EmprendimientoService emprendimientoService;
	 
	 @PostMapping
	 public Emprendimiento create(@RequestBody Emprendimiento emprendimiento) {
		 return emprendimientoService.create(emprendimiento);
	 }
	 
	 @GetMapping
	 public Optional<Emprendimiento> buscarPorId(@RequestBody long id) {
		 return emprendimientoService.getById(id);
	 }
	 
	 @PutMapping(value = "/{nombre}")
	 public Emprendimiento update(@RequestBody Emprendimiento emprendimiento,@PathVariable("nombre") String nombre) {
		 emprendimiento.setNombre(nombre);
		 return this.emprendimientoService.update(emprendimiento);
	}

	 
}
