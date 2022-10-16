package clasesDAO;

import model.Categoria;

public interface CategoriaDAO extends GenericDAO<Categoria>{
	public Categoria recuperarCategoria(String nombre);
}
