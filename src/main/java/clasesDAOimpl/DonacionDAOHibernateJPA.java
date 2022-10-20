package clasesDAOimpl;

import javax.persistence.Query;

import clasesDAO.DonacionDAO;
import model.Donacion;

public class DonacionDAOHibernateJPA extends GenericDAOHibernateJPA<Donacion> implements DonacionDAO {

	public DonacionDAOHibernateJPA() {
		super(Donacion.class);
	}
	public DonacionDAOHibernateJPA(Class<Donacion> clase) {
		super(clase);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Donacion recuperarDonacion(String contacto) {
		Query consulta = EMF.getEm().createEntityManager().
				createQuery("select d from Donacion d where d.contacto =?1");
		consulta.setParameter(1, contacto);
		Donacion resultado = (Donacion)consulta.getSingleResult();
		return resultado;
	}

}
