package tests;

import javax.persistence.NoResultException;

import clasesDAOimpl.CategoriaDAOHibernateJPA;
import clasesDAOimpl.DonacionDAOHibernateJPA;
import clasesDAOimpl.EmprendimientoDAOHibernateJPA;
import model.Categoria;
import model.Donacion;
import model.Emprendimiento;

public class TestDonacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ALTA CATEGORIA
		DonacionDAOHibernateJPA donacionDTO = new DonacionDAOHibernateJPA();
		EmprendimientoDAOHibernateJPA EmprendimientoDTO = new EmprendimientoDAOHibernateJPA();
		Emprendimiento emprendimiento = new Emprendimiento("ventaremerasdonacion.com", "123");
		EmprendimientoDTO.persistir(emprendimiento);
		Donacion donacion = new Donacion(2,2,"iniakirecalde@gmail.com","inaki","1era donacion",emprendimiento);
		donacionDTO.persistir(donacion);
		
		Emprendimiento emprendimiento2 = new Emprendimiento("ventaremerasdonacion2.com", "1234");
		EmprendimientoDTO.persistir(emprendimiento2);
		Donacion donacion2 = new Donacion(2,2,"fran@gmail.com","fran","2da donacion",emprendimiento2);
		donacionDTO.persistir(donacion2);
		
		//GET CATEGORIA POR NOMBRE
		Donacion Response = donacionDTO.recuperarDonacion("iniakirecalde@gmail.com");
		System.out.println("el contacto de la donacion es " + Response.getContacto());
		
		//GET CATEGORIA POR ID
		Long l = new Long(2);
		Long l2 = new Long(4);
		Donacion Response2 = donacionDTO.recuperar(l2);
		System.out.println("la categoria de id: " + Response2.getId() + "tiene como mensaje" + Response2.getMensaje());
		
		//ACTUALIZAR
		donacion2.setMensaje("cambiando el mensaje");
		donacionDTO.actualizar(donacion2);
		Donacion Response3 = donacionDTO.recuperar(l2);
		System.out.println("el mensaje cambio a " + Response3.getMensaje());
		
		
		//BORRAR POR ID
		donacionDTO.borrar(donacion); 
		try {
			Donacion Response4 = donacionDTO.recuperarDonacion("iniakirecalde@gmail.com");
			System.out.println("la donacion del contacto iniakirecalde@gmail.com no fue borrada " + Response4);
		}catch(NoResultException e) {
			System.out.println("no se encuentra donacion con ese contacto");
		}
	}

}
