package edu.usal.vista.consola;

import java.util.List;

import edu.usal.dao.negocio.Provincia;
import edu.usal.util.IOGeneral;

public class VistaProvincia {

	
	
	
	public int menu()
	{
		System.out.println("CRUD DE Provincia!");
		
		System.out.println("1- Alta");
		System.out.println("2- Baja");
		System.out.println("3- Modificacion");
		System.out.println("4- Consulta");
		System.out.println("5- Listado");
		System.out.println("6- salir");
		return IOGeneral.leerInt("ingrese una opcion ", "solo nros.");
		
	}
	
	public Provincia AltadeProvincia()
	{
		Provincia Provincia = new Provincia();
        
		
		Provincia.setIDProvincia(IOGeneral.leerFrase("Ingrese IDProvincia: "));	
        Provincia.setNombreProvincia(IOGeneral.leerFrase("Ingrese Nombre Provincia"));
		
		
		return Provincia;
	    
	}
	
	public Provincia ModificaciondeProvincia ()
	{
		Provincia Provincia = new Provincia();

		Provincia.setIDProvincia(IOGeneral.leerFrase("Ingrese IDProvincia: "));	
        Provincia.setNombreProvincia(IOGeneral.leerFrase("Ingrese Nombre Provincia"));
        
		return Provincia;
		 

	}
	
	
	public Provincia BajadeProvincia ()
	{
		System.out.println("Baja de Provincia por ID: "+"\n"); 
		Provincia Provincia = new Provincia();
		
		Provincia.setIDProvincia(IOGeneral.leerLinea("Ingresa ID: para Realizar la Baja"));
		   
		return Provincia;
		 
	}
	
	public void ListadodeProvincia (List <Provincia> listado)
	{
		System.out.println("Mostrando "+"\n"); 
		
		for (Provincia Provincia: listado)
		{
			
	       System.out.println("IDProvincia: "+Provincia.getIDProvincia());
           System.out.println("Nombre Provincia: "+Provincia.getNombreProvincia());
		   System.out.println("\n");
		
		}

	}
	
	
	public Provincia ConsultadeProvincia ()
	{
		System.out.println("Cliente por ID: "+"\n"); 
		Provincia Provincia = new Provincia();
		
		Provincia.setIDProvincia(IOGeneral.leerLinea("Ingresa IDProvincia: "));
		   
		return Provincia;

	}
	
	public void imprimirProvincia (Provincia Provincia)  //extra
	{
		   System.out.println("Provincia: "+"\n");
		
		   System.out.println("IDProvincia: "+Provincia.getIDProvincia());
           System.out.println("Nombre Provincia: "+Provincia.getNombreProvincia()); 
		   
		   System.out.println("\n");
	}
	


	
	
	
	
}
