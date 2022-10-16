package clasesDAO;

import model.Donacion;

public interface DonacionDAO extends GenericDAO<Donacion>{
	
	public Donacion recuperarDonacion(String contacto);
}
