package tests;

import javax.persistence.NoResultException;
import clasesDAOimpl.UrlDAOHibernateJPA;
import model.Url;

public class TestUrl {
	
	public static void main(String[] args) {
		
		//ALTA Url
		UrlDAOHibernateJPA url = new UrlDAOHibernateJPA();
		Url url1 = new Url("facebook","www.facebook.com/empanadas");
		url.persistir(url1);
		
		Url url2 = new Url("facebook","www.facebook.com/peluqueria");
		url.persistir(url2);
		
		//GET url POR url
		Url urlResponse = url.recuperarUrl("www.facebook.com/empanadas");
		System.out.println("La url es " + urlResponse.getUrl());
		
		//GET Url POR ID
		Long l = new Long(1);
		Long l2 = new Long(2);
		Url urlResponse2 = url.recuperar(l);
		System.out.println("La url es " + urlResponse2.getUrl());
		
		//ACTUALIZAR
		url2.setUrl("www.facebook.com/Vinoteca");
		url.actualizar(url2);
		Url urlResponse3 = url.recuperar(l2);
		System.out.println("La url de peluqueria cambio a  " + urlResponse3.getUrl());
		
		
		//BORRAR POR ID
		url.borrar(url1); //empanadas
		try {
			Url urlResponse4 = url.recuperarUrl("www.facebook.com/empanadas");
			System.out.println("La url de empanadas no fue borrada " + urlResponse4);
		}catch(NoResultException e) {
			System.out.println("No se encuentra la url");
		}
		
		
		
				
	}

}
