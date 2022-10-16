package clasesDAOimpl;

import clasesDAO.PlanDAO;
import model.Plan;

public class PlanDAOHibernateJPA extends GenericDAOHibernateJPA<Plan> implements PlanDAO {

	public PlanDAOHibernateJPA(Class<Plan> clase) {
		super(clase);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Plan recuperarPlan(String beneficio) {
		// TODO Auto-generated method stub
		return null;
	}

}
