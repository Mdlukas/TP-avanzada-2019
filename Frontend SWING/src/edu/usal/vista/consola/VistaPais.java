package edu.usal.vista.consola;

import java.util.List;

import edu.usal.domain.Pais;
import edu.usal.util.IOGeneral;

public class VistaPais {

	public int menu()
	{
		System.out.println("CRUD DE Pais!");
		
		System.out.println("1- Alta");
		System.out.println("2- Baja");
		System.out.println("3- Modificacion");
		System.out.println("4- Consulta");
		System.out.println("5- Listado");
		System.out.println("6- salir");
		return IOGeneral.leerInt("ingrese una opcion ", "solo nros.");
		
	}
	
	public Pais AltadePais()
	{
		Pais pais = new Pais();
        
		
		pais.setIDPais(IOGeneral.leerFrase("Ingrese IDPais: "));	
        pais.setNombrePais(IOGeneral.leerFrase("Ingrese Nombre Pais"));
		
		
		return pais;
	    
	}
	
	public Pais ModificaciondePais ()
	{
		Pais pais = new Pais();

		pais.setIDPais(IOGeneral.leerFrase("Ingrese IDPais: "));	

		pais.setIDPais(IOGeneral.leerFrase("Ingrese IDPais a Modificar: "));	
        pais.setNombrePais(IOGeneral.leerFrase("Ingrese Nombre Pais a Modificar"));
        
		return pais;
		 

	}
	
	
	public Pais BajadePais ()
	{
		System.out.println("Baja de Pais por ID: "+"\n"); 
		Pais pais = new Pais();
		
		pais.setIDPais(IOGeneral.leerLinea("Ingresa ID: para Realizar la Baja"));
		   
		return pais;
		 
	}
	
	public void ListadodePais (List <Pais> listado)
	{
		System.out.println("Mostrando "+"\n"); 
		
		for (Pais pais: listado)
		{
			
	       System.out.println("IDPais: "+pais.getIDPais());
           System.out.println("Nombre Pais: "+pais.getNombrePais());
		   System.out.println("\n");
		
		}

	}
	
	
	public Pais ConsultadePais ()
	{
		System.out.println("Cliente por ID: "+"\n"); 
		Pais Pais = new Pais();
		
		Pais.setIDPais(IOGeneral.leerLinea("Ingresa IDPais: "));
		   
		return Pais;

	}
	
	public void imprimirPais (Pais pais)  //extra
	{
		   System.out.println("Pais: "+"\n");
		
		   System.out.println("IDPais: "+pais.getIDPais());
           System.out.println("Nombre Pais: "+pais.getNombrePais()); 
		   
		   System.out.println("\n");
	}
	

}
