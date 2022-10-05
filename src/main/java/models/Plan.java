package models;

public class Plan {


	int valorPrecio;
	
	String beneficio;
	
	Donacion [] donaciones;
	

	public int getValorPrecio() {
		return valorPrecio;
	}

	public void setValorPrecio(int valorPrecio) {
		this.valorPrecio = valorPrecio;
	}

	public String getBeneficio() {
		return beneficio;
	}

	public void setBeneficio(String beneficio) {
		this.beneficio = beneficio;
	}
	
	public Donacion[] getDonaciones() {
		return donaciones;
	}

	public void setDonaciones(Donacion[] donaciones) {
		this.donaciones = donaciones;
	}
}
