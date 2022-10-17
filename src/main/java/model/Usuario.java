package model;

import javax.persistence.*;

@Entity
@Table(name="USUARIOS")
public class Usuario {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(name="USERNAME")
	private String username;
	@Column(name="PASSWORD")
	private String password;
	@ManyToOne
	@JoinColumn(name="rol_id")
	private Rol rol;
	@OneToOne(optional = true)
	private Emprendimiento emprendimiento;
	
	public Usuario(String username, String password, Rol rol){
		this.username = username;
		this.password = password;
		this.rol = rol;
		this.emprendimiento = null;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public Rol getRol() {
		return rol;
	}

	public Emprendimiento getEmprendimiento() {
		return emprendimiento;
	}

	public void setEmprendimiento(Emprendimiento emprendimiento) {
		this.emprendimiento = emprendimiento;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}
	
	
	
}
