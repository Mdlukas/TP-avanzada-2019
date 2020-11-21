package edu.usal.dao.interfaces;

import java.util.List;

import edu.usal.domain.Direccion;

public interface DireccionDAO {
	
	
	public Direccion ObtenerDireccion (Direccion obtener);
	public List<Direccion> listadodeDirecciones () ;
	public void AltadeDireccion(Direccion alta);
	public void ModificaciondeDireccion (Direccion modificar);
	public void BajadeDireccion (Direccion  baja);


}
