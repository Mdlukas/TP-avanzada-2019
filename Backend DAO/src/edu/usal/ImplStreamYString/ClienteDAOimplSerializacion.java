package edu.usal.ImplStreamYString;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import edu.usal.dao.interfaces.ClienteDAO;
import edu.usal.dao.negocio.Cliente;
import edu.usal.util.PropertiesUtil;

public class ClienteDAOimplSerializacion implements ClienteDAO{

	
	@SuppressWarnings("unchecked")
	@Override
	public List<Cliente> leerTodoCliente() throws IOException, ClassNotFoundException {
		
		String pathCliente = PropertiesUtil.getString("pathCliente");
		List<Cliente> listado =new ArrayList<Cliente>();
		FileInputStream  salida = new FileInputStream (pathCliente);
		ObjectInputStream ObjListado = new ObjectInputStream(salida);
		
		listado = (List<Cliente>) ObjListado.readObject();
		ObjListado.close();
		return listado;
	
	}

	
	@SuppressWarnings("unchecked")
	@Override
	public void AltaCliente(Cliente AltaCliente) throws IOException, ClassNotFoundException {
		List<Cliente> listadeCliente = new ArrayList<Cliente>();

		try {
			File archivo = new File (PropertiesUtil.getString("pathCliente"));
			
			if (archivo.exists()) {
		FileInputStream entrada = new FileInputStream(PropertiesUtil.getString("pathCliente"));
		ObjectInputStream AltadeClienteSerializable = new ObjectInputStream(entrada);
		
		listadeCliente = (List <Cliente>) AltadeClienteSerializable.readObject();
		AltadeClienteSerializable.close();
		
			}else {
				
				archivo.createNewFile();
			}
			
			FileOutputStream  salida = new FileOutputStream (PropertiesUtil.getString("pathCliente"));
			ObjectOutputStream AltadeClienteStream = new ObjectOutputStream(salida);
			
			listadeCliente.add(AltaCliente);
			AltadeClienteStream.writeObject(listadeCliente);
			AltadeClienteStream.close();
			
			
		} catch (EOFException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	@Override
	public void BajaCliente(Cliente BajaCliente) throws ClassNotFoundException, IOException {

		List<Cliente> listadoCliente = leerTodoCliente();
		
		listadoCliente.removeIf(p-> p.getIDCliente().equals(BajaCliente.getIDCliente()));

		
		FileOutputStream ArchstrSalida = new FileOutputStream(PropertiesUtil.getString("pathCliente"));
		ObjectOutputStream  Serializable = new ObjectOutputStream(ArchstrSalida);
		
		Serializable.writeObject(listadoCliente);
		Serializable.close();
		
		
	}
	
	@Override
	public void ModCliente(Cliente ModificarCliente) throws ClassNotFoundException, IOException {

		List<Cliente> listadoCliente = leerTodoCliente();
	//	listadoCliente.set(i, ModificarCliente.getIDcliente())
		for (Cliente c : listadoCliente)
		{   if ( c.getIDCliente().equals(ModificarCliente.getIDCliente()))
			{
				c.setNombreCliente(ModificarCliente.getNombreCliente());
				c.setApellidoCliente(ModificarCliente.getApellidoCliente());
				c.setDni(ModificarCliente.getDni());
				c.setCuit(ModificarCliente.getCuit());
			    c.setMail(ModificarCliente.getMail());
			    
			    c.setTelefono(ModificarCliente.getTelefono());
			    c.setNrodepasajero(ModificarCliente.getNrodepasajero());
			    c.setTelefono(ModificarCliente.getTelefono());
			
			} 
			
		}
		
		FileOutputStream ArchstrSalida = new FileOutputStream (PropertiesUtil.getString("pathCliente"));	
		ObjectOutputStream Serializable = new ObjectOutputStream (ArchstrSalida);
		
		Serializable.writeObject(listadoCliente);
		Serializable.close();

	}


	@Override
	public Cliente ConsultadeCliente(Cliente IDCliente) {
		List <Cliente> lista = new ArrayList <Cliente>();
		try {
			
			lista = leerTodoCliente();
			
			
			for (int i = 0; i < lista.size(); i++) {
				
				if (lista.get(i).getIDCliente().equals(IDCliente.getIDCliente())) {
				
					
					return lista.get(i);
				}
					
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	


}
