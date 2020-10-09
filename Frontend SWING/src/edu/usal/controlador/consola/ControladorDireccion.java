package edu.usal.controlador.consola;

import java.io.IOException;

import edu.usal.dao.interfaces.DireccionDAO;
import edu.usal.factory.FactoryGeneralJDBC;
import edu.usal.vista.consola.VistaDireccion;

public class ControladorDireccion {

	
	private VistaDireccion vistaDireccion;
	private DireccionDAO Direccion;
	

	public ControladorDireccion(VistaDireccion vista)
	{
		
		this.vistaDireccion = vista;
		try {
			this.Direccion = FactoryGeneralJDBC.GetDireccionImplementacion("sql");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void AltadeDireccion() {
		

		this.Direccion.AltadeDireccion(vistaDireccion.AltaDireccion());
		
	}

	public void ListadodeDireccion()
	{
		
		this.vistaDireccion.ListadodeDireccion(Direccion.listadodeDirecciones());
	}
	
	
	public void ConsultadeDireccion()
	{
		vistaDireccion.imprimirConsultadeDireccion(this.Direccion.ObtenerDireccion(vistaDireccion.ConsultadeDireccion()));
		
	}
	
	public void BajadeDireccion()
	{
		this.Direccion.BajadeDireccion(vistaDireccion.BajadeDireccion());
		
	}
	
	public void ModificaciondeDireccion()
	{
		
		this.Direccion.ModificaciondeDireccion(vistaDireccion.ModificaciondeDireccion());
	}
	
	
	
	public void MostrarMenuDireccion ()
	{
			
			int opcion = vistaDireccion.menu();
			
		switch(opcion)
		{
		
            
		case 1:
				System.out.println("Alta de Direccion ");
			    System.out.println("\n");
	   	        this.AltadeDireccion();
			    this.MostrarMenuDireccion();
			    
		break;
		
		
			case 2: System.out.println("Baja de Direccion \n");
            System.out.println("\n");
  	         this.BajadeDireccion();
             this.MostrarMenuDireccion();
				
				
		break;
		
		
			case 3: System.out.println("Modificacion de Direccion \n");
            System.out.println("\n");
  	         this.ModificaciondeDireccion();
             this.MostrarMenuDireccion();
				
		break;
		
			case 4 : System.out.println("Consulta de Direccion \n");
		             System.out.println("\n");
		   	         this.ConsultadeDireccion();
		   	         this.MostrarMenuDireccion();
		break;
				
				
			case 5:  System.out.println("Listado de Direccion \n");
            System.out.println("\n");
		   	this.ListadodeDireccion();
            this.MostrarMenuDireccion();
				
		break;
		
			case 6:  System.out.println("Finalizar Ejecucion \n");
				
		break;
			
			}
		
	}
	
	
	
}
