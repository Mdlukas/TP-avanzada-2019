package edu.usal.dao.negocio;

public class Direccion {
	
	private String IDDireccion;
	private String calle;
	private String altura;
	private String ciudad;
	private String codigoPostal;
	
	
	private Pais Pais;
	private Provincia Provincia;
	private Cliente Cliente;
	
	public Direccion() {}
	
	

	public Direccion(String iDDireccion, String calle, String altura, String ciudad, String codigoPostal,
			edu.usal.dao.negocio.Pais pais, edu.usal.dao.negocio.Provincia provincia,
			edu.usal.dao.negocio.Cliente cliente) {
		super();
		IDDireccion = iDDireccion;
		this.calle = calle;
		this.altura = altura;
		this.ciudad = ciudad;
		this.codigoPostal = codigoPostal;
		Pais = pais;
		Provincia = provincia;
		Cliente = cliente;
	}



	public String getIDDireccion() {
		return IDDireccion;
	}
	public void setIDDireccion(String iDdireccion) {
		IDDireccion = iDdireccion;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getAltura() {
		return altura;
	}
	public void setAltura(String altura) {
		this.altura = altura;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}


	public Pais getPais() {
		return Pais;
	}


	public void setPais(Pais pais) {
		Pais = pais;
	}


	public Provincia getProvincia() {
		return Provincia;
	}


	public void setProvincia(Provincia provincia) {
		Provincia = provincia;
	}


	public Cliente getCliente() {
		return Cliente;
	}


	public void setCliente(Cliente cliente) {
		Cliente = cliente;
	}

	

}
