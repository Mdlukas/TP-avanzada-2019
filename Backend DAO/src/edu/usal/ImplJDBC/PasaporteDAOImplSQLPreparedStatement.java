package edu.usal.ImplJDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import edu.usal.dao.interfaces.PasaporteDAO;
import edu.usal.dao.negocio.Cliente;
import edu.usal.dao.negocio.Pais;
import edu.usal.dao.negocio.Pasaporte;
import edu.usal.util.ConexionSQLServer;

public class PasaporteDAOImplSQLPreparedStatement implements PasaporteDAO {

	@Override
	public Pasaporte ObtenerPasaporte(Pasaporte obtener) {
		
		Connection con = ConexionSQLServer.QuispeConexion();
	    PreparedStatement ps = null;
		
		try {
			
			ps = con.prepareStatement("SELECT * FROM Pasaporte WHERE IDPasaporte = ?");
			ps.setString(1, obtener.getIDPasaporte());
			ResultSet rs =  ps.executeQuery();
			
			    
	        rs.next();
	        
	        
			Pasaporte Pasaporte = new Pasaporte(rs.getString(1),
					rs.getString(2),
					rs.getString(3), 
					rs.getString(4),rs.getString(5), new Pais (rs.getString(6)), new Cliente (rs.getString(7)) );	

         
			rs.close();	
			ps.close();
			con.close();
				return Pasaporte;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return null;
	}

	@Override
	public List<Pasaporte> listadodePasaportes() {
	
		

		Connection con = ConexionSQLServer.QuispeConexion();
	    PreparedStatement ps = null;
		
		try {
			List <Pasaporte> lista = new ArrayList <Pasaporte>();
			ps = con.prepareStatement("SELECT * FROM Pasaporte");
			ResultSet rs =  ps.executeQuery();
			
		
			
			while (rs.next()) {
				
				lista.add(new Pasaporte(rs.getString(1),
						rs.getString(2),
						rs.getString(3), 
						rs.getString(4),rs.getString(5), new Pais (rs.getString(6)), new Cliente (rs.getString(7)) ));
			}
			
			ps.close();
			con.close();
			
			return lista;
			
		} 
			catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
		return null;
	}

	@Override
	public void AltadePasaporte(Pasaporte alta) {

		Connection  con = ConexionSQLServer.QuispeConexion();
		PreparedStatement miAlta = null;
		
		try {
			
			
			miAlta = con.prepareStatement("INSERT INTO Pasaporte (IDPasaporte,NrodePasaporte,AutoridadEmision,FechadeEmision,FechadeVencimiento,IDPais,IDCliente) VALUES (?,?,?,?,?,?,?)");
			
			miAlta.setString(1, alta.getIDPasaporte());
			miAlta.setString(2, alta.getNrodePasaporte());
			miAlta.setString(3, alta.getAutoridadEmision()); 
			miAlta.setString(4, alta.getFechadeEmision());
			miAlta.setString(5, alta.getFechadeVencimiento());
			
			miAlta.setString(6, alta.getPais().getIDPais());
			miAlta.setString(7, alta.getCliente().getIDCliente());
			
			
			miAlta.execute();
			miAlta.close();
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

	@Override
	public void ModificaciondePasaporte(Pasaporte modificar) {
	
		
		Connection con = ConexionSQLServer.QuispeConexion();
	    PreparedStatement ps = null;
		
	    try {
	    	
			ps = con.prepareStatement("UPDATE Pasaporte SET IDPasaporte = ?,NrodePasaporte = ?,AutoridadEmision = ?,FechadeEmision = ?,fechadeVencimiento = ? , IDPais = ?, IDCliente = ?"
					+ " WHERE Pasaporte.IDPasaporte = ?");
			
		    ps.setString(1, modificar.getIDPasaporte());
	        ps.setString(2, modificar.getNrodePasaporte());
	        ps.setString(3, modificar.getAutoridadEmision());
	        ps.setString(4, modificar.getFechadeEmision());
	        ps.setString(5, modificar.getFechadeVencimiento());
	        
	        ps.setString(6, modificar.getPais().getIDPais());
	        ps.setString(7, modificar.getCliente().getIDCliente());
	        
	        ps.execute();
	        ps.close();
	        con.close();
	        
	    } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	
	@Override
	public void BajadePasaporte(Pasaporte baja) {
	
		Connection con = ConexionSQLServer.QuispeConexion();
	    PreparedStatement ps = null;
		
	    try {
	    	
	    	
			ps = con.prepareStatement("DELETE FROM Pasaporte WHERE IDPasaporte = ? ");
			
			ps.setString(1, baja.getIDPasaporte());
			
	
			ps.execute();
	        
	        ps.close();
	        con.close();
	
	    } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		

	}

	
	
	
}
