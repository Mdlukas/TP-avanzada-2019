package edu.usal.dao.interfaces;

import java.util.List;

import edu.usal.domain.Venta;

public interface VentaDAO {
	
	public Venta ObtenerVenta (Venta obtener);
	public List<Venta> listadodeVentas () ;
	public void AltadeVenta(Venta alta);
	public void ModificaciondeVenta (Venta modificar);
	public void BajadeVenta (Venta  baja);

}
