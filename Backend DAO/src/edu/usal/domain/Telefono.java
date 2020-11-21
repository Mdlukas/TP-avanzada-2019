package edu.usal.domain;

import java.io.Serializable;

public class Telefono implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String IDTelefono;
	private Cliente Cliente;

	private String NumeroCelular;
	private String NumeroLaboral;
	private String NumeroPersonal;

	

	public Telefono() {}

	public Telefono(String str) {
		IDTelefono = str;
	}
	
	public Telefono(String iDTelefono, Cliente iDCliente, String numeroPersonal, String numeroCelular,
			String numeroLaboral) {
		super();
		IDTelefono = iDTelefono;
		Cliente = iDCliente;
		NumeroPersonal = numeroPersonal;
		NumeroCelular = numeroCelular;
		NumeroLaboral = numeroLaboral;
	}

	public String getIDTelefono() {
		return IDTelefono;
	}

	public void setIDTelefono(String iDTelefono) {
		IDTelefono = iDTelefono;
	}

	public String getNumeroPersonal() {
		return NumeroPersonal;
	}

	public void setNumeroPersonal(String numeroPersonal) {
		NumeroPersonal = numeroPersonal;
	}

	public String getNumeroCelular() {
		return NumeroCelular;
	}

	public void setNumeroCelular(String numeroCelular) {
		NumeroCelular = numeroCelular;
	}

	public String getNumeroLaboral() {
		return NumeroLaboral;
	}

	public void setNumeroLaboral(String numeroLaboral) {
		NumeroLaboral = numeroLaboral;
	}
	
	public Cliente getCliente() {
		return Cliente;
	}

	public void setCliente(Cliente cliente) {
		Cliente = cliente;
	}

}
