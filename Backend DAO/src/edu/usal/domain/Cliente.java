package edu.usal.domain;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table
public class Cliente implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="IDCliente", unique = true)
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
	@Column(name = "EMAIL")
	private String mail;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idPasaporte")
	private Pasaporte Pasaporte;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idTelefono")
    private Telefono Telefono;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idPasajero")
	private Pasajero PasajeroFrecuente;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idDireccionCompleta")
	private Direccion direccion;


	public Cliente() {}

	public Cliente(Integer idCliente) {

		IDCliente = idCliente;
	}

	public Cliente(int idCliente, String nombreCliente, String apellidoCliente, String DNI, String MAIL, Date fechaNacimiento){
		this.IDCliente = idCliente;
		this.NombreCliente = nombreCliente;
		this.ApellidoCliente = apellidoCliente;
		this.dni = DNI;
		this.mail = MAIL;
		this.FechaNacimiento = fechaNacimiento;
	}

	public Cliente(int iDCliente, String nombreCliente, String apellidoCliente, String dni, String RS,
			Date fechaNacimiento, String mail) {
		super();
//		IDCliente = iDCliente;
		NombreCliente = nombreCliente;
		ApellidoCliente = apellidoCliente;
		this.dni = dni;
		this.RS = RS;
		FechaNacimiento = fechaNacimiento;
		this.mail = mail;
	}

	public Cliente(int iDCliente,
				   String nombreCliente,
				   String apellidoCliente,
				   String dni, String RS,
				   String fechaNacimiento,
				   String mail,
				   Pasaporte pasaporte,
				   Telefono telefono,
				   Pasajero nrodepasajero) {
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
		this.PasajeroFrecuente = nrodepasajero;
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

	public Pasajero getPasajeroFrecuente() {
		return PasajeroFrecuente;
	}

	public void setPasajeroFrecuente(Pasajero nrodepasajero) {
		this.PasajeroFrecuente = nrodepasajero;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
}
