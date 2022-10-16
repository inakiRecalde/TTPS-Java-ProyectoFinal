package model;

import javax.persistence.Table;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name="URLS")
public class Url {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(name="NOMBRE")
	private String nombre;
	@Column(name="URL")
	private String url;
	
	public Url(String nombre, String url) {
		this.nombre = nombre;
		this.url = url;	//recuperar
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
