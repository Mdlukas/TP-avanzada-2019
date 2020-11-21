package edu.usal.domain;

public class Venta {
	
	private String IDVenta;
	private String Fecha_HS_Venta;
	
	private TipoPago FormadePago;
	
	private Cliente Cliente;
	private Vuelo Vuelo;
	private Aerolinea Aerolinea;
	
	public Venta() {}
	public Venta(String idventa) {
		
		IDVenta = idventa;
	}
	



	public Venta(String iDVenta, String fecha_HS_Venta, TipoPago formadePago, edu.usal.domain.Cliente cliente,
			Vuelo vuelo, edu.usal.domain.Aerolinea aerolinea) {
		super();
		IDVenta = iDVenta;
		Fecha_HS_Venta = fecha_HS_Venta;
		FormadePago = formadePago;
		Cliente = cliente;
		Vuelo = vuelo;
		Aerolinea = aerolinea;
	}
	public String getIDVenta() {
		return IDVenta;
	}
	public void setIDVenta(String iDVenta) {
		IDVenta = iDVenta;
	}
	public Cliente getCliente() {
		return Cliente;
	}
	public void setCliente(Cliente cliente) {
		Cliente = cliente;
	}
	public Vuelo getVuelo() {
		return Vuelo;
	}
	public void setVuelo(Vuelo vuelo) {
		Vuelo = vuelo;
	}
	public Aerolinea getAerolinea() {
		return Aerolinea;
	}
	public void setAerolinea(Aerolinea aerolinea) {
		Aerolinea = aerolinea;
	}
	public String getFecha_HS_Venta() {
		return Fecha_HS_Venta;
	}


	public void setFecha_HS_Venta(String fecha_HS_Venta) {
		Fecha_HS_Venta = fecha_HS_Venta;
	}


	public TipoPago getFormadePago() {
		return FormadePago;
	}


	public void setFormadePago(TipoPago formadePago) {
		FormadePago = formadePago;
	}


	

}
