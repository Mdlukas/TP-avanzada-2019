package edu.usal.domain;

public class Aeropuerto {

	
	private int IDAeropuerto;	
	private String CodigodeAeropuerto;
	private String Ciudad;
	
	private Pais pais;
	private Provincia provincia;
	
	public Aeropuerto() {}
	
	public Aeropuerto(int str) {
		
		IDAeropuerto = str;
	}
	




	public Aeropuerto(int iDAeropuerto, String codigodeAeropuerto, String ciudad, Pais pais, Provincia provincia) {
		super();
		IDAeropuerto = iDAeropuerto;
		CodigodeAeropuerto = codigodeAeropuerto;
		Ciudad = ciudad;
		this.pais = pais;
		this.provincia = provincia;
	}

	public Aeropuerto( String codigodeAeropuerto, String ciudad, Pais pais, Provincia provincia) {
		super();
		CodigodeAeropuerto = codigodeAeropuerto;
		Ciudad = ciudad;
		this.pais = pais;
		this.provincia = provincia;
	}

	
	


	public int getIDAeropuerto() {
		return IDAeropuerto;
	}

	public void setIDAeropuerto(int iDAeropuerto) {
		IDAeropuerto = iDAeropuerto;
	}

	public String getCodigodeAeropuerto() {
		return CodigodeAeropuerto;
	}


	public void setCodigodeAeropuerto(String codigodeAeropuerto) {
		CodigodeAeropuerto = codigodeAeropuerto;
	}


	public String getCiudad() {
		return Ciudad;
	}


	public void setCiudad(String ciudad) {
		Ciudad = ciudad;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

	
}
