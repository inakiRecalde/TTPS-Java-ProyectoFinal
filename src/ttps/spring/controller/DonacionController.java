package ttps.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ttps.spring.model.Donacion;
import ttps.spring.service.DonacionService;



@RestController
@RequestMapping("/donacion")
public class DonacionController {

	 @Autowired
	 private DonacionService service;
	 
	 
	 @PostMapping("/create")
	 public  ResponseEntity<Donacion> create(@RequestBody Donacion donacion) {
		 System.out.println("entro create");
		 Donacion d= service.create(donacion);
		 return new ResponseEntity<Donacion>(d, HttpStatus.CREATED);
	 }
	 
	 @GetMapping("/getDonacionesEmprendimiento")
	 public ResponseEntity<List<Donacion>> listar(@RequestParam Long idEmprendimiento) {
		 List<Donacion> lista = service.getDonacionesEmprendimiento(idEmprendimiento);
		 if(lista.isEmpty()){
			 return new
					 ResponseEntity<List<Donacion>>(HttpStatus.NO_CONTENT);
		 }
		 return new ResponseEntity<List<Donacion>>(lista, HttpStatus.OK);
	  }
}
