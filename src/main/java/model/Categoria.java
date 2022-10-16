package model;

import javax.persistence.Table;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name="CATEGORIAS")
public class Categoria {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(name="NOMBRE")
	private String nombre;
	
	public Categoria(String nombre) {
		this.nombre = nombre;
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
	
	
}
