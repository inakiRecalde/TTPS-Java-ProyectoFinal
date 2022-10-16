package clasesDAO;

import model.Posteo;

public interface PosteoDAO extends GenericDAO<Posteo> {

	public Posteo recuperarPlan(String texto);
}
