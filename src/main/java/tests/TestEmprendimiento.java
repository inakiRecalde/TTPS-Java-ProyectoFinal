package tests;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.NoResultException;

import clasesDAOimpl.DonacionDAOHibernateJPA;
import clasesDAOimpl.EmprendimientoDAOHibernateJPA;
import clasesDAOimpl.PlanDAOHibernateJPA;
import model.Donacion;
import model.Emprendimiento;
import model.Plan;

public class TestEmprendimiento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ALTA DE PLANES
		PlanDAOHibernateJPA planDAO = new PlanDAOHibernateJPA();
		Plan plan1 = new Plan(2,"20 of en remeras");
		planDAO.persistir(plan1);
		Plan plan2 = new Plan(2,"20 of en pantalones");
		planDAO.persistir(plan2);
		
		//Armo lista de planes
		
		List<Plan> listaPlanes = new ArrayList<Plan>();
		listaPlanes.add(plan1);
		listaPlanes.add(plan2);
		
		
		//ALTA Emprendimiento
		EmprendimientoDAOHibernateJPA EmprendimientoDTO = new EmprendimientoDAOHibernateJPA();
		Emprendimiento emprendimiento = new Emprendimiento("ventaremeras3.com", "123");
		emprendimiento.setPlanes(listaPlanes);
		
		
		EmprendimientoDTO.persistir(emprendimiento);
		
		
		//GET emprendimiento POR NOMBRE
		Emprendimiento Response = EmprendimientoDTO.recuperarEmprendimiento("ventaremeras3.com");
		System.out.println("el dominio del emprendimiento es " + Response.getDominio());
		
		Long l = new Long(3);
		Long l2 = new Long(4);
		
		System.out.println("los planes del emprendimiento ventaremereas3 son= ");
		Emprendimiento Response6 = EmprendimientoDTO.recuperarEmprendimiento("ventaremeras3.com");
		for (Plan unPlan : Response6.getPlanes()) {
			System.out.println(unPlan.getBeneficio());
		}
		
		
	}
	

}
