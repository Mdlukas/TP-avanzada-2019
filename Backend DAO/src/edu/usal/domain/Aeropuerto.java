package edu.usal.domain;

import javax.persistence.*;

@Entity
@Table(name = "Aeropuerto")
public class Aeropuerto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDAeropuerto", unique = true)
	private int IDAeropuerto;

	@Basic
	@Column(name = "IdentificacionAeropuerto")
	private String CodigodeAeropuerto;

	@Basic
	@Column(name = "Ciudad")
	private String Ciudad;

	@Basic
	@Column(name = "Provincia")
	private Provincia provincia;

	@OneToOne
	@JoinColumn(name = "idPais")
	private Pais pais;


	public Aeropuerto() {}


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

	@Override
	public String toString() {
		return "Aeropuerto{" +
				"IDAeropuerto=" + IDAeropuerto +
				", CodigodeAeropuerto='" + CodigodeAeropuerto + '\'' +
				", Ciudad='" + Ciudad + '\'' +
				", provincia=" + provincia +
				", pais=" + pais.getNombrePais() +
				'}';
	}
}
