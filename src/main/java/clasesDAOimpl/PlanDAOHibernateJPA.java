package clasesDAOimpl;


import clasesDAO.PlanDAO;
import model.Plan;

public class PlanDAOHibernateJPA extends GenericDAOHibernateJPA<Plan> implements PlanDAO {

	public PlanDAOHibernateJPA() {
		super(Plan.class);
		
	}
	


}
