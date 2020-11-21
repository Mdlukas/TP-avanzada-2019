package edu.usal.dao.interfaces;

import java.util.List;

import edu.usal.domain.Pais;

public interface PaisDAO {
	
	
	public Pais ObtenerPais (Pais obtener);
	public List<Pais> listadodePaises () ;
	public void AltadePais(Pais AltaPais);
	public void ModificaciondePais (Pais ModificarPais);
	public void BajadePais (Pais  BajaPais);

	

}
