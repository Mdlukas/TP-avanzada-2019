package edu.usal.vista.consola;

import java.util.List;

import edu.usal.domain.Aeropuerto;
import edu.usal.domain.Pais;
import edu.usal.domain.Provincia;
import edu.usal.util.IOGeneral;

public class VistaAeropuerto {

	
	public int menu()
	{
		System.out.println("1- Alta de Aeropuerto");
		System.out.println("2- Baja de Aeropuerto");
		System.out.println("3- Modificacion de Aeropuerto ");
		System.out.println("4- Consulta de Aeropuerto");
		System.out.println("5- Listado de Aeropuerto");
		System.out.println("6- salir");
		return IOGeneral.leerInt("ingrese una opcion ", "solo nros.");
		
	}
	
	
	public Aeropuerto AltaAeropuerto ()
	{
		
		Aeropuerto aeropuerto = new Aeropuerto();
		
		Provincia provincia = new Provincia();
		Pais pais = new Pais();

		aeropuerto.setPais(pais);
		aeropuerto.setProvincia(provincia);
		
		
		aeropuerto.setCodigodeAeropuerto(IOGeneral.leerFrase("Ingrese Codigo de Aeropuerto: "));
		aeropuerto.setCiudad(IOGeneral.leerFrase("Ingrese Ciudad: "));
		
		aeropuerto.getPais().setIDPais(IOGeneral.leerFrase("Ingrese IDPais: "));
	    aeropuerto.getProvincia().setIDProvincia(IOGeneral.leerFrase("Ingrese Provincia: "));
	
		return aeropuerto;
		
	}
	
	
	
	public void ListadodeAeropuertos (List<Aeropuerto> listado)
	{  
		
		System.out.println("Listado:"+ "\n");
		
		for (Aeropuerto aeropuerto : listado)
		{
			   System.out.println("\n");
			
			   System.out.println("Aeropuerto: "+"\n");
				
			   System.out.println("IDAeropuerto: "+aeropuerto.getIDAeropuerto());
	           System.out.println("Codigo de Aeropuerto : "+aeropuerto.getCodigodeAeropuerto()); 
	           System.out.println("Nombre de Ciudad: "+aeropuerto.getCiudad()); 
	           
	           System.out.println("Pais: "+aeropuerto.getPais().getIDPais());
	           System.out.println("Provincia: "+aeropuerto.getProvincia().getIDProvincia());

		}
		
	}
	
	
	public Aeropuerto BajadeAeropuerto ()
	{
		Aeropuerto aeropuerto = new Aeropuerto();
		
		aeropuerto.setIDAeropuerto(IOGeneral.leerInt("Ingrese ID para realizar la Baja", "debe ser numero"));
		
		
		return aeropuerto;	
		
	}
	
	
	public Aeropuerto ModificaciondeAeropuerto ()
	{

	Aeropuerto aeropuerto = new Aeropuerto();
		
		Provincia provincia = new Provincia();
		Pais pais = new Pais();

		aeropuerto.setPais(pais);
		aeropuerto.setProvincia(provincia);
		
		System.out.println("Ingrese los nuevos datos a Modificar! ");
		
		
		aeropuerto.setIDAeropuerto(IOGeneral.leerInt("ingrese ID", "debe ser numero"));
		aeropuerto.setCodigodeAeropuerto(IOGeneral.leerFrase("Ingrese Codigo de Aeropuerto: "));
		aeropuerto.setCiudad(IOGeneral.leerFrase("Ingrese Ciudad: "));
		
		aeropuerto.getPais().setIDPais(IOGeneral.leerFrase("Ingrese IDPais: "));
	    aeropuerto.getProvincia().setIDProvincia(IOGeneral.leerFrase("Ingrese Provincia: "));


			return aeropuerto;

	}



	
	
	public Aeropuerto ConsultadeAeropuerto ()
	{
		System.out.println("Aeropuerto por ID: "+"\n"); 
		
		Aeropuerto aeropuerto = new Aeropuerto();
		aeropuerto.setIDAeropuerto(IOGeneral.leerInt("Ingrese ID", "debe ser num"));
		   
		return aeropuerto;

	}
	
	public void imprimirConsultadeAeropuertos (Aeropuerto aeropuerto)  //extra
	{
		   System.out.println("Aeropuerto: "+"\n");
		
			
		   System.out.println("IDAeropuerto: "+aeropuerto.getIDAeropuerto());
           System.out.println("Codigo de Aeropuerto : "+aeropuerto.getCodigodeAeropuerto()); 
           System.out.println("Nombre de Ciudad: "+aeropuerto.getCiudad()); 
           
           System.out.println("Pais: "+aeropuerto.getPais().getIDPais());
           System.out.println("Provincia: "+aeropuerto.getProvincia().getIDProvincia());

           
           
		   System.out.println("\n");
	}
	
	
	
}
