package model;

import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="POSTEO")
public class Posteo {

	@Id @GeneratedValue
	@Column(name="POSTEO_ID")
	private Long id;
	
	private String texto;
	private List<Image> imagenes;
	
	public Posteo(String texto){
		this.texto = texto;
		this.imagenes = new ArrayList<Image>();
	}
	
	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public List<Image> getImagenes() {
		return imagenes;
	}

	public void setImagenes(List<Image> imagenes) {
		this.imagenes = imagenes;
	}
}
