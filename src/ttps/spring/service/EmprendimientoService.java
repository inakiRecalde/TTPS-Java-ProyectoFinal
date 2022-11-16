package ttps.spring.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ttps.spring.model.Emprendimiento;
import ttps.spring.repositories.EmprendimientoRepository;




@Service
@Transactional
public class EmprendimientoService {

	@Autowired
	 private EmprendimientoRepository emprendimientoRepository;
	
	 public Emprendimiento create(String dominio, String password) {
		 Emprendimiento emprendimiento = new Emprendimiento(dominio, password);
		 return emprendimientoRepository.save(emprendimiento);
	 }
	 
	 public List<Emprendimiento> listar(){
		 return emprendimientoRepository.findAll();
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
