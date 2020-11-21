package edu.usal.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class Telefono implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="IDTelefono")
	private int IDTelefono;

	@Basic
	@Column(name = "NUMcelular")
	private String NumeroCelular;

	@Basic
	@Column(name = "NUMlaboral")
	private String NumeroLaboral;

	@Basic
	@Column(name = "NUMpersonal")
	private String NumeroPersonal;

	

	public Telefono() {}

	public Telefono(int id) {
		IDTelefono = id;
	}
	
	public Telefono(int iDTelefono,String numeroPersonal, String numeroCelular,
			String numeroLaboral) {
		super();
		IDTelefono = iDTelefono;
		NumeroPersonal = numeroPersonal;
		NumeroCelular = numeroCelular;
		NumeroLaboral = numeroLaboral;
	}

	public int getIDTelefono() {
		return IDTelefono;
	}

	public void setIDTelefono(int iDTelefono) {
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


	@Override
	public String toString() {
		return "Telefono{" +
				"IDTelefono=" + IDTelefono +
				", NumeroCelular='" + NumeroCelular + '\'' +
				", NumeroLaboral='" + NumeroLaboral + '\'' +
				", NumeroPersonal='" + NumeroPersonal + '\'' +
				'}';
	}
}
