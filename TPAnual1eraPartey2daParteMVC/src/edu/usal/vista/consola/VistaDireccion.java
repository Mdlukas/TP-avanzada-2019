package edu.usal.vista.consola;

import java.util.List;

import edu.usal.dao.negocio.Cliente;
import edu.usal.dao.negocio.Direccion;
import edu.usal.dao.negocio.Pais;
import edu.usal.dao.negocio.Provincia;
import edu.usal.util.IOGeneral;

public class VistaDireccion {
	
	
	
	public int menu()
	{
		System.out.println("1- Alta de Direccion");
		System.out.println("2- Baja de Direccion");
		System.out.println("3- Modificacion de Direccion ");
		System.out.println("4- Consulta de Direccion");
		System.out.println("5- Listado de Direccion");
		System.out.println("6- salir");
		return IOGeneral.leerInt("ingrese una opcion ", "solo nros.");
		
	}
	
	
	public Direccion AltaDireccion ()
	{
		Direccion direccion = new Direccion();
				
		Pais pais = new Pais();
		Provincia provincia = new Provincia();
		Cliente cliente = new Cliente();
		
		direccion.setPais(pais);
		direccion.setProvincia(provincia);
		direccion.setCliente(cliente);
		
		direccion.setIDDireccion(IOGeneral.leerLinea("Ingrese ID : "));
        direccion.setCalle(IOGeneral.leerFrase("Ingrese Calle: "));
        direccion.setAltura(IOGeneral.leerFrase("Ingrese Altura: "));
		direccion.setCiudad(IOGeneral.leerFrase("Ingrese Ciudad: "));
        direccion.setCodigoPostal(IOGeneral.leerFrase("Ingrese Codigo Postal: "));
        
        direccion.getPais().setIDPais(IOGeneral.leerFrase("Ingrese IDPais: "));
        direccion.getProvincia().setIDProvincia(IOGeneral.leerFrase("Ingrese IDProvincia: "));
        direccion.getCliente().setIDCliente(IOGeneral.leerFrase("Ingrese IDCliente: "));
        
		return direccion;
		
	}
	
	
	
	public void ListadodeDireccion (List<Direccion> listado)
	{  
		
		System.out.println("Listado:"+ "\n");
		
		for (Direccion Direccion : listado)
		{
			System.out.println("\n");
			
			   System.out.println("Direccion: "+"\n");
				
			   System.out.println("IDDireccion: "+Direccion.getIDDireccion());
	           System.out.println("Calle : "+Direccion.getCalle()); 
	           System.out.println("Altura: "+Direccion.getAltura());
	           System.out.println("Ciudad:"+Direccion.getCiudad());
	           System.out.println("Codigo Postal: "+Direccion.getCodigoPostal());
	           System.out.println("IDPais: "+Direccion.getPais().getIDPais());
	           System.out.println("IDProvincia: "+Direccion.getProvincia().getIDProvincia());
	           System.out.println("IDCliente: "+Direccion.getCliente().getIDCliente()); 
	          
		}
		
	}
	
	
	public Direccion BajadeDireccion ()
	{
		Direccion Direccion = new Direccion();
		
		Direccion.setIDDireccion(IOGeneral.leerLinea("Ingrese ID para realizar la Baja"));
		
		
		return Direccion;	
		
	}
	
	
	
	public Direccion ModificaciondeDireccion ()
	{

		Direccion direccion = new Direccion();
				
		Pais pais = new Pais();
		Provincia provincia = new Provincia();
		Cliente cliente = new Cliente();
		
		direccion.setPais(pais);
		direccion.setProvincia(provincia);
		direccion.setCliente(cliente);
		
		
		System.out.println("Ingrese Datos a Modificar: ");
		
		
		direccion.setIDDireccion(IOGeneral.leerLinea("Ingrese ID : "));
        direccion.setCalle(IOGeneral.leerFrase("Ingrese Calle: "));
        direccion.setAltura(IOGeneral.leerFrase("Ingrese Altura: "));
		direccion.setCiudad(IOGeneral.leerFrase("Ingrese Ciudad: "));
        direccion.setCodigoPostal(IOGeneral.leerFrase("Ingrese Codigo Postal: "));
        
        direccion.getPais().setIDPais(IOGeneral.leerFrase("Ingrese IDPais: "));
        direccion.getProvincia().setIDProvincia(IOGeneral.leerFrase("Ingrese IDProvincia: "));
        direccion.getCliente().setIDCliente(IOGeneral.leerFrase("Ingrese IDCliente: "));
        
		return direccion;
		
	}



	
	
	public Direccion ConsultadeDireccion ()
	{
		System.out.println("Direccion por ID: "+"\n"); 
		
		Direccion Direccion = new Direccion();
		Direccion.setIDDireccion(IOGeneral.leerLinea("Ingrese ID : "));
		   
		return Direccion;

	}
	
	public void imprimirConsultadeDireccion (Direccion Direccion)  //extra
	{
		   System.out.println("Direccion: "+"\n");
			
		   System.out.println("IDDireccion: "+Direccion.getIDDireccion());
        System.out.println("Calle : "+Direccion.getCalle()); 
        System.out.println("Altura: "+Direccion.getAltura());
        System.out.println("Ciudad:"+Direccion.getCiudad());
        System.out.println("Codigo Postal: "+Direccion.getCodigoPostal());
        System.out.println("IDPais: "+Direccion.getPais().getIDPais());
        System.out.println("IDProvincia: "+Direccion.getProvincia().getIDProvincia());
        System.out.println("IDCliente: "+Direccion.getCliente().getIDCliente()); 
       
           
           
           
		   System.out.println("\n");
	}




}
