package edu.usal.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

//crear dao que falta y completar clases;
@Entity
@Table
public class Cliente implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="IDCliente")
	private int IDCliente;

	@Basic
	@Column(name = "NombreCliente")
	private String NombreCliente;

	@Basic
	@Column(name = "ApellidoCliente")
	private String ApellidoCliente;

	@Basic
	@Column(name = "dni")
	private String dni;

	@Basic
	@Column(name = "RS")
	private String RS;

	@Basic
	@Column(name = "FechaNacimiento")
	private Date FechaNacimiento;

	@Basic
	@Column(name = "mail")
	private String mail;

	@Transient
	private Pasaporte Pasaporte;
	@Transient
    private Telefono Telefono;
	@Transient
	private Pasajero nrodepasajero;




	public Cliente() {}

	public Cliente(Integer idCliente) {

		IDCliente = idCliente;
	}

	public Cliente(int iDCliente, String nombreCliente, String apellidoCliente, String dni, String RS,
			Date fechaNacimiento, String mail) {
		super();
		IDCliente = iDCliente;
		NombreCliente = nombreCliente;
		ApellidoCliente = apellidoCliente;
		this.dni = dni;
		this.RS = RS;
		FechaNacimiento = fechaNacimiento;
		this.mail = mail;
	}

	public Cliente(int iDCliente, String nombreCliente, String apellidoCliente, String dni, String RS,
				   String fechaNacimiento, String mail, edu.usal.domain.Pasaporte pasaporte,
				   edu.usal.domain.Telefono telefono, Pasajero nrodepasajero) {
		super();
		IDCliente = iDCliente;
		NombreCliente = nombreCliente;
		ApellidoCliente = apellidoCliente;
		this.dni = dni;
		this.RS = RS;
		FechaNacimiento = null;
		this.mail = mail;
		Pasaporte = pasaporte;
		Telefono = telefono;
		this.nrodepasajero = nrodepasajero;
	}

	public int getIDCliente() {
		return IDCliente;
	}

	public void setIDCliente(int iDCliente) {
		IDCliente = iDCliente;
	}


    public String getNombreCliente() {
		return NombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		NombreCliente = nombreCliente;
	}


    public String getApellidoCliente() {
		return ApellidoCliente;
	}

	public void setApellidoCliente(String apellidoCliente) {
		ApellidoCliente = apellidoCliente;
	}


    public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}


    public String getRS() {
		return RS;
	}

	public void setRS(String RS) {
		this.RS = RS;
	}


    public Date getFechaNacimiento() {
		return FechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		FechaNacimiento = fechaNacimiento;
	}


    public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Pasaporte getPasaporte() {
		return Pasaporte;
	}

	public void setPasaporte(Pasaporte pasaporte) {
		Pasaporte = pasaporte;
	}

	public Telefono getTelefono() {
		return Telefono;
	}

	public void setTelefono(Telefono telefono) {
		Telefono = telefono;
	}

	public Pasajero getNrodepasajero() {
		return nrodepasajero;
	}

	public void setNrodepasajero(Pasajero nrodepasajero) {
		this.nrodepasajero = nrodepasajero;
	}



}
