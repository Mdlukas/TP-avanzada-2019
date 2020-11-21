package edu.usal.main;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import edu.usal.dao.interfaces.ClienteDAO;
import edu.usal.domain.Cliente;

import edu.usal.domain.Pasajero;
import edu.usal.domain.Pasaporte;
import edu.usal.domain.Telefono;
import edu.usal.dao.factory.FactoryCliente;



public class MainPrincipal {

	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
	
		int IDCliente;
		String NombreCliente = null;
	    String ApellidoCliente = null;
		int opc;
		String dni = null;
		String RS = null;
		String mail = null;
		String FechaNacimiento = null; 
		
        Pasaporte IDPasaporte;
	    Telefono IDTelefono;
	    Pasajero IDnrodepasajero;
		
		
		Scanner leer = new Scanner(System.in);
		ClienteDAO clienteDAO = FactoryCliente.GetImplementacion();
		
		
		do {
			
			System.out.println("Ingrese una opcion (1-alta), ( 2-baja), (3-modificacion) y (4-Listado)");
			opc = leer.nextInt();
			
			} while (opc < 1 || opc > 4);
			 
		
		switch (opc)
		{
		
		case 1: System.out.println("ALTA \n");
		

		System.out.println("Ingrese IDCliente");
		IDCliente = leer.nextInt();
		System.out.println("ingrese nombre");
	    NombreCliente = leer.next();      
	    System.out.println("ingrese apellido"); 
	    ApellidoCliente = leer.next();
	    System.out.println("ingrese dni "); 
	    dni = leer.next();
	    System.out.println("ingrese RS ");
	    RS = leer.next();
	    System.out.println("ingrese Fecha de Nacimiento ");
	    FechaNacimiento = leer.next();
	    System.out.println("ingrese mail "); 
	    mail = leer.next();
	       
	  //  System.out.println("ingrese numero de Pasaporte "); 
	  // pasaporte = leer.next();
	 
	  //  System.out.println("ingrese telefono "); 
	    //telefono = leer.next();
	  
	   //System.out.println("ingrese nro de pasajero ");
	 //nrodepasajero = leer.next();
		    
		    Cliente cliente = new Cliente (IDCliente,NombreCliente,ApellidoCliente,dni,RS,null,mail,null,null,null);
		    
		    clienteDAO.AltaCliente(cliente);
		    
		break;	
		
		
		case 2: System.out.println("BAJA \n");
		
		System.out.println("Ingrese IDCliente para darlo de baja");
		IDCliente = leer.nextInt();
		 Cliente cliente1 = new Cliente (IDCliente,NombreCliente,ApellidoCliente,dni,RS,FechaNacimiento,mail,null,null,null);
		    		
		
		clienteDAO.BajaCliente(cliente1);
		
		break;
		
		
		
		case 3: System.out.println("MODIFICACION \n");
		
		
		System.out.println("Ingrese IDCliente para realizar la modificacion");
		IDCliente = leer.nextInt();
		System.out.println("ingrese nombre A modificar ");
	    NombreCliente = leer.next();      
	    System.out.println("ingrese apellido A modificar "); 
	    ApellidoCliente = leer.next();
	    System.out.println("ingrese dni A modificar "); 
	    dni = leer.next();
	    System.out.println("ingrese RS A modificar ");
	    RS = leer.next();
	    System.out.println("ingrese Fecha de Nacimiento a Modificar ");
	    FechaNacimiento = leer.next();
	    System.out.println("ingrese mail A modificar "); 
	    mail = leer.next();
	       
	  //  System.out.println("ingrese numero de Pasaporte "); 
	  // pasaporte = leer.next();
	 
	  //  System.out.println("ingrese telefono "); 
	    //telefono = leer.next();
	  
	   //System.out.println("ingrese nro de pasajero ");
	 //nrodepasajero = leer.next();
		
	    Cliente cliente2 = new Cliente (IDCliente,NombreCliente,ApellidoCliente,dni,RS,FechaNacimiento,mail,null,null,null);
	    
		clienteDAO.ModCliente(cliente2);
			
		break;
			
		
		case 4: System.out.println("Listado \n");
			
		      List<Cliente> listadoCliente = clienteDAO.leerTodoCliente();
		      
		     
		    for (Cliente clientes : listadoCliente)
		    {
		   System.out.println(clientes.getIDCliente() + "\n" + clientes.getNombreCliente() + "\n" + clientes.getApellidoCliente()
		   + "\n" + clientes.getDni() + "\n" + clientes.getRS()  + "\n" + clientes.getFechaNacimiento() + "\n" +  clientes.getMail());
		    	
		    	System.out.println("\n");
		   
		    }
		
		break;
		
		
		}
		
		
		
		

	}

	
	
	
	
}
