package clasesDAO;

import model.Plan;

public interface PlanDAO extends GenericDAO<Plan>{
	
	public Plan recuperarPlan(String beneficio);
}
