package edu.usal.domain;

import java.io.Serializable;

public class Pais implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String IDPais;
	private String NombrePais;
	
	public Pais() {}
	
	
	public Pais(String str) 
	{
		
		IDPais = str;
	}
	
	
	public Pais(String iDPais, String nombrePais) {
		super();
		IDPais = iDPais;
		NombrePais = nombrePais;
	}


	public String getIDPais() {
		return IDPais;
	}


	public void setIDPais(String iDPais) {
		IDPais = iDPais;
	}


	public String getNombrePais() {
		return NombrePais;
	}


	public void setNombrePais(String nombrePais) {
		NombrePais = nombrePais;
	}
	
	
	

}
