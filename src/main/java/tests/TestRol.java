package tests;

import javax.persistence.NoResultException;
import clasesDAOimpl.RolDAOHibernateJPA;
import model.Rol;

public class TestRol {
	
	public static void main(String[] args) {
		
		//ALTA Rol
		RolDAOHibernateJPA rol = new RolDAOHibernateJPA();
		Rol rol1 = new Rol("admin");
		rol.persistir(rol1);
		
		Rol rol2 = new Rol("emprendedor");
		rol.persistir(rol2);
		
		//GET Rol POR ID
		Long l = new Long(1);
		Long l2 = new Long(2);
		Rol rolResponse = rol.recuperar(l);
		System.out.println("El rol es " + rolResponse.getRol());
		
		//ACTUALIZAR
		rol2.setRol("emprendedorPremium");
		rol.actualizar(rol2);
		Rol rolResponse2 = rol.recuperar(l2);
		System.out.println("El rol emprendedor cambio a  " + rolResponse2.getRol());
		
		
		//BORRAR POR ID
		rol.borrar(rol1); //admin
		try {
			Rol rolResponse3 = rol.recuperar(l);
			System.out.println("El rol admin no fue borrado " + rolResponse3);
		}catch(NoResultException e) {
			System.out.println("No se encuentra el rol admin");
		}
		
		
		
				
	}

}
