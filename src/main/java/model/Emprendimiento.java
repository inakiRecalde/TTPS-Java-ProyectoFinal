package model;


import java.awt.Image;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMPRENDIMIENTO")
public class Emprendimiento {

	@Id @GeneratedValue
	@Column(name="EMPRENDIMIENTO_ID")
	private Long id;
	
	private String dominio; //recuperar
	private String password;
	private String nombre;
	private String descripcion;
	private Image banner;
	private boolean mostrarTop;
	private double precioPorManguito;
	private double manguitosRecibidos;
	private List<Url> redesSociales;
	private List<Posteo> posteos;
	private List<Categoria> categorias;
	private List<Plan> planes;
	
	public Emprendimiento(String dominio, String pass) {
		this.dominio = dominio;
		this.password = pass;
	}
	
	public String getDominio() {
		return dominio;
	}

	public void setDominio(String dominio) {
		this.dominio = dominio;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Image getBanner() {
		return banner;
	}

	public void setBanner(Image banner) {
		this.banner = banner;
	}

	public boolean isMostrarTop() {
		return mostrarTop;
	}

	public void setMostrarTop(boolean mostrarTop) {
		this.mostrarTop = mostrarTop;
	}

	public double getPrecioPorManguito() {
		return precioPorManguito;
	}

	public void setPrecioPorManguito(double precioPorManguito) {
		this.precioPorManguito = precioPorManguito;
	}

	public double getManguitosRecibidos() {
		return manguitosRecibidos;
	}

	public void setManguitosRecibidos(double manguitosRecibidos) {
		this.manguitosRecibidos = manguitosRecibidos;
	}

	public List<Url> getRedesSociales() {
		return redesSociales;
	}

	public void setRedesSociales(List<Url> redesSociales) {
		this.redesSociales = redesSociales;
	}

	public List<Posteo> getPosteos() {
		return posteos;
	}

	public void setPosteos(List<Posteo> posteos) {
		this.posteos = posteos;
	}

	public List<Categoria> getCategorias() {
		return categorias;
	}

	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}

	public List<Plan> getPlanes() {
		return planes;
	}

	public void setPlanes(List<Plan> planes) {
		this.planes = planes;
	}
	
	
}
