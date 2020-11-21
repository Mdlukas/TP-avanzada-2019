package edu.usal.domain;

import java.io.Serializable;

public class Provincia implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String IDProvincia;
	private String NombreProvincia;
	
	public Provincia() {}
	
	public Provincia(String str) {
		
		IDProvincia = str;
	}
	
	public Provincia(String iDProvincia, String nombreProvincia) {
		super();
		IDProvincia = iDProvincia;
		NombreProvincia = nombreProvincia;
	}


	public String getIDProvincia() {
		return IDProvincia;
	}


	public void setIDProvincia(String iDProvincia) {
		IDProvincia = iDProvincia;
	}


	public String getNombreProvincia() {
		return NombreProvincia;
	}


	public void setNombreProvincia(String nombreProvincia) {
		NombreProvincia = nombreProvincia;
	}
	
	
}