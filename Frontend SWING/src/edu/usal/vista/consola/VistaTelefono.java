package edu.usal.vista.consola;

import java.util.List;

import edu.usal.dao.negocio.Cliente;
import edu.usal.dao.negocio.Telefono;
import edu.usal.util.IOGeneral;

public class VistaTelefono {
	
	public int menu()
	{
		System.out.println("CRUD DE Telefono!");
		
		System.out.println("1- Alta");
		System.out.println("2- Baja");
		System.out.println("3- Modificacion");
		System.out.println("4- Consulta");
		System.out.println("5- Listado");
		System.out.println("6- salir");
		return IOGeneral.leerInt("ingrese una opcion ", "solo nros.");
		
	}
	
	public Telefono AltadeTelefono()
	{
		Telefono telefono = new Telefono();
        
		Cliente  cliente = new Cliente();

		telefono.setCliente(cliente);
		
		telefono.setIDTelefono(IOGeneral.leerFrase("Ingrese IDTelefono: "));	
		telefono.getCliente().setIDCliente(IOGeneral.leerInt("Ingrese ID : ", "Eso no es un id valido!"));
        telefono.setNumeroPersonal(IOGeneral.leerFrase("Ingrese Numero Personal: "));
		telefono.setNumeroLaboral(IOGeneral.leerFrase("Ingrese Numero Laboral: "));
		telefono.setNumeroCelular(IOGeneral.leerFrase("Ingrese Numero Celular: "));
	
		
		
		return telefono;
	    
	}
	
	public Telefono ModificaciondeTelefono ()
	{
	    Telefono telefono = new Telefono();
	    
        System.out.println("Ingrese datos a Modificar: ");
		
		telefono.setIDTelefono(IOGeneral.leerFrase("Ingrese IDTelefono: "));	
		telefono.getCliente().setIDCliente(IOGeneral.leerInt("Ingrese ID : ", "Eso no es un id valido!"));
        telefono.setNumeroPersonal(IOGeneral.leerFrase("Ingrese Numero Personal: "));
		telefono.setNumeroLaboral(IOGeneral.leerFrase("Ingrese Numero Laboral: "));
		telefono.setNumeroCelular(IOGeneral.leerFrase("Ingrese Numero Celular: "));

        
        
		return telefono;
		 

	}
	
	
	public Telefono BajadeTelefono ()
	{
		System.out.println("Baja de Telefono por ID: "+"\n"); 
		Telefono Telefono = new Telefono();
		
		Telefono.setIDTelefono(IOGeneral.leerLinea("Ingresa ID: para Realizar la Baja"));
		   
		return Telefono;
		 
	}
	
	public void ListadodeTelefono (List <Telefono> listado)
	{
		System.out.println("Mostrando "+"\n"); 
		
		for (Telefono telefono: listado)
		{
			
	       System.out.println("IDTelefono: "+telefono.getIDTelefono());
	       System.out.println("Numero Celular: "+telefono.getNumeroCelular());
	       System.out.println("Numero Laboral: "+telefono.getNumeroLaboral());
	       System.out.println("Numero Personal: "+telefono.getNumeroPersonal());
	       
		   System.out.println("\n");
		
		}

	}
	
	
	public Telefono ConsultadeTelefono ()
	{
		System.out.println("Cliente por ID: "+"\n"); 
		Telefono telefono = new Telefono();
		
		telefono.setIDTelefono(IOGeneral.leerLinea("Ingresa IDTelefono: "));
		   
		return telefono;

	}
	
	
	public void imprimirTelefono (Telefono telefono)  //extra
	{
		   System.out.println("Telefono: "+"\n");
		
	       System.out.println("IDTelefono: "+telefono.getIDTelefono());
	       System.out.println("Numero Celular: "+telefono.getNumeroCelular());
	       System.out.println("Numero Laboral: "+telefono.getNumeroLaboral());
	       System.out.println("Numero Personal: "+telefono.getNumeroPersonal());
	       
		   System.out.println("\n");
	}
	

}
