package tests;

import javax.persistence.NoResultException;
import clasesDAOimpl.UsuarioDAOHibernateJPA;
import model.Usuario;

public class TestUsuario {
	
	public static void main(String[] args) {
		
		//ALTA User
		UsuarioDAOHibernateJPA user = new UsuarioDAOHibernateJPA();
		Usuario user1 = new Usuario("fran","1234");
		user.persistir(user1);
		
		Usuario user2 = new Usuario("iña","1234");
		user.persistir(user2);
		
		//GET User POR username
		Usuario userResponse = user.recuperarUsuario("fran");
		System.out.println("El usuario es " + userResponse.getUsername());
		
		//GET User POR ID
		Long l = new Long(1);
		Long l2 = new Long(2);
		Usuario userResponse2 = user.recuperar(l);
		System.out.println("El usuario es " + userResponse2.getUsername());
		
		//ACTUALIZAR
		user2.setUsername("pablo");
		user.actualizar(user2);
		Usuario userResponse3 = user.recuperar(l2);
		System.out.println("El usuario iña cambio a  " + userResponse3.getUsername());
		
		
		//BORRAR POR ID
		user.borrar(user1); //fran
		try {
			Usuario userResponse4 = user.recuperarUsuario("fran");
			System.out.println("El usuario fran no fue borrada " + userResponse4);
		}catch(NoResultException e) {
			System.out.println("No se encuentra ese usuario");
		}
		
		
		
				
	}

}
