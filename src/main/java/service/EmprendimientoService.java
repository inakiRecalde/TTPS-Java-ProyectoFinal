package service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import model.Emprendimiento;
import repositories.EmprendimientoRepository;



public class EmprendimientoService {

	@Autowired
	 private EmprendimientoRepository emprendimientoRepository;
	
	 public Emprendimiento create(Emprendimiento emprendimiento) {
		 // validaciones
		 return emprendimientoRepository.save(emprendimiento);
	
	 }
	 
	 public Optional<Emprendimiento> getById(long id) {
		 // validaciones
		 return emprendimientoRepository.findById(id);
	
	 }
	 public Emprendimiento update(Emprendimiento e) {
		 // validaciones
		 return emprendimientoRepository.save(e);
	
	 }

	 
}
