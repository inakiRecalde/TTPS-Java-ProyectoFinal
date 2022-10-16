package clasesDAOimpl;

import clasesDAO.RolDAO;
import model.Rol;

public class RolDAOHibernateJPA extends GenericDAOHibernateJPA<Rol> implements RolDAO{
	public RolDAOHibernateJPA() {
		super(Rol.class);
	}

}
