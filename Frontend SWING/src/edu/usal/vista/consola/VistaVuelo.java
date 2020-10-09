package edu.usal.vista.consola;

import java.util.List;

import edu.usal.dao.negocio.Vuelo;
import edu.usal.util.IOGeneral;

public class VistaVuelo {
	
	
	public int menu()
	{
		System.out.println("CRUD DE Vuelo!");
		
		System.out.println("1- Alta");
		System.out.println("2- Baja");
		System.out.println("3- Modificacion");
		System.out.println("4- Consulta");
		System.out.println("5- Listado");
		System.out.println("6- salir");
		return IOGeneral.leerInt("ingrese una opcion ", "solo nros.");
		
	}
	
	public Vuelo AltadeVuelo()
	{
		Vuelo vuelo = new Vuelo();
        
		
		vuelo.setIDVuelo(IOGeneral.leerFrase("Ingrese IDVuelo: "));	
        vuelo.setNumerodeVuelo(IOGeneral.leerInt("Ingrese Numero de Vuelo: ", "debe ser numero!"));
		vuelo.setCantAsientos(IOGeneral.leerFrase("Ingrese cantidad de Asientos: "));
		vuelo.setFechaSalida(IOGeneral.leerFrase("Ingrese Fecha Salida: "));
		vuelo.setFechaLLegada(IOGeneral.leerFrase("Ingrese Fecha LLegada: "));
		vuelo.setTiempovuelo(IOGeneral.leerFrase("Ingrese Tiempo de Vuelo: "));
		
		vuelo.getAeropuertodeSalida().setIDAeropuerto(IOGeneral.leerInt("Ingrese IDAeripuerto de Salida", "debe ser Int"));
		vuelo.getAeropuertodeLLegada().setIDAeropuerto(IOGeneral.leerInt("Ingrese IDAeropuerto de LLegada", "debe ser INT"));
        vuelo.getAerolinea().setIDAerolinea(IOGeneral.leerFrase("Ingrese IDAerolinea: "));
		
		return vuelo;
	    
	}
	
	public Vuelo ModificaciondeVuelo ()
	{
	    Vuelo vuelo = new Vuelo();
        
	    System.out.println("Ingrese Datos a modificar: ");
		
		vuelo.setIDVuelo(IOGeneral.leerFrase("Ingrese IDVuelo: "));	
        vuelo.setNumerodeVuelo(IOGeneral.leerInt("Ingrese Numero de Vuelo: ", "debe ser numero!"));
		vuelo.setCantAsientos(IOGeneral.leerFrase("Ingrese cantidad de Asientos: "));
		vuelo.setFechaSalida(IOGeneral.leerFrase("Ingrese Fecha Salida: "));
		vuelo.setFechaLLegada(IOGeneral.leerFrase("Ingrese Fecha LLegada: "));
		vuelo.setTiempovuelo(IOGeneral.leerFrase("Ingrese Tiempo de Vuelo: "));
		
		vuelo.getAeropuertodeSalida().setIDAeropuerto(IOGeneral.leerInt("Ingrese IDAeripuerto de Salida", "debe ser Int"));
		vuelo.getAeropuertodeLLegada().setIDAeropuerto(IOGeneral.leerInt("Ingrese IDAeropuerto de LLegada", "debe ser INT"));
        vuelo.getAerolinea().setIDAerolinea(IOGeneral.leerFrase("Ingrese IDAerolinea: "));
        
		return vuelo;
		 

	}
	
	
	public Vuelo BajadeVuelo ()
	{
		System.out.println("Baja de Vuelo por ID: "+"\n"); 
		Vuelo vuelo = new Vuelo();
		
		vuelo.setIDVuelo(IOGeneral.leerLinea("Ingresa ID: para Realizar la Baja"));
		   
		return vuelo;
		 
	}
	
	public void ListadodeVuelo (List <Vuelo> listado)
	{
		System.out.println("Mostrando "+"\n"); 
		
		for (Vuelo vuelo: listado)
		{
			
	       System.out.println("IDVuelo: "+vuelo.getIDVuelo());
	       System.out.println("Numero de Vuelo: "+vuelo.getNumerodeVuelo());
	       System.out.println("Cantidad de Asientos: "+vuelo.getCantAsientos());
	       System.out.println("Fecha de Salida: "+vuelo.getFechaSalida());
	       System.out.println("Fecha de LLegada: "+vuelo.getFechaLLegada());
	       System.out.println("Tiempo de Vuelo: "+vuelo.getTiempovuelo());
	       
	       System.out.println("IDAeropuerto Salida: "+vuelo.getAeropuertodeSalida().getIDAeropuerto());
	       System.out.println("IDAeropuerto LLegada: "+vuelo.getAeropuertodeLLegada().getIDAeropuerto());
	       System.out.println("IDAerolinea:"+vuelo.getAerolinea().getIDAerolinea());
	       
		   System.out.println("\n");
		
		}

	}
	
	
	public Vuelo ConsultadeVuelo ()
	{
		System.out.println("Cliente por ID: "+"\n"); 
		Vuelo Vuelo = new Vuelo();
		
		Vuelo.setIDVuelo(IOGeneral.leerLinea("Ingresa IDVuelo: "));
		   
		return Vuelo;

	}
	
	public void imprimirVuelo (Vuelo vuelo)  //extra
	{
		
		   System.out.println("IDVuelo: "+vuelo.getIDVuelo());
	       System.out.println("Numero de Vuelo: "+vuelo.getNumerodeVuelo());
	       System.out.println("Cantidad de Asientos: "+vuelo.getCantAsientos());
	       System.out.println("Fecha de Salida: "+vuelo.getFechaSalida());
	       System.out.println("Fecha de LLegada: "+vuelo.getFechaLLegada());
	       System.out.println("Tiempo de Vuelo: "+vuelo.getTiempovuelo());
	       
	       System.out.println("IDAeropuerto Salida: "+vuelo.getAeropuertodeSalida().getIDAeropuerto());
	       System.out.println("IDAeropuerto LLegada: "+vuelo.getAeropuertodeLLegada().getIDAeropuerto());
	       System.out.println("IDAerolinea:"+vuelo.getAerolinea().getIDAerolinea());
	       
		   System.out.println("\n");
		   
	}
	

	
	

}
