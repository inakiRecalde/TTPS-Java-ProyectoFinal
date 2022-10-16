package clasesDAOimpl;

import clasesDAO.PosteoDAO;
import model.Posteo;

public class PosteoDAOHibernateJPA extends GenericDAOHibernateJPA<Posteo> implements PosteoDAO{

	public PosteoDAOHibernateJPA(Class<Posteo> clase) {
		super(clase);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Posteo recuperarPlan(String texto) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
