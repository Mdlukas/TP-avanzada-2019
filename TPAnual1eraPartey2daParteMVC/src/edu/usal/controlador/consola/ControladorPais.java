package edu.usal.controlador.consola;

import java.io.IOException;

import edu.usal.dao.interfaces.PaisDAO;
import edu.usal.factory.FactoryGeneralJDBC;
import edu.usal.vista.consola.VistaPais;

public class ControladorPais {

	private VistaPais vistaPais;
	private PaisDAO Pais;
	

	public ControladorPais(VistaPais vista)
	{
		
		this.vistaPais = vista;
		try {
			this.Pais = FactoryGeneralJDBC.GetPaisImplementacion("sql");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void AltadePais() {
		

		this.Pais.AltadePais(vistaPais.AltadePais());
		
	}

	public void ListadodePais()
	{
		
		this.vistaPais.ListadodePais(Pais.listadodePaises());
	}
	
	
	public void ConsultadePais()
	{
		vistaPais.imprimirPais(this.Pais.ObtenerPais(vistaPais.ConsultadePais()));
		
	}
	
	public void BajadePais()
	{
		this.Pais.BajadePais(vistaPais.BajadePais());
		
	}
	
	public void ModificaciondePais()
	{
		
		this.Pais.ModificaciondePais(vistaPais.ModificaciondePais());
	}
	
	
	
	public void MostrarMenuPais ()
	{
			
			int opcion = vistaPais.menu();
			
		switch(opcion)
		{
		
            
		case 1:
				System.out.println("Alta de Pais ");
			    System.out.println("\n");
	   	        this.AltadePais();
			    this.MostrarMenuPais();
			    
		break;
		
		
			case 2: System.out.println("Baja de Pais \n");
            System.out.println("\n");
  	         this.BajadePais();
             this.MostrarMenuPais();
				
				
		break;
		
		
			case 3: System.out.println("Modificacion de Pais \n");
            System.out.println("\n");
  	         this.ModificaciondePais();
             this.MostrarMenuPais();
				
		break;
		
			case 4 : System.out.println("Consulta de Pais \n");
		             System.out.println("\n");
		   	         this.ConsultadePais();
		   	         this.MostrarMenuPais();
		break;
				
				
			case 5:  System.out.println("Listado de Pais \n");
            System.out.println("\n");
		   	this.ListadodePais();
            this.MostrarMenuPais();
				
		break;
		
			case 6:  System.out.println("Finalizar Ejecucion \n");
				
		break;
			
			}
		
	}
	
	
	
}
