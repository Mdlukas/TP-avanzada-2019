package edu.usal.dao.interfaces;

import java.util.List;

import edu.usal.domain.Pasajero;

public interface PasajeroDAO {
	
	public Pasajero ObtenerPasajero (Pasajero obtener);
	public List<Pasajero> listadodePasajeros () ;
	public void AltadePasajero(Pasajero alta);
	public void ModificaciondePasajero (Pasajero modificacion);
	public void BajadePasajero (Pasajero  baja);

}
