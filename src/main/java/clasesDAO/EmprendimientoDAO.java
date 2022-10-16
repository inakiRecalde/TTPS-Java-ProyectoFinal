package clasesDAO;

import model.Emprendimiento;

public interface EmprendimientoDAO extends GenericDAO<Emprendimiento> {

	public Emprendimiento recuperarDonacion(String dominio);
}
