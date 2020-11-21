package edu.usal.domain;

public class Aerolinea {
	
	private String IDAerolinea;
	private String NombreAereoLinea;
	private String Alianza;
	
	public Aerolinea() {}
	
	public Aerolinea(String idAerolinea) {
		IDAerolinea = idAerolinea;
	}
	
	public Aerolinea(String iDAerolinea, String nombreAereoLinea, String alianza) {
		super();
		IDAerolinea = iDAerolinea;
		NombreAereoLinea = nombreAereoLinea;
		Alianza = alianza;
	}


	public String getIDAerolinea() {
		return IDAerolinea;
	}


	public void setIDAerolinea(String iDAerolinea) {
		IDAerolinea = iDAerolinea;
	}


	public String getNombreAereoLinea() {
		return NombreAereoLinea;
	}

	
	public void setNombreAereoLinea(String nombreAereoLinea) {
		NombreAereoLinea = nombreAereoLinea;
	}


	public String getAlianza() {
		return Alianza;
	}


	public void setAlianza(String alianza) {
		Alianza = alianza;
	}
	


}
