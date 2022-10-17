package model;

import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;


@Entity
@Table(name="POSTEO")
public class Posteo {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="TEXTO")
	private String texto;
	
	/* @Column(name="IMAGENES")
	private List<Image> imagenes; 
	
	public Posteo(String texto){
		this.texto = texto;
		this.imagenes = new ArrayList<Image>();
	} */
	
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
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
