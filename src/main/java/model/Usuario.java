package model;

public class Usuario {
	
	private String username;	//recuperar
	private String password;
	private Rol rol;
	private Emprendimiento emprendimiento;
	
	public Usuario(String username, String password, Rol rol){
		this.username = username;
		this.password = password;
		this.rol = rol;
		this.emprendimiento = null;
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
