package clasesDAOimpl;

import javax.persistence.Query;

import clasesDAO.EmprendimientoDAO;
import model.Emprendimiento;

public class EmprendimientoDAOHibernateJPA extends GenericDAOHibernateJPA<Emprendimiento> implements EmprendimientoDAO {

	public EmprendimientoDAOHibernateJPA() {
		super(Emprendimiento.class);
	}

	@Override
	public Emprendimiento recuperarEmprendimiento(String dominio) {
		Query consulta = EMF.getEm().createEntityManager().
				createQuery("select e from Emprendimiento e where e.dominio =?1");
		consulta.setParameter(1, dominio);
		Emprendimiento resultado = (Emprendimiento)consulta.getSingleResult();
		return resultado;
	}

}
