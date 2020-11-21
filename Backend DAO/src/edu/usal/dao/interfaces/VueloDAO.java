package edu.usal.dao.interfaces;

import java.util.List;

import edu.usal.domain.Vuelo;

public interface VueloDAO {

	
	public Vuelo ConsultadeVuelo (Vuelo obtener);
	public List<Vuelo> listadodeVuelos () ;
	public void AltadeVuelo(Vuelo alta);
	public void ModificaciondeVuelo (Vuelo modificar);
	public void BajadeVuelo (Vuelo  baja);
	
	
	
}
