package tests;

import javax.persistence.NoResultException;
import clasesDAOimpl.CategoriaDAOHibernateJPA;
import clasesDAOimpl.PosteoDAOHibernateJPA;
import model.Categoria;
import model.Posteo;

public class TestPosteo {
	
	public static void main(String[] args) {
		
		//ALTA Posteo
		PosteoDAOHibernateJPA pos = new PosteoDAOHibernateJPA();
		Posteo posteo = new Posteo("texto posteo1");
		pos.persistir(posteo);
		
		Posteo posteo2 = new Posteo("texto posteo2");
		pos.persistir(posteo2);
		
		
		//GET CATEGORIA POR ID
		Long l = new Long(1);
		Long l2 = new Long(2);
		Posteo Response2 = pos.recuperar(l);
		System.out.println("el posteo recuperado es " + Response2.getTexto());
		
		//ACTUALIZAR
		posteo2.setTexto("texto posteo2 v2");
		pos.actualizar(posteo2);
		Posteo Response3 = pos.recuperar(l2);
		System.out.println("el texto del posteo2 cambio a  " + Response3.getTexto());
		
		
		//BORRAR POR ID
		pos.borrar(posteo); //1
		try {
			Posteo Response4 = pos.recuperar(l);
			System.out.println("el posteo 1 fue borrado " + Response4);
		}catch(NoResultException e) {
			System.out.println("no se encuentra ese posteo");
		}
		
		
		
				
	}

}
