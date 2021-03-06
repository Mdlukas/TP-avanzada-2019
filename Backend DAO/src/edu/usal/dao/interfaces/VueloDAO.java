package edu.usal.dao.interfaces;

import java.util.List;

import edu.usal.domain.Aerolinea;
import edu.usal.domain.Vuelo;

public interface VueloDAO {

	
	public Vuelo ConsultadeVuelo (Vuelo obtener);
	public List<Vuelo> listadodeVuelos () ;
	List<Vuelo> listadoDeVuelosPorAerolinea(Aerolinea a);
	public boolean AltadeVuelo(Vuelo alta);
	public boolean ModificaciondeVuelo (Vuelo modificar);
	public boolean BajadeVuelo (Vuelo  baja);

}
