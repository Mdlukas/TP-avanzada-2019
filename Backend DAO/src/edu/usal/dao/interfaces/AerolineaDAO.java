package edu.usal.dao.interfaces;

import java.util.List;

import edu.usal.domain.Aerolinea;

public interface AerolineaDAO {

	public Aerolinea ConsultarAerolinea (Aerolinea obtener);
	public List<Aerolinea> listadodeAerolineas () ;
	public void AltadeAerolinea(Aerolinea altaAerolinea);
	public void ModificaciondeAerolinea (Aerolinea modificarAerolinea);
	public void BajadeAerolinea (Aerolinea  bajaAerolinea);
	
}
