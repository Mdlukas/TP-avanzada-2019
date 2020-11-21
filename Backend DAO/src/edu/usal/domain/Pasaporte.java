package edu.usal.domain;

import java.io.Serializable;

public class Pasaporte implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String IDPasaporte;
	private String  NrodePasaporte;
	private String AutoridadEmision;
	private String fechadeEmision;
    private String fechadeVencimiento;
    
	private Pais Pais;
	private Cliente Cliente;
	

	public Pasaporte() { }

	public Pasaporte(String idPasaporte) {
		IDPasaporte = idPasaporte;  
	}
	


	public Pasaporte(String iDPasaporte, String nrodePasaporte, String autoridadEmision, String fechadeEmision,
                     String fechadeVencimiento, edu.usal.domain.Pais pais, edu.usal.domain.Cliente cliente) {
		super();
		IDPasaporte = iDPasaporte;
		NrodePasaporte = nrodePasaporte;
		AutoridadEmision = autoridadEmision;
		this.fechadeEmision = fechadeEmision;
		this.fechadeVencimiento = fechadeVencimiento;
		Pais = pais;
		Cliente = cliente;
	}

	public String getIDPasaporte() {
		return IDPasaporte;
	}


	public void setIDPasaporte(String iDPasaporte) {
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


	public String getFechadeEmision() {
		return fechadeEmision;
	}


	public void setFechadeEmision(String fechadeEmision) {
		this.fechadeEmision = fechadeEmision;
	}


	public String getFechadeVencimiento() {
		return fechadeVencimiento;
	}


	public void setFechadeVencimiento(String fechadeVencimiento) {
		this.fechadeVencimiento = fechadeVencimiento;
	}

	
	public Pais getPais() {
		return Pais;
	}

	public void setPais(Pais pais) {
		Pais = pais;
	}

	public Cliente getCliente() {
		return Cliente;
	}

	public void setCliente(Cliente cliente) {
		Cliente = cliente;
	}
    

}
