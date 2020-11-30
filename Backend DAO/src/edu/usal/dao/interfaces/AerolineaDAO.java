package edu.usal.dao.interfaces;

import java.util.List;

import edu.usal.domain.Aerolinea;

public interface AerolineaDAO {

	public Aerolinea ConsultarAerolinea (Aerolinea obtener);
	public List<Aerolinea> listadodeAerolineas () ;
	public boolean AltadeAerolinea(Aerolinea altaAerolinea);
	public boolean ModificaciondeAerolinea (Aerolinea modificarAerolinea);
	public boolean BajadeAerolinea (Aerolinea  bajaAerolinea);
	
}
