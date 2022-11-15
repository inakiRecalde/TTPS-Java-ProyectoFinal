package ttps.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ttps.spring.model.Donacion;
import ttps.spring.service.DonacionService;



@RestController
@RequestMapping("/donacion")
public class DonacionController {

	 @Autowired
	 private DonacionService service;
	 
	 
	 @PostMapping("/create")
	 public Donacion create(@RequestBody Donacion donacion) {
		 return service.create(donacion);
	 }
	 
	 @GetMapping("/getDonacionesEmprendimiento")
	 public List<Donacion> getDonacionesEmprendimiento(@RequestBody Long idEmprendimiento){
		 return service.getDonacionesEmprendimiento(idEmprendimiento);
	 }
}
