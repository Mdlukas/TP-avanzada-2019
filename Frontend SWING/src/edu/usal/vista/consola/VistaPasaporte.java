package edu.usal.vista.consola;

import java.util.List;

import edu.usal.domain.Pasaporte;
import edu.usal.util.IOGeneral;

public class VistaPasaporte {
	
	
	public int menu()
	{
		System.out.println("CRUD DE Pasaporte!");
		
		System.out.println("1- Alta");
		System.out.println("2- Baja");
		System.out.println("3- Modificacion");
		System.out.println("4- Consulta");
		System.out.println("5- Listado");
		System.out.println("6- salir");
		return IOGeneral.leerInt("ingrese una opcion ", "solo nros.");
		
	}
	
	public Pasaporte AltadePasaporte()
	{
		Pasaporte pasaporte = new Pasaporte();
        
		
		pasaporte.setIDPasaporte(IOGeneral.leerFrase("Ingrese IDPasaporte: "));	
        pasaporte.setNrodePasaporte(IOGeneral.leerFrase("Ingrese Nro de Pasaporte"));
        pasaporte.setAutoridadEmision(IOGeneral.leerFrase("Ingrese la Autoridad Emision: "));
		pasaporte.setFechadeEmision(IOGeneral.leerFrase("Ingrese la Fecha de Emision: "));
		pasaporte.setFechadeVencimiento(IOGeneral.leerFrase("Ingrese Fecha de Vencimiento: "));
		
		pasaporte.getPais().setIDPais(IOGeneral.leerFrase("Ingrese IDPais: "));
//		pasaporte.getCliente().setIDCliente("Ingrese IDCliente: ");
		
		return pasaporte;
	    
	}
	
	public Pasaporte ModificaciondePasaporte ()
	{
		Pasaporte pasaporte = new Pasaporte();
		
		System.out.println("Ingrese Datos a Modificar: ");

		pasaporte.setIDPasaporte(IOGeneral.leerFrase("Ingrese IDPasaporte: "));	
        pasaporte.setNrodePasaporte(IOGeneral.leerFrase("Ingrese Nro de Pasaporte"));
        pasaporte.setAutoridadEmision(IOGeneral.leerFrase("Ingrese la Autoridad Emision: "));
		pasaporte.setFechadeEmision(IOGeneral.leerFrase("Ingrese la Fecha de Emision: "));
		pasaporte.setFechadeVencimiento(IOGeneral.leerFrase("Ingrese Fecha de Vencimiento: "));
		
		pasaporte.getPais().setIDPais(IOGeneral.leerFrase("Ingrese IDPais: "));
//		pasaporte.getCliente().setIDCliente("Ingrese IDCliente: ");
        
		return pasaporte;
		 

	}
	
	
	public Pasaporte BajadePasaporte ()
	{
		System.out.println("Baja de Pasaporte por ID: "+"\n"); 
		
		Pasaporte pasaporte = new Pasaporte();
		
		pasaporte.setIDPasaporte(IOGeneral.leerLinea("Ingresa ID: para Realizar la Baja"));
		   
		return pasaporte;
		 
	}
	
	public void ListadodePasaporte (List <Pasaporte> listado)
	{
		System.out.println("Mostrando "+"\n"); 
		
		for (Pasaporte pasaporte: listado)
		{
			
	       System.out.println("IDPasaporte: "+pasaporte.getIDPasaporte());
           System.out.println("Nro de Pasaporte: "+pasaporte.getNrodePasaporte());
		   System.out.println("Autoridad Emision: " + pasaporte.getAutoridadEmision());
		   System.out.println("Fecha Emision: "+pasaporte.getFechadeEmision());
		   System.out.println("Fecha de Vencimiento: "+pasaporte.getFechadeVencimiento());
		   System.out.println("IDPais: "+pasaporte.getPais().getIDPais());
		   System.out.println("IDCliente: "+pasaporte.getCliente().getIDCliente());
		   
		   
		   System.out.println("\n");
		
		}

	}
	
	
	public Pasaporte ConsultadePasaporte ()
	{
		System.out.println("Cliente por ID: "+"\n"); 
		Pasaporte pasaporte = new Pasaporte();
		
		pasaporte.setIDPasaporte(IOGeneral.leerLinea("Ingresa IDPasaporte: "));
		   
		return pasaporte;

	}
	
	public void imprimirPasaporte (Pasaporte pasaporte)  //extra
	{
		   System.out.println("Pasaporte: "+"\n");
		
	       System.out.println("IDPasaporte: "+pasaporte.getIDPasaporte());
           System.out.println("Nro de Pasaporte: "+pasaporte.getNrodePasaporte());
		   System.out.println("Autoridad Emision: " + pasaporte.getAutoridadEmision());
		   System.out.println("Fecha Emision: "+pasaporte.getFechadeEmision());
		   System.out.println("Fecha de Vencimiento: "+pasaporte.getFechadeVencimiento());
		   System.out.println("IDPais: "+pasaporte.getPais().getIDPais());
		   System.out.println("IDCliente: "+pasaporte.getCliente().getIDCliente());
		   
		   System.out.println("\n");
	}
	

}
