package edu.usal.vista.consola;

import java.util.List;

import edu.usal.dao.negocio.Cliente;
import edu.usal.dao.negocio.Pasajero;
import edu.usal.dao.negocio.Pasaporte;
import edu.usal.dao.negocio.Telefono;
import edu.usal.util.IOGeneral;

public class VistaClienteStream {

	
	
	public int menu()
	{
		System.out.println("1- Alta de Cliente");
		System.out.println("2- Baja de Cliente");
		System.out.println("3- Modificacion de Cliente ");
		System.out.println("4- Consulta de Cliente");
		System.out.println("5- Listado de Cliente");
		System.out.println("6- salir");
		return IOGeneral.leerInt("ingrese una opcion ", "solo nros.");
		
	}
	
	
	public Cliente AltaCliente ()
	{
		Cliente cliente = new Cliente();
		
		Telefono telefono = new Telefono();
		Pasaporte pasaporte = new Pasaporte();
		Pasajero pasajero = new Pasajero();
		
		cliente.setTelefono(telefono);
		cliente.setPasaporte(pasaporte);
		cliente.setNrodepasajero(pasajero);
		
		
		
		
		cliente.setIDCliente(IOGeneral.leerLinea("Ingrese ID : "));
		cliente.setNombreCliente(IOGeneral.leerLinea("Ingrese Nombre : "));
		cliente.setApellidoCliente(IOGeneral.leerLinea("Ingrese Apellido : "));
		cliente.setCuit(IOGeneral.leerFrase("Ingrese cuit: "));
		cliente.setDni(IOGeneral.leerFrase("Ingrese DNI: "));
		cliente.setFechaNacimiento(IOGeneral.leerFrase("Ingrese Fecha Nacimiento: "));
		cliente.setMail("Ingrese Mail: ");
		
		cliente.getTelefono().setIDTelefono(IOGeneral.leerFrase("Ingrese Numero de Telefono: "));
		cliente.getNrodepasajero().setIDnrodepasajero(IOGeneral.leerFrase("Ingrese nro de Pasajero: "));
		cliente.getPasaporte().setIDPasaporte(IOGeneral.leerFrase("Ingrese Pasaporte: "));
		
		
		return cliente;
		
	}
	
	
	
	public void ListadodeClientes (List<Cliente> listado)
	{  
		
		System.out.println("Listado:"+ "\n");
		
		for (Cliente cliente : listado)
		{
			System.out.println("\n");
			
			   System.out.println("Cliente: "+"\n");
				
			   System.out.println("IDCliente: "+cliente.getIDCliente());
	           System.out.println("Nombre : "+cliente.getNombreCliente()); 
	           System.out.println("Apellido: "+cliente.getApellidoCliente());
	           System.out.println("Cuit:"+cliente.getCuit());
	           System.out.println("DNI: "+cliente.getDni());
	           System.out.println("Fecha Nacimiento: "+cliente.getFechaNacimiento());
	           System.out.println("Mail: "+cliente.getMail());
	           
	           
	           System.out.println("Numero de Pasajero: "+cliente.getNrodepasajero().getIDnrodepasajero());
	           System.out.println("Numero de Pasaporte: "+cliente.getPasaporte().getIDPasaporte());
	           System.out.println("Numero de Telefono: "+cliente.getTelefono().getIDTelefono());
		}
		
	}
	
	
	public Cliente BajadeCliente ()
	{
		Cliente cliente = new Cliente();
		
		cliente.setIDCliente(IOGeneral.leerLinea("Ingrese ID para realizar la Baja"));
		
		
		return cliente;	
		
	}
	
	
	
	public Cliente ModificaciondeCliente ()
	{
	  Cliente cliente = new Cliente();
		
		Telefono telefono = new Telefono();
		Pasaporte pasaporte = new Pasaporte();
		Pasajero pasajero = new Pasajero();
		
		cliente.setTelefono(telefono);
		cliente.setPasaporte(pasaporte);
		cliente.setNrodepasajero(pasajero);
		
		
		System.out.println("Ingrese los nuevos datos a Modificar! ");
		
		cliente.setIDCliente(IOGeneral.leerLinea("Ingrese ID : "));
		cliente.setNombreCliente(IOGeneral.leerLinea("Ingrese Nombre : "));
		cliente.setApellidoCliente(IOGeneral.leerLinea("Ingrese Apellido : "));
		cliente.setCuit(IOGeneral.leerFrase("Ingrese cuit: "));
		cliente.setDni(IOGeneral.leerFrase("Ingrese DNI: "));
		cliente.setFechaNacimiento(IOGeneral.leerFrase("Ingrese Fecha Nacimiento: "));
		cliente.setMail("Ingrese Mail: ");
		
		cliente.getTelefono().setIDTelefono(IOGeneral.leerFrase("Ingrese Numero de Telefono: "));
		cliente.getNrodepasajero().setIDnrodepasajero(IOGeneral.leerFrase("Ingrese nro de Pasajero: "));
		cliente.getPasaporte().setIDPasaporte(IOGeneral.leerFrase("Ingrese Pasaporte: "));
			return cliente;

	}



	
	
	public Cliente ConsultadeCliente ()
	{
		System.out.println("Cliente por ID: "+"\n"); 
		
		Cliente cliente = new Cliente();
		cliente.setIDCliente(IOGeneral.leerLinea("Ingrese ID : "));
		   
		return cliente;

	}
	
	public void imprimirConsultadeClientes (Cliente cliente)  //extra
	{
		   System.out.println("Cliente: "+"\n");
		
		   System.out.println("IDCliente: "+cliente.getIDCliente());
           System.out.println("Nombre : "+cliente.getNombreCliente()); 
           System.out.println("Apellido: "+cliente.getApellidoCliente());
           System.out.println("Cuit:"+cliente.getCuit());
           System.out.println("DNI: "+cliente.getDni());
           System.out.println("Fecha Nacimiento: "+cliente.getFechaNacimiento());
           System.out.println("Mail: "+cliente.getMail());
           
           
           System.out.println("Numero de Pasajero: "+cliente.getNrodepasajero().getIDnrodepasajero());
           System.out.println("Numero de Pasaporte: "+cliente.getPasaporte().getIDPasaporte());
           System.out.println("Numero de Telefono: "+cliente.getTelefono().getIDTelefono());
           
           
		   System.out.println("\n");
	}
	
	
	
	
	

	
}
