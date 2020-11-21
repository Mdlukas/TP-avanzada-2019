package edu.usal.dao.interfaces;

import java.io.IOException;
import java.util.List;

import edu.usal.domain.Cliente;


public interface ClienteDAO {
	
	public Cliente ConsultadeCliente (Cliente IDCliente);
	public List<Cliente> leerTodoCliente() throws IOException, ClassNotFoundException;
	public void AltaCliente(Cliente AltaCliente) throws IOException, ClassNotFoundException;
	public void ModCliente (Cliente ModicarCliente) throws ClassNotFoundException, IOException;
	public void BajaCliente (Cliente BajaCliente) throws ClassNotFoundException, IOException;
	

}
