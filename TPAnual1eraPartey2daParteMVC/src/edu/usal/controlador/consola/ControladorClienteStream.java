package edu.usal.controlador.consola;

import java.io.IOException;

import edu.usal.dao.interfaces.ClienteDAO;
import edu.usal.factory.FactoryCliente;
import edu.usal.vista.consola.VistaClienteStream;

public class ControladorClienteStream {
	
	private VistaClienteStream vista;
	private ClienteDAO cliente;
	
	
	public ControladorClienteStream (VistaClienteStream vista)
	{
		this.vista = vista;
		try {
			
			
			this.cliente = FactoryCliente.GetImplementacion("serializable");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	public void AltaCliente() throws ClassNotFoundException, IOException
	{
	
		this.cliente.AltaCliente(vista.AltaCliente());	
	}
	
	
	public void BajadeCliente () throws ClassNotFoundException, IOException
	{ 		
	 
		this.cliente.BajaCliente(vista.BajadeCliente());
	
	}
	
	
	public void ModificaciondeCliente() throws ClassNotFoundException, IOException
	{
		
		this.cliente.ModCliente(vista.ModificaciondeCliente());
		
	}
	
	
	
	public void ConsultadeCliente()
	{
		vista.imprimirConsultadeClientes (this.cliente.ConsultadeCliente(vista.ConsultadeCliente()));
		
	}
	
	
	public void ListadodeClientes() throws ClassNotFoundException, IOException
	{
		
		vista.ListadodeClientes(cliente.leerTodoCliente());
		
		
	}
	
	
	
	public void MiMenu() 
	{
		
		
		int opcion = vista.menu();
		
		
		switch (opcion)
		{
		
		
		case 1 : 
			
			try {
				this.AltaCliente();
			} catch (ClassNotFoundException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.MiMenu();
			
		break;
		
		case 2 :
			
			
			try {
				this.BajadeCliente();
			} catch (ClassNotFoundException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.MiMenu();
			
			break;
		
		case 3 :
			
			try {
				this.ModificaciondeCliente();
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
			this.MiMenu();
			break;
		
		case 4 : 
		
			this.ConsultadeCliente();
			this.MiMenu();
			break;
		
			
		case 5 : 
			
			try {
				this.ListadodeClientes();
			} catch (ClassNotFoundException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.MiMenu();
			break;
			
			
		case 6 : 
			
			
		System.out.println("Ejecucion Finalizada");
			
			break;
		
		
		}

		
		
	}
	

}
