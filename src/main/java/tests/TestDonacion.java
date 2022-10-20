package tests;

import javax.persistence.NoResultException;

import clasesDAOimpl.CategoriaDAOHibernateJPA;
import clasesDAOimpl.DonacionDAOHibernateJPA;
import model.Categoria;
import model.Donacion;
import model.Emprendimiento;

public class TestDonacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ALTA CATEGORIA
		DonacionDAOHibernateJPA donacionDTO = new DonacionDAOHibernateJPA();
		Emprendimiento emprendimiento = new Emprendimiento("ventaremeras.com", "123");
		Donacion donacion = new Donacion(2,2,"iniakirecalde@gmail.com","inaki","1era donacion",emprendimiento);
		donacionDTO.persistir(donacion);
		
		Donacion donacion2 = new Donacion(2,2,"fran@gmail.com","fran","2da donacion",emprendimiento);
		donacionDTO.persistir(donacion2);
		
		//GET CATEGORIA POR NOMBRE
		Donacion Response = donacionDTO.recuperarDonacion("iniakirecalde@hotmail.com");
		System.out.println("el contacto de la donacion es " + Response.getContacto());
		
		//GET CATEGORIA POR ID
		Long l = new Long(1);
		Long l2 = new Long(2);
		Donacion Response2 = donacionDTO.recuperar(l2);
		System.out.println("la categoria de id: " + Response2.getId() + "tiene como mensaje" + Response2.getMensaje());
		
		//ACTUALIZAR
		donacion2.setMensaje("cambiando el mensaje");
		donacionDTO.actualizar(donacion2);
		Donacion Response3 = donacionDTO.recuperar(l2);
		System.out.println("el mensaje cambio a " + Response3.getMensaje());
		
		
		//BORRAR POR ID
		donacionDTO.borrar(donacion); //futbol
		try {
			Donacion Response4 = donacionDTO.recuperarDonacion("iniakirecalde@hotmail.com");
			System.out.println("la donacion del contacto iniakirecalde@hotmail.com fue borrada " + Response4);
		}catch(NoResultException e) {
			System.out.println("no se encuentra donacion con ese contacto");
		}
	}

}
