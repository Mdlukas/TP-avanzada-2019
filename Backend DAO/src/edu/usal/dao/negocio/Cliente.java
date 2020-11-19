package edu.usal.dao.negocio;

import java.io.Serializable;

//crear dao que falta y completar clases;
public class Cliente implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	private String IDCliente;
	private String NombreCliente;
	private String ApellidoCliente;
	private String dni;
	private String cuit;
	private String FechaNacimiento; 
	private String mail;
	
	
	private Pasaporte Pasaporte;         //estos objetos solo Cuentan en la implementacion de archivos
    private Telefono Telefono;			// No??? Que onda hermano, no sabes hacer FK's y referencias en DB??
	private Pasajero nrodepasajero;

	public Cliente() {}
	public Cliente(String idCliente) {
		
		IDCliente = idCliente;
	}
	public Cliente(String iDCliente, String nombreCliente, String apellidoCliente, String dni, String cuit,
			String fechaNacimiento, String mail) {
		super();
		IDCliente = iDCliente;
		NombreCliente = nombreCliente;
		ApellidoCliente = apellidoCliente;
		this.dni = dni;
		this.cuit = cuit;
		FechaNacimiento = fechaNacimiento;
		this.mail = mail;
	}
	public Cliente(String iDCliente, String nombreCliente, String apellidoCliente, String dni, String cuit,
			String fechaNacimiento, String mail, edu.usal.dao.negocio.Pasaporte pasaporte,
			edu.usal.dao.negocio.Telefono telefono, Pasajero nrodepasajero) {
		super();
		IDCliente = iDCliente;
		NombreCliente = nombreCliente;
		ApellidoCliente = apellidoCliente;
		this.dni = dni;
		this.cuit = cuit;
		FechaNacimiento = fechaNacimiento;
		this.mail = mail;
		Pasaporte = pasaporte;
		Telefono = telefono;
		this.nrodepasajero = nrodepasajero;
	}




	public String getIDCliente() {
		return IDCliente;
	}

	public void setIDCliente(String iDCliente) {
		IDCliente = iDCliente;
	}

	public String getNombreCliente() {
		return NombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		NombreCliente = nombreCliente;
	}

	public String getApellidoCliente() {
		return ApellidoCliente;
	}

	public void setApellidoCliente(String apellidoCliente) {
		ApellidoCliente = apellidoCliente;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	public String getFechaNacimiento() {
		return FechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		FechaNacimiento = fechaNacimiento;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Pasaporte getPasaporte() {
		return Pasaporte;
	}

	public void setPasaporte(Pasaporte pasaporte) {
		Pasaporte = pasaporte;
	}

	public Telefono getTelefono() {
		return Telefono;
	}

	public void setTelefono(Telefono telefono) {
		Telefono = telefono;
	}

	public Pasajero getNrodepasajero() {
		return nrodepasajero;
	}

	public void setNrodepasajero(Pasajero nrodepasajero) {
		this.nrodepasajero = nrodepasajero;
	}


	
}
