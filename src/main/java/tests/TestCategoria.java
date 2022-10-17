package tests;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import clasesDAO.CategoriaDAO;
import clasesDAOimpl.CategoriaDAOHibernateJPA;
import clasesDAOimpl.EMF;
import model.Categoria;
import model.Donacion;

public class TestCategoria {
	
	public static void main(String[] args) {
		Query consulta = EMF.getEm().createEntityManager().
				createQuery("select c from Categoria c");
		Categoria resultado = (Categoria)consulta.getSingleResult();
		System.out.println("en esta base de daatos hay" + resultado + " categorias");;
	}

}
