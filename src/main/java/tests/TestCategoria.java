package tests;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import clasesDAO.CategoriaDAO;
import clasesDAOimpl.CategoriaDAOHibernateJPA;
import clasesDAOimpl.EMF;
import model.Categoria;
import model.Donacion;

public class TestCategoria {
	
	public static void main(String[] args) {
		
		//ALTA CATEGORIA
		CategoriaDAOHibernateJPA cat = new CategoriaDAOHibernateJPA();
		Categoria categoria = new Categoria("futbol");
		cat.persistir(categoria);
		
		Categoria categoria2 = new Categoria("tenis");
		cat.persistir(categoria2);
		
		//GET CATEGORIA POR NOMBRE
		Categoria categoriaResponse = cat.recuperarCategoria("futbol");
		System.out.println("la categoria es " + categoriaResponse.getNombre());
		
		//GET CATEGORIA POR ID
		Long l = new Long(1);
		Long l2 = new Long(2);
		Categoria categoriaResponse2 = cat.recuperar(l);
		System.out.println("la categoria es " + categoriaResponse2.getNombre());
		
		//ACTUALIZAR
		categoria2.setNombre("rugby");
		cat.actualizar(categoria2);
		Categoria categoriaResponse3 = cat.recuperar(l2);
		System.out.println("la categoria tenis cambio a  " + categoriaResponse3.getNombre());
		
		
		//BORRAR POR ID
		cat.borrar(categoria); //futbol
		try {
			Categoria categoriaResponse4 = cat.recuperarCategoria("futbol");
			System.out.println("la categoria futbol fue borrada " + categoriaResponse4);
		}catch(NoResultException e) {
			System.out.println("no se encuentra esa categoria");
		}
		
		
		
				
	}

}
