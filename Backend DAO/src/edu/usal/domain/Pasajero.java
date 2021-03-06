package edu.usal.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "PasajeroFrecuente")
public class Pasajero implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="IDPasajeroFrecuente", unique = true)
	private int IDnrodepasajero;

	@Basic
	@Column(name = "Numero")
	private String Numero;


	@Basic
	@Column(name = "Categoria")
	private String Categoria;

	@OneToOne
	@JoinColumn(name = "idAerolinea")
    private Aerolinea aerolinea;
	
	public Pasajero() {}
	
	public Pasajero(int idnrodepasajero) {
		IDnrodepasajero = idnrodepasajero;
	}


	public Pasajero(int iDnrodepasajero,
					String numero,
					String categoria,
					Aerolinea aerolinea) {
		super();
		IDnrodepasajero = iDnrodepasajero;
		Numero = numero;
		Categoria = categoria;
		this.aerolinea = aerolinea;
	}

	public int getIDnrodepasajero() {
		return IDnrodepasajero;
	}

	public void setIDnrodepasajero(int iDnrodepasajero) {
		IDnrodepasajero = iDnrodepasajero;
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

	@Override
	public String toString() {
		return "Pasajero{" +
				"IDnrodepasajero=" + IDnrodepasajero +
				", Numero='" + Numero + '\'' +
				", Categoria='" + Categoria + '\'' +
				", aerolinea=" + aerolinea +
				'}';
	}
}
