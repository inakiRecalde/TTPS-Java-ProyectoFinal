package model;
import javax.persistence.*;

@Entity
@Table(name="DONACION")
public class Donacion {
	
	@Id @GeneratedValue
	@Column(name="DONACION_ID")
	private Long id;

	private double cantManguitos;
	private double montoDonado;
	private String nombreDonante;
	private String contacto;	//recuperar
	private String mensaje;
	private Emprendimiento emprendimiento;
	
	public Donacion(double manguitos, double monto, String contacto, String nombre, String mensaje, Emprendimiento emprendimiento) {
		this.cantManguitos = manguitos;
		this.montoDonado = monto;
		this.nombreDonante = nombre;
		this.contacto = contacto;
		this.mensaje = mensaje;
		this.emprendimiento = emprendimiento;
	}
	
	public double getCantManguitos() {
		return cantManguitos;
	}
	public void setCantManguitos(double cantManguitos) {
		this.cantManguitos = cantManguitos;
	}
	public String getNombreDonante() {
		return nombreDonante;
	}
	public void setNombreDonante(String nombreDonante) {
		this.nombreDonante = nombreDonante;
	}
	public String getContacto() {
		return contacto;
	}
	public void setContacto(String contacto) {
		this.contacto = contacto;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public Emprendimiento getEmprendimiento() {
		return emprendimiento;
	}
	public void setEmprendimiento(Emprendimiento emprendimiento) {
		this.emprendimiento = emprendimiento;
	}

	public double getMontoDonado() {
		return montoDonado;
	}

	public void setMontoDonado(double montoDonado) {
		this.montoDonado = montoDonado;
	}
	
	
	
}
