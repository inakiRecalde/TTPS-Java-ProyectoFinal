package models;

import java.awt.Image;

public class Posteo {

	String texto;
	
	Image [] imagenes;
	
	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Image[] getImagenes() {
		return imagenes;
	}

	public void setImagenes(Image[] imagenes) {
		this.imagenes = imagenes;
	}
}
