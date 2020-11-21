package edu.usal.controlador.consola;

import java.io.IOException;

import edu.usal.dao.interfaces.ProvinciaDAO;
import edu.usal.dao.factory.FactoryGeneralJDBC;
import edu.usal.vista.consola.VistaProvincia;

public class ControladorProvincia {
	
	private VistaProvincia vistaProvincia;
	private ProvinciaDAO Provincia;
	

	public ControladorProvincia(VistaProvincia vista)
	{
		
		this.vistaProvincia = vista;
		try {
			this.Provincia = FactoryGeneralJDBC.GetProvinciaImplementacion("sql");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void AltadeProvincia() {
		

		this.Provincia.AltadeProvincia(vistaProvincia.AltadeProvincia());
		
	}

	public void ListadodeProvincia()
	{
		
		this.vistaProvincia.ListadodeProvincia(Provincia.listadodeProvincias());
	}
	
	
	public void ConsultadeProvincia()
	{
		vistaProvincia.imprimirProvincia(this.Provincia.ObtenerProvincia(vistaProvincia.ConsultadeProvincia()));
		
	}
	
	public void BajadeProvincia()
	{
		this.Provincia.BajadeProvincia(vistaProvincia.BajadeProvincia());
		
	}
	
	public void ModificaciondeProvincia()
	{
		
		this.Provincia.ModificaciondeProvincia(vistaProvincia.ModificaciondeProvincia());
	}
	
	
	
	public void MostrarMenuProvincia ()
	{
			
			int opcion = vistaProvincia.menu();
			
		switch(opcion)
		{
		
            
		case 1:
				System.out.println("Alta de Provincia ");
			    System.out.println("\n");
	   	        this.AltadeProvincia();
			    this.MostrarMenuProvincia();
			    
		break;
		
		
			case 2: System.out.println("Baja de Provincia \n");
            System.out.println("\n");
  	         this.BajadeProvincia();
             this.MostrarMenuProvincia();
				
				
		break;
		
		
			case 3: System.out.println("Modificacion de Provincia \n");
            System.out.println("\n");
  	         this.ModificaciondeProvincia();
             this.MostrarMenuProvincia();
				
		break;
		
			case 4 : System.out.println("Consulta de Provincia \n");
		             System.out.println("\n");
		   	         this.ConsultadeProvincia();
		   	         this.MostrarMenuProvincia();
		break;
				
				
			case 5:  System.out.println("Listado de Provincia \n");
            System.out.println("\n");
		   	this.ListadodeProvincia();
		   	this.MostrarMenuProvincia();
         
				
		break;
		
			case 6:  System.out.println("Finalizar Ejecucion \n");
				
		break;
			
			}
		
	}

}
