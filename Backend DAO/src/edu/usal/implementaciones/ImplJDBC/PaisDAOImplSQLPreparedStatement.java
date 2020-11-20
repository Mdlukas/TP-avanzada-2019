package edu.usal.implementaciones.ImplJDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import edu.usal.dao.interfaces.PaisDAO;
import edu.usal.dao.negocio.Pais;
import edu.usal.util.ConexionSQLServer;

public class PaisDAOImplSQLPreparedStatement implements PaisDAO {

	@Override
	public Pais ObtenerPais(Pais obtener) {
		
		Connection con = ConexionSQLServer.QuispeConexion();
	    PreparedStatement ps = null;
		try {
			
			ps = con.prepareStatement("SELECT * FROM Pais WHERE IDPais = ?");
			ps.setString(1, obtener.getIDPais());
			ResultSet rs =  ps.executeQuery();
				    
	        rs.next();
	     	        
			Pais pais = new Pais(rs.getString(1),
					rs.getString(2));	

			rs.close();	
			ps.close();
			con.close();
				return pais;
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public List<Pais> listadodePaises() {
	
		Connection con = ConexionSQLServer.QuispeConexion();
		PreparedStatement ps = null;
		
		List <Pais> lista = new ArrayList <Pais>();
		
		try {
			
		ps = con.prepareStatement("SELECT * FROM Pais");
		ResultSet rs =  ps.executeQuery();
		
		while (rs.next()) {
			
			lista.add(new Pais
					(rs.getString(1),
					rs.getString(2)));
		}
		
		ps.close();
		con.close();
		
		return lista;
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}


	@Override
	public void AltadePais(Pais alta) {
		
		Connection  con = ConexionSQLServer.QuispeConexion();
		PreparedStatement miAlta = null;
		
		try {
			
			miAlta = con.prepareStatement("INSERT INTO Pais (IDPais,NombrePais) VALUES (?,?)");
			
			miAlta.setString(1, alta.getIDPais());
			miAlta.setString(2, alta.getNombrePais());
			
			miAlta.execute();
			miAlta.close();
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void ModificaciondePais(Pais modificar) {
	

		Connection con = ConexionSQLServer.QuispeConexion();
	    PreparedStatement ps = null;
		
	    try {
			ps = con.prepareStatement("UPDATE Pais SET IDPais = ?,NombrePais = ?"
					+ " WHERE Pais.IDPais = ?");
		    ps.setString(1, modificar.getIDPais());
	        ps.setString(2, modificar.getNombrePais());
	        ps.setString(3, modificar.getIDPais());
	        
	        ps.execute();
	        ps.close();
	        con.close();
	    } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void BajadePais(Pais baja) {

		Connection con = ConexionSQLServer.QuispeConexion();
	    PreparedStatement ps = null;
		
	    try {
	    	
			ps = con.prepareStatement("DELETE FROM Pais WHERE IDPais = ? ");
			
			ps.setString(1, baja.getIDPais());
			
	
			ps.execute();
	        
	        ps.close();
	        con.close();
	    } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
}
