package edu.usal.dao.implementaciones.ImplJDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import edu.usal.dao.interfaces.VueloDAO;
import edu.usal.domain.Aerolinea;
import edu.usal.domain.Aeropuerto;
import edu.usal.domain.Vuelo;
import edu.usal.util.ConexionSQLServer;

public class VueloDAOImplSQL implements VueloDAO {

	@Override
	public Vuelo ConsultadeVuelo(Vuelo obtener) {
	
		Connection con = ConexionSQLServer.QuispeConexion();	
		CallableStatement miConsulta = null;
		
		try {
			
			miConsulta = con.prepareCall("{call SP_ConsultadeVuelo (?)}");
			System.out.println("Ingrese IDVuelo para consultar: ");
			miConsulta.setString(1, obtener.getIDVuelo());
			 
			 ResultSet rs = miConsulta.executeQuery();
		    
	         rs.next();
			Vuelo Vuelo = new Vuelo(rs.getString(1),
					rs.getInt(2),
					rs.getString(3),
					rs.getString(4),
					rs.getString(5),
					rs.getString(6), new Aeropuerto (rs.getInt(7)), new Aeropuerto (rs.getInt(8)), new Aerolinea (rs.getString(9)));	

         
			rs.close();
			miConsulta.close();
			con.close();
			return Vuelo;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	
	@Override
	public List<Vuelo> listadodeVuelos() {
	
		Connection con = ConexionSQLServer.QuispeConexion();	
		CallableStatement miListado = null;
		
		try {
			
			miListado = con.prepareCall("{call SP_ListadodeVuelo}");
		    ResultSet rs = miListado.executeQuery();
			

			List<Vuelo> listado = new  ArrayList<Vuelo>();
	         while (rs.next())
	         {
	        	 
	               listado.add(new Vuelo(rs.getString(1),
	   					rs.getInt(2),
						rs.getString(3),
						rs.getString(4),
						rs.getString(5),
						rs.getString(6),
	new Aeropuerto (rs.getInt(7)), new Aeropuerto (rs.getInt(8)), new Aerolinea (rs.getString(9))));
	         
	         }
	         
			rs.close();
			miListado.close();
			con.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return null;
	}

	
	
	@Override
	public void AltadeVuelo(Vuelo alta) {

		Connection con = ConexionSQLServer.QuispeConexion();	
		CallableStatement miAlta = null;
		
		
		try {
	
			miAlta = con.prepareCall("{CALL SP_AltadeVuelo (?,?,?,?,?,?,?,?,?)}");
			
			miAlta.setString(1, alta.getIDVuelo());
			miAlta.setInt(2, alta.getNumerodeVuelo());
			miAlta.setString(3, alta.getCantAsientos());
			miAlta.setString(4,alta.getFechaSalida());
			miAlta.setString(5, alta.getFechaLLegada());
			miAlta.setString(6, alta.getTiempovuelo());
			
			miAlta.setInt(8, alta.getAeropuertodeSalida().getIDAeropuerto());
			miAlta.setInt(7, alta.getAeropuertodeLLegada().getIDAeropuerto());
			miAlta.setString(9, alta.getAerolinea().getIDAerolinea());
			
			miAlta.executeUpdate();
			miAlta.close();
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

	@Override
	public void ModificaciondeVuelo(Vuelo modificar) {
	
		Connection con = ConexionSQLServer.QuispeConexion();	
		CallableStatement miModificacion = null;
		
	
		try {
			
			miModificacion = con.prepareCall("{call SP_ModificaciondeVuelo (?,?,?,?,?,?,?,?,?) }");
			
			miModificacion.setString(1, modificar.getIDVuelo());
			miModificacion.setInt(2, modificar.getNumerodeVuelo());
			miModificacion.setString(3,modificar.getCantAsientos());
			miModificacion.setString(4, modificar.getFechaSalida());
			miModificacion.setString(5, modificar.getFechaLLegada());
			miModificacion.setString(6, modificar.getTiempovuelo());
		
			miModificacion.setInt(8, modificar.getAeropuertodeSalida().getIDAeropuerto());
			miModificacion.setInt(7, modificar.getAeropuertodeLLegada().getIDAeropuerto());
			miModificacion.setString(9, modificar.getAerolinea().getIDAerolinea());
			
			
			miModificacion.executeUpdate();
			miModificacion.close();
			con.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	@Override
	public void BajadeVuelo(Vuelo baja) {

		Connection con = ConexionSQLServer.QuispeConexion();	
		CallableStatement miBaja = null;
		
		
		try {
	
			miBaja = con.prepareCall("{CALL SP_BajadeVuelo (?)}");
			miBaja.setString(1, baja.getIDVuelo());
            
			miBaja.executeUpdate();
			miBaja.close();
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
	
	

}
