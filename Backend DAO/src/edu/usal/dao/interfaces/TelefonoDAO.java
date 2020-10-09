package edu.usal.dao.interfaces;

import java.util.List;

import edu.usal.dao.negocio.Telefono;

public interface TelefonoDAO {
	
	
	public Telefono ObtenerTelefono (Telefono obtener);
	public List<Telefono> listadodeTelefonos () ;
	public void AltadeTelefono(Telefono alta);
	public void ModificaciondeTelefono (Telefono modificar);
	public void BajadeTelefono (Telefono  baja);

	

}
