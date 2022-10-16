package clasesDAOimpl;

import clasesDAO.DonacionDAO;
import model.Donacion;

public class DonacionDAOHibernateJPA extends GenericDAOHibernateJPA<Donacion> implements DonacionDAO {

	public DonacionDAOHibernateJPA(Class<Donacion> clase) {
		super(clase);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Donacion recuperarDonacion(String contacto) {
		// TODO Auto-generated method stub
		return null;
	}

}
