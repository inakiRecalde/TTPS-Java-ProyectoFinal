package clasesDAOimpl;

import javax.persistence.Query;
import clasesDAO.CategoriaDAO;
import model.Categoria;

public class CategoriaDAOHibernateJPA extends GenericDAOHibernateJPA<Categoria> implements CategoriaDAO{
	public CategoriaDAOHibernateJPA() {
		super(Categoria.class);
	}

	@Override
	public Categoria recuperarCategoria(String nombre) {
		Query consulta = EMF.getEm().createEntityManager().
				createQuery("select c from Categoria c where c.nombre =?");
		consulta.setParameter(1, nombre);
		Categoria resultado = (Categoria)consulta.getSingleResult();
		return resultado;
	}

}

