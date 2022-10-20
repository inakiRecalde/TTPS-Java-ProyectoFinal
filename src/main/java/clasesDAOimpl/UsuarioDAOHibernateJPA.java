package clasesDAOimpl;

import javax.persistence.Query;
import clasesDAO.UsuarioDAO;
import model.Usuario;

public class UsuarioDAOHibernateJPA extends GenericDAOHibernateJPA<Usuario> implements UsuarioDAO{
	public UsuarioDAOHibernateJPA() {
		super(Usuario.class);
	}
	
	@Override
	public Usuario recuperarUsuario(String username) {
		Query consulta = EMF.getEm().createEntityManager().
				createQuery("select u from Usuario u where u.username =?1");
		consulta.setParameter(1, username);
		Usuario resultado = (Usuario)consulta.getSingleResult();
		return resultado;
	}

}
