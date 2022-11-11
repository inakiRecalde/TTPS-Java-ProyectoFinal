package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import model.Donacion;
import repositories.DonacionRepository;


public class DonacionService {

	@Autowired
	 private DonacionRepository donacionRepository;
	
	 public Donacion create(Donacion donacion) {
		 // validaciones
		 return donacionRepository.save(donacion);
	
	 }
	 
	 public List<Donacion> getDonacionesEmprendimiento(Long idEmprendimiento) { 
		 return donacionRepository.findByEmprendimiento(idEmprendimiento);
	 }
}
