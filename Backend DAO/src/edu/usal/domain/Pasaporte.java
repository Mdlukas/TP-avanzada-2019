package edu.usal.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Pasaporte")
public class Pasaporte implements Serializable {

	@Id
	@Column(name="IDPasaporte")
	private int IDPasaporte;

	@Basic
	@Column(name = "NUMpasaporte")
	private String NrodePasaporte;

	@Basic
	@Column(name = "AutoridadEmision")
	private String AutoridadEmision;

	@Basic
	@Column(name = "FECHAemision")
	private Date fechadeEmision;

	@Basic
	@Column(name = "FECHAVencimiento")
    private Date fechadeVencimiento;

	@Basic
	@Column(name = "PaisEmision")
	private String paisEmision;


	public Pasaporte() { }

	public Pasaporte(int idPasaporte) {
		IDPasaporte = idPasaporte;  
	}
	


	public Pasaporte(int iDPasaporte, String nrodePasaporte, String autoridadEmision, Date fechadeEmision,
					 Date fechadeVencimiento, String pais) {
		super();
		IDPasaporte = iDPasaporte;
		NrodePasaporte = nrodePasaporte;
		AutoridadEmision = autoridadEmision;
		this.fechadeEmision = fechadeEmision;
		this.fechadeVencimiento = fechadeVencimiento;
		paisEmision = pais;
	}

	public int getIDPasaporte() {
		return IDPasaporte;
	}


	public void setIDPasaporte(int iDPasaporte) {
		IDPasaporte = iDPasaporte;
	}


	public String getNrodePasaporte() {
		return NrodePasaporte;
	}


	public void setNrodePasaporte(String nrodePasaporte) {
		NrodePasaporte = nrodePasaporte;
	}


	public String getAutoridadEmision() {
		return AutoridadEmision;
	}


	public void setAutoridadEmision(String autoridadEmision) {
		AutoridadEmision = autoridadEmision;
	}


	public Date getFechadeEmision() {
		return fechadeEmision;
	}


	public void setFechadeEmision(Date fechadeEmision) {
		this.fechadeEmision = fechadeEmision;
	}


	public Date getFechadeVencimiento() {
		return fechadeVencimiento;
	}


	public void setFechadeVencimiento(Date fechadeVencimiento) {
		this.fechadeVencimiento = fechadeVencimiento;
	}

	public String getPaisEmision() {
		return paisEmision;
	}

	public void setPaisEmision(String paisEmision) {
		this.paisEmision = paisEmision;
	}

	@Override
	public String toString() {
		return "Pasaporte{" +
				"IDPasaporte=" + IDPasaporte +
				", NrodePasaporte='" + NrodePasaporte + '\'' +
				", AutoridadEmision='" + AutoridadEmision + '\'' +
				", fechadeEmision=" + fechadeEmision +
				", fechadeVencimiento=" + fechadeVencimiento +
				", paisEmision='" + paisEmision + '\'' +
				'}';
	}
}
