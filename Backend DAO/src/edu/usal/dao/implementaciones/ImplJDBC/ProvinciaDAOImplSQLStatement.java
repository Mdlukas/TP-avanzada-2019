package edu.usal.dao.implementaciones.ImplJDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import edu.usal.dao.interfaces.ProvinciaDAO;
import edu.usal.domain.Provincia;
import edu.usal.util.ConexionSQLServer;

public class ProvinciaDAOImplSQLStatement implements ProvinciaDAO {

	@Override
	public Provincia ObtenerProvincia(Provincia obtener) {
	

		Connection con = ConexionSQLServer.QuispeConexion();
	    Statement ps;
		
	    try {
			ps = con.createStatement();
	
		    String query = "SELECT * FROM Provincia WHERE Provincia.IDProvincia = '"+obtener.getIDProvincia()+"'";
		    
			ResultSet rs = ps.executeQuery(query);
			
			rs.next();
			
			Provincia provincia = new Provincia (rs.getString(1),rs.getString(2));
			
			rs.close();
			ps.close();
			con.close();
		
             return provincia;
             
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return null;
	}

	
	@Override
	public List<Provincia> listadodeProvincias() {

		Connection con = ConexionSQLServer.QuispeConexion();
		  
		try {
		
		Statement st = con.createStatement();
			
		List<Provincia> lista = new ArrayList<Provincia>();
		String query= "SELECT * FROM Provincia";
			
		 ResultSet rs = st.executeQuery(query);

		 while (rs.next())
		 {
			 
			 
		  lista.add(new Provincia (rs.getString(1),
				  rs.getString(2)));
	
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
	public void AltadeProvincia(Provincia alta) {
		
		Connection con = ConexionSQLServer.QuispeConexion();
		
		  try {
			Statement st = con.createStatement();

		 String query= "INSERT INTO Provincia VALUES ('"	+alta.getIDProvincia() +"','"
		 +alta.getNombreProvincia()+"')";

	     st.execute(query);
		 st.close();
		 con.close();	
		 
		 
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		

	}

	@Override
	public void ModificaciondeProvincia(Provincia modificar) {
		
		Connection con = ConexionSQLServer.QuispeConexion();
		Statement st = null;
		try {
			
			st = con.createStatement();
			
			String query = "UPDATE Provincia SET IDProvincia = '"	+modificar.getIDProvincia()
			+"',nombreProvincia = '"+modificar.getNombreProvincia()+"'" + " WHERE Provincia.IDProvincia = '"+modificar.getIDProvincia()+"'" ;
			
			st.execute(query);
			st.close();
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void BajadeProvincia(Provincia BajaProvincia) {

		
		Connection con = ConexionSQLServer.QuispeConexion();
		Statement st = null;
		try {
			
			st = con.createStatement();
			String query = "DELETE FROM Provincia WHERE Provincia.IDProvincia = '"+BajaProvincia.getIDProvincia()+"'";
			
			st.execute(query);
			st.close();
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
