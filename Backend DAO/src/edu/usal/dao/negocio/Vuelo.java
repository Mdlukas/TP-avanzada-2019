package edu.usal.dao.negocio;


public class Vuelo {
	
   private String IDVuelo;
   private int NumerodeVuelo;
   private String cantAsientos;
   private String fechaSalida;
   private String fechaLLegada;
   private String tiempovuelo;
   

   private Aeropuerto aeropuertodeSalida;
   private Aeropuerto aeropuertodeLLegada; 
   private Aerolinea  aerolinea;
   
   public Vuelo() {}
   public Vuelo(String idvuelo) {
	   IDVuelo = idvuelo;
   }
   

public Vuelo(String iDVuelo, int numerodeVuelo, String cantAsientos, String fechaSalida, String fechaLLegada,
		String tiempovuelo, Aeropuerto aeropuertodeSalida, Aeropuerto aeropuertodeLLegada, Aerolinea aerolinea) {
	super();
	IDVuelo = iDVuelo;
	NumerodeVuelo = numerodeVuelo;
	this.cantAsientos = cantAsientos;
	this.fechaSalida = fechaSalida;
	this.fechaLLegada = fechaLLegada;
	this.tiempovuelo = tiempovuelo;
	this.aeropuertodeSalida = aeropuertodeSalida;
	this.aeropuertodeLLegada = aeropuertodeLLegada;
	this.aerolinea = aerolinea;
}




public Aeropuerto getAeropuertodeSalida() {
	return aeropuertodeSalida;
}
public void setAeropuertodeSalida(Aeropuerto aeropuertodeSalida) {
	this.aeropuertodeSalida = aeropuertodeSalida;
}
public Aeropuerto getAeropuertodeLLegada() {
	return aeropuertodeLLegada;
}
public void setAeropuertodeLLegada(Aeropuerto aeropuertodeLLegada) {
	this.aeropuertodeLLegada = aeropuertodeLLegada;
}
public Aerolinea getAerolinea() {
	return aerolinea;
}
public void setAerolinea(Aerolinea aerolinea) {
	this.aerolinea = aerolinea;
}
public String getIDVuelo() {
	return IDVuelo;
}
public void setIDVuelo(String iDVuelo) {
	IDVuelo = iDVuelo;
}
public int getNumerodeVuelo() {
	return NumerodeVuelo;
}

public void setNumerodeVuelo(int numerodeVuelo) {
	NumerodeVuelo = numerodeVuelo;
}



public String getCantAsientos() {
	return cantAsientos;
}



public void setCantAsientos(String cantAsientos) {
	this.cantAsientos = cantAsientos;
}



public String getFechaSalida() {
	return fechaSalida;
}



public void setFechaSalida(String fechaSalida) {
	this.fechaSalida = fechaSalida;
}



public String getFechaLLegada() {
	return fechaLLegada;
}



public void setFechaLLegada(String fechaLLegada) {
	this.fechaLLegada = fechaLLegada;
}



public String getTiempovuelo() {
	return tiempovuelo;
}



public void setTiempovuelo(String tiempovuelo) {
	this.tiempovuelo = tiempovuelo;
}



}
