package edu.usal.dao.interfaces;

import java.util.List;

import edu.usal.domain.Aeropuerto;

public interface AeropuertoDAO {
	
	public Aeropuerto ObtenerAeropuerto (Aeropuerto obtener);
	public List<Aeropuerto> listadodeAeropuertos () ;
	public void AltadeAeropuerto(Aeropuerto altaAeropuerto);
	public void ModificaciondeAeropuerto (Aeropuerto modificarAeropuerto);
	public void BajadeAeropuerto (Aeropuerto  bajaAeropuerto);

}
