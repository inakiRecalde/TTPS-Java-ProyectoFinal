package clasesDAO;

import model.Url;

public interface UrlDAO extends GenericDAO<Url>{
	public Url recuperarUrl(String url);
}
