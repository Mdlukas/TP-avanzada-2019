package edu.usal.domain;


import javax.persistence.*;

@Entity
@Table(name = "DireccionCompleta")
public class Direccion {

	@Id
	@Column(name="IDDireccion")
	private int IDDireccion;

	@Basic
	@Column(name = "Calle")
	private String calle;

	@Basic
	@Column(name = "Altura")
	private String altura;

	@Basic
	@Column(name = "Ciudad")
	private String ciudad;

	@Basic
	@Column(name = "CodPostal")
	private String codigoPostal;


	@OneToOne
	@JoinColumn(name = "idPais")
	private Pais Pais;

	@Basic
	@Column(name = "Provincia")
	private String Provincia;


	
	public Direccion() {}



	public Direccion(int iDDireccion,
					 String calle,
					 String altura,
					 String ciudad,
					 String codigoPostal,
                     Pais pais,
					 String provincia) {
		super();
		IDDireccion = iDDireccion;
		this.calle = calle;
		this.altura = altura;
		this.ciudad = ciudad;
		this.codigoPostal = codigoPostal;
		Pais = pais;
		Provincia = provincia;
	}



	public int getIDDireccion() {
		return IDDireccion;
	}
	public void setIDDireccion(int iDdireccion) {
		IDDireccion = iDdireccion;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getAltura() {
		return altura;
	}
	public void setAltura(String altura) {
		this.altura = altura;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}


	public Pais getPais() {
		return Pais;
	}


	public void setPais(Pais pais) {
		Pais = pais;
	}


	public String getProvincia() {
		return Provincia;
	}


	public void setProvincia(String provincia) {
		Provincia = provincia;
	}


	@Override
	public String toString() {
		return "Direccion{" +
				"IDDireccion=" + IDDireccion +
				", calle='" + calle + '\'' +
				", altura='" + altura + '\'' +
				", ciudad='" + ciudad + '\'' +
				", codigoPostal='" + codigoPostal + '\'' +
				", Pais=" + Pais.toString() +
				", Provincia='" + Provincia + '\'' +
				'}';
	}
}
