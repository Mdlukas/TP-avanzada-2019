package edu.usal.domain;

import java.io.Serializable;

public class Pasajero implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String IDnrodepasajero;
    private String alianza;  

	private String Numero;
	private String Categoria;
	private Cliente cliente;
    private Aerolinea aerolinea;
	
	public Pasajero() {}
	
	public Pasajero(String idnrodepasajero) { 
		IDnrodepasajero = idnrodepasajero;
	}


	public Pasajero(String iDnrodepasajero, String alianza, String numero, String categoria, Cliente cliente,
			Aerolinea aerolinea) {
		super();
		IDnrodepasajero = iDnrodepasajero;
		this.alianza = alianza;
		Numero = numero;
		Categoria = categoria;
		this.cliente = cliente;
		this.aerolinea = aerolinea;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getIDnrodepasajero() {
		return IDnrodepasajero;
	}


	public void setIDnrodepasajero(String iDnrodepasajero) {
		IDnrodepasajero = iDnrodepasajero;
	}

	public String getAlianza() {
		return alianza;
	}

	public void setAlianza(String alianza) {
		this.alianza = alianza;
	}

	public Aerolinea getAerolinea() {
		return aerolinea;
	}


	public void setAerolinea(Aerolinea aerolinea) {
		this.aerolinea = aerolinea;
	}


	public String getNumero() {
		return Numero;
	}


	public void setNumero(String numero) {
		Numero = numero;
	}


	public String getCategoria() {
		return Categoria;
	}


	public void setCategoria(String categoria) {
		Categoria = categoria;
	}
	
	
	
}
