package model;

import java.util.List;

import javax.persistence.Table;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
@Table(name="ROLES")
public class Rol {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(name="ROL")
	private String rol;
	@OneToMany(mappedBy="rol")
	private List<Usuario> usuarios;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}
	
	public Rol(String unRol) {
		this.rol= unRol;	}
}
