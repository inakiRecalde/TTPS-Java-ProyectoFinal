package ttps.spring.test;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import ttps.spring.model.Emprendimiento;
import ttps.spring.model.Plan;
import ttps.spring.repositories.PlanRepository;
import ttps.spring.service.EmprendimientoService;

public class testEmprendimiento {

  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 		EmprendimientoService service = new EmprendimientoService();
		 		
				//ALTA Emprendimiento
				
				service.create("ventaremeras3.com", "123");
				System.out.println("emprendimiento creado");
				
				//GET emprendimiento POR NOMBRE
				Long id= new Long(1);
				Optional<Emprendimiento> emprendimiento = service.getById(id);
				System.out.println("emprendimiento buscado por id, dominio: "+ emprendimiento.get().getDominio() + "password =" + emprendimiento.get().getPassword());
				
				emprendimiento.get().setPassword("456");
				
				service.update(emprendimiento.get());
				
				System.out.println("emprendimiento actualizado, password =" + emprendimiento.get().getPassword());
	}

}
