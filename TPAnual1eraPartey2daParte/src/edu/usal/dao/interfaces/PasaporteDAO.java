package edu.usal.dao.interfaces;

import java.util.List;

import edu.usal.dao.negocio.Pasaporte;

public interface PasaporteDAO {
	
	public Pasaporte ObtenerPasaporte (Pasaporte obtener);
	public List<Pasaporte> listadodePasaportes () ;
	public void AltadePasaporte(Pasaporte alta);
	public void ModificaciondePasaporte (Pasaporte modificar);
	public void BajadePasaporte (Pasaporte  baja);

}
