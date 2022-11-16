package ttps.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ttps.spring.model.Donacion;
import ttps.spring.repositories.DonacionRepository;



@Service
@Transactional
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
