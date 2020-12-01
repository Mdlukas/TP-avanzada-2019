package edu.usal.dao.interfaces;

import java.util.List;

import edu.usal.domain.Venta;

public interface VentaDAO {
	
	public Venta ObtenerVenta (Venta obtener);
	public List<Venta> listadodeVentas () ;
	public boolean AltadeVenta(Venta alta);
	public boolean ModificaciondeVenta (Venta modificar);
	public boolean BajadeVenta (Venta  baja);

}
