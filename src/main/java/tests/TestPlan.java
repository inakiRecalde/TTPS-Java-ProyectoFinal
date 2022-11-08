package tests;

import java.util.Iterator;
import java.util.List;

import javax.persistence.NoResultException;

import clasesDAOimpl.PlanDAOHibernateJPA;
import model.Categoria;
import model.Donacion;
import model.Emprendimiento;
import model.Plan;

public class TestPlan {

	public static void main(String[] args) {
	//ALTA PLAN
		PlanDAOHibernateJPA planDAO = new PlanDAOHibernateJPA();
		Plan plan = new Plan(2,"20 of en remeras");
		planDAO.persistir(plan);
		Plan plan2 = new Plan(2,"20 of en pantalones");
		planDAO.persistir(plan2);
			
			
			//GET Plan POR ID
			Long l = new Long(1);
			Long l2 = new Long(2);
			Plan response2 = planDAO.recuperar(l2);
			System.out.println("plan de id=" + response2.getId() + " recuperado");
			
			//ACTUALIZAR
			plan2.setCantManguitos(3);
			planDAO.actualizar(plan2);
			Plan Response3 = planDAO.recuperar(l2);
			System.out.println("la cantidad de manguitos para obtener el beneficio del plan 20 of en pantalones cambiaron a  " + Response3.getCantManguitos());
			
			
			//BORRAR POR ID
			planDAO.borrar(plan);
			List<Plan> Response4 = planDAO.recuperarTodos("id");
			System.out.println("los planes que existen son=");
			for (Plan unPlan : Response4) {
				System.out.println(unPlan.getBeneficio());
			}
			

	}
}
