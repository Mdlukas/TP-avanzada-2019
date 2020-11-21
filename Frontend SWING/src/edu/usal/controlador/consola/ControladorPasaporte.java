package edu.usal.controlador.consola;

import java.io.IOException;

import edu.usal.dao.interfaces.PasaporteDAO;
import edu.usal.dao.factory.FactoryGeneralJDBC;
import edu.usal.vista.consola.VistaPasaporte;

public class ControladorPasaporte {
	
	private VistaPasaporte vistaPasaporte;
	private PasaporteDAO Pasaporte;
	

	public ControladorPasaporte(VistaPasaporte vista)
	{
		
		this.vistaPasaporte = vista;
		try {
			this.Pasaporte = FactoryGeneralJDBC.GetPasaporteImplementacion("sql");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void AltadePasaporte() {
		

		this.Pasaporte.AltadePasaporte(vistaPasaporte.AltadePasaporte());
		
	}

	public void ListadodePasaporte()
	{
		
		this.vistaPasaporte.ListadodePasaporte(Pasaporte.listadodePasaportes());
	}
	
	
	public void ConsultadePasaporte()
	{
		vistaPasaporte.imprimirPasaporte(this.Pasaporte.ObtenerPasaporte(vistaPasaporte.ConsultadePasaporte()));
		
	}
	
	public void BajadePasaporte()
	{
		this.Pasaporte.BajadePasaporte(vistaPasaporte.BajadePasaporte());
		
	}
	
	public void ModificaciondePasaporte()
	{
		
		this.Pasaporte.ModificaciondePasaporte(vistaPasaporte.ModificaciondePasaporte());
	}
	
	
	
	public void MostrarMenuPasaporte ()
	{
			
			int opcion = vistaPasaporte.menu();
			
		switch(opcion)
		{
		
            
		case 1:
				System.out.println("Alta de Pasaporte ");
			    System.out.println("\n");
	   	        this.AltadePasaporte();
			    this.MostrarMenuPasaporte();
			    
		break;
		
		
			case 2: System.out.println("Baja de Pasaporte \n");
            System.out.println("\n");
  	         this.BajadePasaporte();
             this.MostrarMenuPasaporte();
				
				
		break;
		
		
			case 3: System.out.println("Modificacion de Pasaporte \n");
            System.out.println("\n");
  	         this.ModificaciondePasaporte();
             this.MostrarMenuPasaporte();
				
		break;
		
			case 4 : System.out.println("Consulta de Pasaporte \n");
		             System.out.println("\n");
		   	         this.ConsultadePasaporte();
		   	         this.MostrarMenuPasaporte();
		break;
				
				
			case 5:  System.out.println("Listado de Pasaporte \n");
            System.out.println("\n");
		   	this.ListadodePasaporte();
		   	this.MostrarMenuPasaporte();
         
				
		break;
		
			case 6:  System.out.println("Finalizar Ejecucion \n");
				
		break;
			
			}
		
	}

	
	
	

}
