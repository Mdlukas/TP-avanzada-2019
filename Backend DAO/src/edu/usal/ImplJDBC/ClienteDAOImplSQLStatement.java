package edu.usal.ImplJDBC;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import edu.usal.dao.interfaces.ClienteDAO;
import edu.usal.dao.negocio.Cliente;
import edu.usal.util.ConexionSQLServer;

public class ClienteDAOImplSQLStatement implements ClienteDAO {

	@Override
	public Cliente ConsultadeCliente(Cliente IDCliente) {
		

		Connection con = ConexionSQLServer.QuispeConexion();
	    Statement ps;
		
	    
	    try {
			ps = con.createStatement();
	
		    String query = "SELECT * FROM Cliente WHERE Cliente.IDCliente = '"+IDCliente.getIDCliente()+"'";
		    
			ResultSet rs = ps.executeQuery(query);
			
			rs.next();
			
		        Cliente Cliente = new Cliente  (rs.getString(1), 
		        rs.getString(2),
				rs.getString(3),
				rs.getString(4),
				rs.getString(5),
				rs.getString(6),
				rs.getString(7));
			
			rs.close();
			ps.close();
			con.close();
		
             return Cliente;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	    
		
		
		return null;
	}

	@Override
	public List<Cliente> leerTodoCliente() throws IOException, ClassNotFoundException {
	
		Connection con = ConexionSQLServer.QuispeConexion();
		  
		try {
		
		Statement st = con.createStatement();
			
		List<Cliente> lista = new ArrayList<Cliente>();
		String query= "SELECT * FROM Cliente";
			
		 ResultSet rs = st.executeQuery(query);

		 while (rs.next())
		 {
			 
			 
		  lista.add(new Cliente (rs.getString(1), 
			        rs.getString(2),
					rs.getString(3),
					rs.getString(4),
					rs.getString(5),
				  	rs.getString(6),
				  	rs.getString(7)));
		 }
		 rs.close();
		 st.close();
		 con.close();
		 
		 return lista;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     
		
		
		
		return null;
	}

	@Override
	public void AltaCliente(Cliente alta) throws IOException, ClassNotFoundException {

				Connection con = ConexionSQLServer.QuispeConexion();
		
		  try {
			Statement st = con.createStatement();

		 String query= "INSERT INTO Cliente VALUES ('"
				 +alta.getIDCliente() +"','"
				 +alta.getNombreCliente()+"','"
				 +alta.getApellidoCliente()+"','"
				 +alta.getDni()+"','"
				 +alta.getCuit()+ "','"
				 +alta.getFechaNacimiento()+ "','"
				 +alta.getMail()+"')";
	
	     st.execute(query);
		 st.close();
		 con.close();	
		 
		 
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

	@Override
	public void ModCliente(Cliente modificar) throws ClassNotFoundException, IOException {
	
		Connection con = ConexionSQLServer.QuispeConexion();
		Statement st = null;
		try {
			
			st = con.createStatement();
			
			String query = "UPDATE Cliente SET IDCliente = '"	+modificar.getIDCliente()
			+"',NombreCliente = '"+modificar.getNombreCliente()+"',ApellidoCliente = '"+modificar.getApellidoCliente()+"', DNI = '"
					+modificar.getDni()+"',Cuit = '"+modificar.getCuit()+"', FechaNacimiento = '"+modificar.getFechaNacimiento()+"',Mail ='"+modificar.getMail()+"'"  + " WHERE Cliente.IDCliente = '"+modificar.getIDCliente()+"'" ;
			
			st.execute(query);
			st.close();
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

	@Override
	public void BajaCliente(Cliente baja) throws ClassNotFoundException, IOException {
	
		Connection con = ConexionSQLServer.QuispeConexion();
		Statement st = null;
		try {
			
			st = con.createStatement();
			String query = "DELETE FROM Cliente WHERE Cliente.IDCliente = '"+baja.getIDCliente()+"'";
			
			st.execute(query);
			st.close();
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
}
