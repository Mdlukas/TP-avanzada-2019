package edu.usal.dao.interfaces;

import java.util.List;

import edu.usal.dao.negocio.Provincia;

public interface ProvinciaDAO {
	
	
	public Provincia ObtenerProvincia (Provincia obtener);
	public List<Provincia> listadodeProvincias () ;
	public void AltadeProvincia(Provincia AltaProvincia);
	public void ModificaciondeProvincia (Provincia ModificarProvincia);
	public void BajadeProvincia (Provincia  BajaProvincia);
	

}
