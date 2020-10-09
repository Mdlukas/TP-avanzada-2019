package edu.usal.ImplStreamYString;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import edu.usal.dao.interfaces.ClienteDAO;
import edu.usal.dao.negocio.Cliente;
import edu.usal.util.PropertiesUtil;


public class ClienteDAOimplSTRING implements ClienteDAO {

	@Override
	public Cliente ConsultadeCliente(Cliente consulta) {
		
		
		try {
			List <Cliente> lista = leerTodoCliente();
			
			for (int i = 0; i < lista.size(); i++) {
				if (lista.get(i).getIDCliente().equals(consulta.getIDCliente())) {
					return lista.get(i);					
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return null;
	}

	
	
	
	@Override
	public List<Cliente> leerTodoCliente() throws IOException
	{
		
		List<Cliente> lista = new ArrayList <Cliente>();
		File archivo = new File (PropertiesUtil.getString("pathClienteString"));
		FileReader ft = new FileReader (archivo);
		BufferedReader br = new BufferedReader (ft);
		String s = null;
		
		while ((s = br.readLine()) != null) {
		
			String [] t = s.split(";");
			
		//	lista.add(new Cliente (  t[0], t[1], t[2], t[3], t[4], t[5], t[6], t[7] ,t[8], t[9]  )   );
	
		
		}
		
		
		br.close();
		ft.close();
		
		return lista;
		
	}

	
	@Override
	public void AltaCliente(Cliente alta) throws IOException, ClassNotFoundException {

		

		File archivo = new File (PropertiesUtil.getString("pathClienteString"));
		FileWriter fw = new FileWriter (archivo, true);
		BufferedWriter bw = new BufferedWriter (fw);
		
		bw.write(alta.getIDCliente() + ";" + alta.getNombreCliente() + ";" + alta.getApellidoCliente()
		
		+ ";" + alta.getCuit() + ";" + alta.getDni() + ";" + alta.getFechaNacimiento() 
		+ ";" + alta.getMail() + ";" + alta.getNrodepasajero().getIDnrodepasajero() 
		+ ";" + alta.getPasaporte().getIDPasaporte() + ";" + alta.getTelefono().getIDTelefono()
		+"\n");
		
		bw.close();
		fw.close();
			
		
	}

	@Override
	public void ModCliente(Cliente modificar) throws ClassNotFoundException, IOException {

		try {
			
			List <Cliente> lista = leerTodoCliente();
			
			for (int i = 0; i < lista.size(); i++) {
				
				if (lista.get(i).getIDCliente().equals(modificar.getIDCliente())) {
					
					lista.get(i).setNombreCliente(modificar.getNombreCliente());
					lista.get(i).setApellidoCliente(modificar.getApellidoCliente());
					lista.get(i).setDni(modificar.getDni());
					lista.get(i).setMail(modificar.getMail());
					lista.get(i).setFechaNacimiento(modificar.getFechaNacimiento());
					lista.get(i).setCuit(modificar.getCuit());
					
					lista.get(i).getPasaporte().setIDPasaporte(modificar.getPasaporte().getIDPasaporte());
					lista.get(i).getNrodepasajero().setIDnrodepasajero(modificar.getNrodepasajero().getIDnrodepasajero());;
					lista.get(i).getTelefono().setIDTelefono(modificar.getTelefono().getIDTelefono());
				
				}
			}
			
			for (int i = 0; i < lista.size(); i++) {
				
				
				SobreEscribirCliente(lista.get(i));
				
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
	}
	
	
	public void SobreEscribirCliente (Cliente alta) {
		
		File archivo = new File (PropertiesUtil.getString("pathClienteString"));
		FileWriter fw;
		try {
			fw = new FileWriter (archivo);
			BufferedWriter bw = new BufferedWriter (fw);
			
			
			bw.write(alta.getIDCliente() + ";" + alta.getNombreCliente() + ";" + alta.getApellidoCliente()
			
			+ ";" + alta.getCuit() + ";" + alta.getDni() + ";" + alta.getFechaNacimiento() 
			+ ";" + alta.getMail() + ";" + alta.getNrodepasajero().getIDnrodepasajero() 
			+ ";" + alta.getPasaporte().getIDPasaporte() + ";" + alta.getTelefono().getIDTelefono());
			
			bw.close();
			fw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

	
	
	
	
	
	@Override
	public void BajaCliente(Cliente baja) throws ClassNotFoundException, IOException {

		try {
			List <Cliente> lista = leerTodoCliente();
			
			for (int i = 0; i < lista.size(); i++) {
				if (lista.get(i).getIDCliente().equals(baja.getIDCliente())) {
					lista.remove(i);
					
				}
			}
			
			for (int i = 0; i < lista.size(); i++) {
				SobreEscribirCliente(lista.get(i));
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		
		
		
		
	}
	
	

}
