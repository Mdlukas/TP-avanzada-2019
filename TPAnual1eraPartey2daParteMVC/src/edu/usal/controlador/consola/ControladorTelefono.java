package edu.usal.controlador.consola;

import java.io.IOException;

import edu.usal.dao.interfaces.TelefonoDAO;
import edu.usal.factory.FactoryGeneralJDBC;
import edu.usal.vista.consola.VistaTelefono;

public class ControladorTelefono {
	
	private VistaTelefono vistaTelefono;
	private TelefonoDAO Telefono;
	

	public ControladorTelefono(VistaTelefono vista)
	{
		
		this.vistaTelefono = vista;
		try {
			this.Telefono = FactoryGeneralJDBC.GetTelefonoImplementacion("sql");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void AltadeTelefono() {
		

		this.Telefono.AltadeTelefono(vistaTelefono.AltadeTelefono());
		
	}

	public void ListadodeTelefono()
	{
		
		this.vistaTelefono.ListadodeTelefono(Telefono.listadodeTelefonos());
	}
	
	
	public void ConsultadeTelefono()
	{
		vistaTelefono.imprimirTelefono(this.Telefono.ObtenerTelefono(vistaTelefono.ConsultadeTelefono()));
		
	}
	
	public void BajadeTelefono()
	{
		this.Telefono.BajadeTelefono(vistaTelefono.BajadeTelefono());
		
	}
	
	public void ModificaciondeTelefono()
	{
		
		this.Telefono.ModificaciondeTelefono(vistaTelefono.ModificaciondeTelefono());
	}
	
	
	
	public void MostrarMenuTelefono ()
	{
			
			int opcion = vistaTelefono.menu();
			
		switch(opcion)
		{
		
            
		case 1:
				System.out.println("Alta de Telefono ");
			    System.out.println("\n");
	   	        this.AltadeTelefono();
			    this.MostrarMenuTelefono();
			    
		break;
		
		
			case 2: System.out.println("Baja de Telefono \n");
            System.out.println("\n");
  	         this.BajadeTelefono();
             this.MostrarMenuTelefono();
				
				
		break;
		
		
			case 3: System.out.println("Modificacion de Telefono \n");
            System.out.println("\n");
  	         this.ModificaciondeTelefono();
             this.MostrarMenuTelefono();
				
		break;
		
			case 4 : System.out.println("Consulta de Telefono \n");
		             System.out.println("\n");
		   	         this.ConsultadeTelefono();
		   	         this.MostrarMenuTelefono();
		break;
				
				
			case 5:  System.out.println("Listado de Telefono \n");
            System.out.println("\n");
		   	this.ListadodeTelefono();
		   	this.MostrarMenuTelefono();
         
				
		break;
		
			case 6:  System.out.println("Finalizar Ejecucion \n");
				
		break;
			
			}
		
	}
	
	
	

}
