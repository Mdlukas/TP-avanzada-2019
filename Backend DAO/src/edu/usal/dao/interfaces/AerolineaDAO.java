package edu.usal.dao.interfaces;

import java.util.List;

import edu.usal.dao.negocio.Aerolinea;

public interface AerolineaDAO {

	public Aerolinea ObtenerAerolinea (Aerolinea obtener);
	public List<Aerolinea> listadodeAerolineas () ;
	public void AltadeAerolinea(Aerolinea altaAerolinea);
	public void ModificaciondeAerolinea (Aerolinea modificarAerolinea);
	public void BajadeAerolinea (Aerolinea  bajaAerolinea);
	
}
