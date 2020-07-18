package edu.usal.main;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import edu.usal.dao.interfaces.ClienteDAO;
import edu.usal.dao.negocio.Cliente;
import edu.usal.factory.FactoryCliente;

//Quispe alexander

public class EjecutarClienteArchivos {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		
		Cliente cliente = new Cliente("alexanderquispe ", null, null, null, " 11212 ", null, " alexander.quispeiglesias@usal.edu.ar", null, null, null);
	
		
		Properties properties = new Properties();
		
		properties.load(new FileReader ("Config.Properties"));
		
		String implementacion = properties.getProperty("dao");
		
		ClienteDAO clienteDAO = FactoryCliente.GetImplementacion("Archivo");
		
		try {
			clienteDAO.AltaCliente(cliente);
			clienteDAO.AltaCliente(cliente);
			clienteDAO.AltaCliente(cliente);
			
			List<Cliente> listado = clienteDAO.leerTodoCliente();
			
			for (Cliente client : listado)
			{
				System.out.println(" "+ client.getIDCliente() + " " + client.getMail() + " "+ client.getDni());
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		

		
		
		
		

	}

}
