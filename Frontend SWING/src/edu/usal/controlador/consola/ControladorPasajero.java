package edu.usal.controlador.consola;

import java.io.IOException;

import edu.usal.dao.interfaces.PasajeroDAO;
import edu.usal.factory.FactoryGeneralJDBC;
import edu.usal.vista.consola.VistaPasajero;

public class ControladorPasajero {
	
	
	private VistaPasajero vistaPasajero;
	private PasajeroDAO Pasajero;
	

	public ControladorPasajero(VistaPasajero vista)
	{
		
		this.vistaPasajero = vista;
		try {
			this.Pasajero = FactoryGeneralJDBC.GetPasajeroImplementacion("sql");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void AltadePasajero() {
		

		this.Pasajero.AltadePasajero(vistaPasajero.AltadePasajero());
		
	}

	public void ListadodePasajero()
	{
		
		this.vistaPasajero.ListadodePasajero(Pasajero.listadodePasajeros());
	}
	
	
	public void ConsultadePasajero()
	{
		vistaPasajero.imprimirPasajero(this.Pasajero.ObtenerPasajero(vistaPasajero.ConsultadePasajero()));
		
	}
	
	public void BajadePasajero()
	{
		this.Pasajero.BajadePasajero(vistaPasajero.BajadePasajero());
		
	}
	
	public void ModificaciondePasajero()
	{
		
		this.Pasajero.ModificaciondePasajero(vistaPasajero.ModificaciondePasajero());
	}
	
	
	
	public void MostrarMenuPasajero ()
	{
			
			int opcion = vistaPasajero.menu();
			
		switch(opcion)
		{
		
            
		case 1:
				System.out.println("Alta de Pasajero ");
			    System.out.println("\n");
	   	        this.AltadePasajero();
			    this.MostrarMenuPasajero();
			    
		break;
		
		
			case 2: System.out.println("Baja de Pasajero \n");
            System.out.println("\n");
  	         this.BajadePasajero();
             this.MostrarMenuPasajero();
				
				
		break;
		
		
			case 3: System.out.println("Modificacion de Pasajero \n");
            System.out.println("\n");
  	         this.ModificaciondePasajero();
             this.MostrarMenuPasajero();
				
		break;
		
			case 4 : System.out.println("Consulta de Pasajero \n");
		             System.out.println("\n");
		   	         this.ConsultadePasajero();
		   	         this.MostrarMenuPasajero();
		break;
				
				
			case 5:  System.out.println("Listado de Pasajero \n");
            System.out.println("\n");
		   	this.ListadodePasajero();
		   	this.MostrarMenuPasajero();
         
				
		break;
		
			case 6:  System.out.println("Finalizar Ejecucion \n");
				
		break;
			
			}
		
	}

	

}
