package edu.usal.controlador.consola;

import java.io.IOException;

import edu.usal.dao.factory.FactoryVenta;
import edu.usal.dao.interfaces.VentaDAO;
import edu.usal.vista.consola.VistaVenta;

public class ControladorVenta {
	
	private VistaVenta vistaVenta;
	private VentaDAO Venta;
	

	public ControladorVenta(VistaVenta vista)
	{
		
		this.vistaVenta = vista;
		try {
			this.Venta = FactoryVenta.GetVentaImplementacion("sql");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void AltadeVenta() {
		

		this.Venta.AltadeVenta(vistaVenta.AltadeVenta());
		
	}

	public void ListadodeVenta()
	{
		
		this.vistaVenta.ListadodeVenta(Venta.listadodeVentas());
	}
	
	
	public void ConsultadeVenta()
	{
		vistaVenta.imprimirVenta(this.Venta.ObtenerVenta(vistaVenta.ConsultadeVenta()));
		
	}
	
	public void BajadeVenta()
	{
		this.Venta.BajadeVenta(vistaVenta.BajadeVenta());
		
	}
	
	public void ModificaciondeVenta()
	{
		
		this.Venta.ModificaciondeVenta(vistaVenta.ModificaciondeVenta());
	}
	
	
	
	public void MostrarMenuVenta ()
	{
			
			int opcion = vistaVenta.menu();
			
		switch(opcion)
		{
		
            
		case 1:
				System.out.println("Alta de Venta ");
			    System.out.println("\n");
	   	        this.AltadeVenta();
			    this.MostrarMenuVenta();
			    
		break;
		
		
			case 2: System.out.println("Baja de Venta \n");
            System.out.println("\n");
  	         this.BajadeVenta();
             this.MostrarMenuVenta();
				
				
		break;
		
		
			case 3: System.out.println("Modificacion de Venta \n");
            System.out.println("\n");
  	         this.ModificaciondeVenta();
             this.MostrarMenuVenta();
				
		break;
		
			case 4 : System.out.println("Consulta de Venta \n");
		             System.out.println("\n");
		   	         this.ConsultadeVenta();
		   	         this.MostrarMenuVenta();
		break;
				
				
			case 5:  System.out.println("Listado de Venta \n");
            System.out.println("\n");
		   	this.ListadodeVenta();
            this.MostrarMenuVenta();
				
		break;
		
			case 6:  System.out.println("Finalizar Ejecucion \n");
				
		break;
			
			}
		
	}
	
	
	

}
