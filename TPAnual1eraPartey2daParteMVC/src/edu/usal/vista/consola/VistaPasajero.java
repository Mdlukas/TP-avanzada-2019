package edu.usal.vista.consola;

import java.util.List;

import edu.usal.dao.negocio.Cliente;
import edu.usal.dao.negocio.Pasajero;
import edu.usal.util.IOGeneral;

public class VistaPasajero {

	
	
	public int menu()
	{
		System.out.println("CRUD DE Pasajero!");
		
		System.out.println("1- Alta");
		System.out.println("2- Baja");
		System.out.println("3- Modificacion");
		System.out.println("4- Consulta");
		System.out.println("5- Listado");
		System.out.println("6- salir");
		return IOGeneral.leerInt("ingrese una opcion ", "solo nros.");
		
	}
	
	public Pasajero AltadePasajero()
	{
		Pasajero pasajero = new Pasajero();
        
		Cliente cliente = new Cliente();
		
        pasajero.setCliente(cliente);
		
		pasajero.setIDnrodepasajero(IOGeneral.leerFrase("Ingrese IDPasajero: "));	
        pasajero.setAlianza(IOGeneral.leerFrase("Ingrese el n Alianza: "));
		pasajero.setNumero(IOGeneral.leerFrase("Ingrese el Numero: "));
		pasajero.setCategoria(IOGeneral.leerFrase("Ingrese nombre de Categoria"));
		
		
		pasajero.getCliente().setIDCliente(IOGeneral.leerFrase("Ingrese IDCliente: "));
		pasajero.getAerolinea().setIDAerolinea(IOGeneral.leerFrase("Ingrese el IDAerolinea: "));
		
		return pasajero;
	    
	}
	
	public Pasajero ModificaciondePasajero ()
	{
        
		Pasajero pasajero = new Pasajero();
        
		
		pasajero.setIDnrodepasajero(IOGeneral.leerFrase("Ingrese IDPasajero: "));	
        pasajero.setAlianza(IOGeneral.leerFrase("Ingrese el n Alianza: "));
		pasajero.setNumero(IOGeneral.leerFrase("Ingrese el Numero: "));
		pasajero.setCategoria(IOGeneral.leerFrase("Ingrese nombre de Categoria"));
		
		pasajero.getCliente().setIDCliente(IOGeneral.leerFrase("Ingrese IDCliente: "));
		pasajero.getAerolinea().setIDAerolinea(IOGeneral.leerFrase("Ingrese el IDAerolinea: "));
		
		return pasajero;

	}
	
	
	public Pasajero BajadePasajero ()
	{
		System.out.println("Baja de Pasajero por ID: "+"\n"); 
		Pasajero Pasajero = new Pasajero();
		
		Pasajero.setIDnrodepasajero(IOGeneral.leerLinea("Ingresa ID: para Realizar la Baja"));
		   
		return Pasajero;
		 
	}
	
	public void ListadodePasajero (List <Pasajero> listado)
	{
		System.out.println("Mostrando "+"\n"); 
		
		for (Pasajero pasajero: listado)
		{
			
	       System.out.println("IDPasajero: "+pasajero.getIDnrodepasajero());
	       
           System.out.println("N Alianza: "+pasajero.getAlianza());
           
           System.out.println("Numero: "+pasajero.getNumero());
           
           System.out.println("Categoria: "+pasajero.getCategoria());
           
           System.out.println("IDCliente: "+pasajero.getCliente().getIDCliente());
           
           System.out.println("IDAerolinea: "+pasajero.getAerolinea().getIDAerolinea());
           
           
		   System.out.println("\n");
		
		}

	}
	
	
	public Pasajero ConsultadePasajero ()
	{
		System.out.println("Cliente por ID: "+"\n"); 
		Pasajero Pasajero = new Pasajero();
		
		Pasajero.setIDnrodepasajero(IOGeneral.leerLinea("Ingresa IDPasajero: "));
		   
		return Pasajero;

	}
	
	public void imprimirPasajero (Pasajero pasajero)  //extra
	{
		
		
	       System.out.println("IDPasajero: "+pasajero.getIDnrodepasajero());
	       
           System.out.println("N Alianza: "+pasajero.getAlianza());
           
           System.out.println("Numero: "+pasajero.getNumero());
           
           System.out.println("Categoria: "+pasajero.getCategoria());
           
           System.out.println("IDCliente: "+pasajero.getCliente().getIDCliente());
           
           System.out.println("IDAerolinea: "+pasajero.getAerolinea().getIDAerolinea());
           
           
		   System.out.println("\n");
		
		
		
		
		
	}
	


	
	
	
	
}
