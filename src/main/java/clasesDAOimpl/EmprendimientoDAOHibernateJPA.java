package clasesDAOimpl;

import clasesDAO.EmprendimientoDAO;
import model.Emprendimiento;

public class EmprendimientoDAOHibernateJPA extends GenericDAOHibernateJPA<Emprendimiento> implements EmprendimientoDAO {

	public EmprendimientoDAOHibernateJPA(Class<Emprendimiento> clase) {
		super(clase);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Emprendimiento recuperarDonacion(String dominio) {
		// TODO Auto-generated method stub
		return null;
	}

}
