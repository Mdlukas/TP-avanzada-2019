package edu.usal.controlador.consola;

import java.io.IOException;

import edu.usal.dao.interfaces.AeropuertoDAO;
import edu.usal.factory.FactoryGeneralJDBC;
import edu.usal.vista.consola.VistaAeropuerto;

public class ControladorAeropuerto {

	
	private VistaAeropuerto vistaAeropuerto;
	private AeropuertoDAO Aeropuerto;
	

	public ControladorAeropuerto(VistaAeropuerto vista)
	{
		
		this.vistaAeropuerto = vista;
		try {
			
			this.Aeropuerto = FactoryGeneralJDBC.GetAeropuertoImplementacion("sql");
	
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void AltadeAeropuerto() {
		

		this.Aeropuerto.AltadeAeropuerto(vistaAeropuerto.AltaAeropuerto());
		
	}

	public void ListadodeAeropuerto()
	{
		
		this.vistaAeropuerto.ListadodeAeropuertos(Aeropuerto.listadodeAeropuertos());
	}
	
	
	public void ConsultadeAeropuerto()
	{
		vistaAeropuerto.imprimirConsultadeAeropuertos(this.Aeropuerto.ObtenerAeropuerto(vistaAeropuerto.ConsultadeAeropuerto()));
		
	}
	
	public void BajadeAeropuerto()
	{
		this.Aeropuerto.BajadeAeropuerto(vistaAeropuerto.BajadeAeropuerto());
		
	}
	
	public void ModificaciondeAeropuerto()
	{
		
		this.Aeropuerto.ModificaciondeAeropuerto(vistaAeropuerto.ModificaciondeAeropuerto());
	}
	
	
	
	public void MostrarMenuAeropuerto ()
	{
			
			int opcion = vistaAeropuerto.menu();
			
		switch(opcion)
		{
		
            
		case 1:
				System.out.println("Alta de Aeropuerto ");
			    System.out.println("\n");
	   	        this.AltadeAeropuerto();
			    this.MostrarMenuAeropuerto();
			    
		break;
		
		
			case 2: System.out.println("Baja de Aeropuerto \n");
            System.out.println("\n");
  	         this.BajadeAeropuerto();
             this.MostrarMenuAeropuerto();
				
				
		break;
		
		
			case 3: System.out.println("Modificacion de Aeropuerto \n");
            System.out.println("\n");
  	         this.ModificaciondeAeropuerto();
             this.MostrarMenuAeropuerto();
				
		break;
		
			case 4 : System.out.println("Consulta de Aeropuerto \n");
		             System.out.println("\n");
		   	         this.ConsultadeAeropuerto();
		   	         this.MostrarMenuAeropuerto();
		break;
				
				
			case 5:  System.out.println("Listado de Aeropuerto \n");
            System.out.println("\n");
		   	this.ListadodeAeropuerto();
            this.MostrarMenuAeropuerto();
				
		break;
		
			case 6:  System.out.println("Finalizar Ejecucion \n");
				
		break;
			
			}
		
	}
	
	
	
}
