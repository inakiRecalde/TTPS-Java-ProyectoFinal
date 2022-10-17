package clasesDAOimpl;

import javax.persistence.Query;

import clasesDAO.UrlDAO;
import model.Url;

public class UrlDAOHibernateJPA extends GenericDAOHibernateJPA<Url> implements UrlDAO{
	public UrlDAOHibernateJPA() {
		super(Url.class);
	}
	
	@Override
	public Url recuperarUrl(String url) {
		Query consulta = EMF.getEm().createEntityManager().
				createQuery("select u from Url u where u.url =?");
		consulta.setParameter(1, url);
		Url resultado = (Url)consulta.getSingleResult();
		return resultado;
	}
}
