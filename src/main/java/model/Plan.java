package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PLAN")
public class Plan {

	@Id @GeneratedValue
	@Column(name="POSTEO_ID")
	private Long id;
	
	private double cantManguitos;
	private String beneficio;
	private List<Donacion> donaciones;
	
	public Plan(double manguitos, String beneficio) {
		this.cantManguitos = manguitos;
		this.beneficio = beneficio;
		this.donaciones = new ArrayList<Donacion>();
	}

	public double getCantManguitos() {
		return cantManguitos;
	}

	public void setCantManguitos(double cantManguitos) {
		this.cantManguitos = cantManguitos;
	}

	public String getBeneficio() {
		return beneficio;
	}

	public void setBeneficio(String beneficio) {
		this.beneficio = beneficio;
	}
	
	public List<Donacion> getDonaciones() {
		return donaciones;
	}

	public void setDonaciones(List<Donacion> donaciones) {
		this.donaciones = donaciones;
	}
}
