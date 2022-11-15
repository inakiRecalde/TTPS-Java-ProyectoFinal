package ttps.spring.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ttps.spring.model.Emprendimiento;
import ttps.spring.service.EmprendimientoService;


@RestController
@RequestMapping("/emprendimiento")
public class EmprendimientoController {

	
	 @Autowired
	 private EmprendimientoService emprendimientoService;
	 
	 //crear emprendimiento
	 @PostMapping("/create")
	 public  ResponseEntity<Emprendimiento> create(@RequestParam String dominio, @RequestParam String password) {
		 System.out.println("entro create");
		 Emprendimiento emprendimiento = emprendimientoService.create(dominio, password);
		 return new ResponseEntity<Emprendimiento>(emprendimiento, HttpStatus.CREATED);
	 }
	 
	 //Recupero todos los emprendimientos
	 @GetMapping("/listar")
	 public ResponseEntity<List<Emprendimiento>> listar() {
		 List<Emprendimiento> emprendimientos = emprendimientoService.listar();
		 if(emprendimientos.isEmpty()){
			 return new
					 ResponseEntity<List<Emprendimiento>>(HttpStatus.NO_CONTENT);
		 }
		 return new ResponseEntity<List<Emprendimiento>>(emprendimientos, HttpStatus.OK);
	  }
	 
	 //recuperar emprendimiento por id
	 @GetMapping("/id")
	 public ResponseEntity<Optional<Emprendimiento>> buscarPorId(@RequestBody long id) {
		 Optional<Emprendimiento> emprendimiento = emprendimientoService.getById(id);
		 if(emprendimiento.isEmpty()){
			 return new
					 ResponseEntity<Optional<Emprendimiento>>(HttpStatus.NOT_FOUND);
		 }
		 return new ResponseEntity<Optional<Emprendimiento>>(emprendimiento,HttpStatus.OK);
	  }
	 
	 //actualizar nombre emprendimiento
	 @PutMapping(value = "/update/nombre")
	 public  ResponseEntity<Optional<Emprendimiento>> update(@RequestBody Long id,@RequestParam String nombre) {
		 Optional<Emprendimiento> optional = emprendimientoService.getById(id);
		 if(optional.isEmpty()){
					 return new
							 ResponseEntity<Optional<Emprendimiento>>(HttpStatus.NOT_FOUND);
		 }
		 else {
			 Emprendimiento emprendimiento = optional.get();
			 emprendimiento.setNombre(nombre);
			 emprendimientoService.update(emprendimiento); // hace un save
			 return new ResponseEntity<Optional<Emprendimiento>>(optional,HttpStatus.OK);
	  
		 }

	}

	 
}
