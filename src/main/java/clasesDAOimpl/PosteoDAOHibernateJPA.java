package clasesDAOimpl;

import clasesDAO.PosteoDAO;
import model.Posteo;

public class PosteoDAOHibernateJPA extends GenericDAOHibernateJPA<Posteo> implements PosteoDAO{

	public PosteoDAOHibernateJPA() {
		super(Posteo.class);
		// TODO Auto-generated constructor stub
	}


	
}
