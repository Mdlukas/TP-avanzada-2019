package edu.usal.domain;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "Pais")
public class Pais implements Serializable{

	@Id
	@Column(name="IDPais")
	private int IDPais;

	@Basic
	@Column(name = "Pais")
	private String NombrePais;
	


	public int getIDPais() {
		return IDPais;
	}


	public void setIDPais(int iDPais) {
		IDPais = iDPais;
	}


	public String getNombrePais() {
		return NombrePais;
	}

	public void setNombrePais(String nombrePais) {
		NombrePais = nombrePais;
	}


	@Override
	public String toString() {
		return "Pais{" +
				"IDPais=" + IDPais +
				", NombrePais='" + NombrePais + '\'' +
				'}';
	}
}
