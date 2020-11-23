package edu.usal.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "LineasAereas")
public class Aerolinea implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="IDLineaAerea", unique = true)
	private int IDAerolinea;

	@Basic
	@Column(name = "NombreAerolinea")
	private String NombreAereoLinea;

	@Basic
	@Column(name = "Alianza")
	private String Alianza;
	
	public Aerolinea() {}
	
	public Aerolinea(int idAerolinea) {
		IDAerolinea = idAerolinea;
	}
	
	public Aerolinea(int iDAerolinea, String nombreAereoLinea, String alianza) {
		super();
		IDAerolinea = iDAerolinea;
		NombreAereoLinea = nombreAereoLinea;
		Alianza = alianza;
	}


	public int getIDAerolinea() {
		return IDAerolinea;
	}


	public void setIDAerolinea(int iDAerolinea) {
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
