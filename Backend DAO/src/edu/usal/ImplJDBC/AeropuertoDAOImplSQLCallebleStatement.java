package edu.usal.ImplJDBC;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import edu.usal.dao.interfaces.AeropuertoDAO;

import edu.usal.dao.negocio.Aeropuerto;
import edu.usal.dao.negocio.Pais;
import edu.usal.dao.negocio.Provincia;
import edu.usal.util.ConexionSQLServer;

public class AeropuertoDAOImplSQLCallebleStatement implements AeropuertoDAO {

	@Override
	public Aeropuerto ObtenerAeropuerto(Aeropuerto obtener) {
		
		Connection con = ConexionSQLServer.QuispeConexion();	
		CallableStatement Consulta = null;
		
		try {
			
		    Consulta = con.prepareCall("{call SP_ConsultadeAeropuerto (?)}");
			System.out.println("Ingrese IDAeropuerto para consultar: ");

			
			Consulta.setInt(1, obtener.getIDAeropuerto());
			
			ResultSet rs = Consulta.executeQuery();
		    
	         rs.next();
			Aeropuerto aeropuerto = new Aeropuerto(rs.getInt(1),
					rs.getString(2),
					rs.getString(3),
				    new Pais(rs.getString(4)),
					new Provincia(rs.getString(5)));	
			
			rs.close();
			Consulta.close();
			con.close();
			
			return aeropuerto;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public List<Aeropuerto> listadodeAeropuertos() {
		
		Connection con = ConexionSQLServer.QuispeConexion();	
		CallableStatement miListado = null;
		
		try {
			
			miListado = con.prepareCall("{call SP_ListadodeAeropuerto}");
		    ResultSet rs = miListado.executeQuery();
			
			//PaisDAO paisDAO = FactoryGeneralJDBC.GetPaisImplementacion("sql");
			//ProvinciaDAO provinciaDAO = FactoryGeneralJDBC.GetProvinciaImplementacion("sql");
			
			
			List<Aeropuerto> listado = new  ArrayList<Aeropuerto>();
	         while (rs.next())
	         {
	               listado.add(new Aeropuerto(rs.getInt(1),
	            		   rs.getString(2),
	            		   rs.getString(3),
	            		//   paisDAO.ObtenerPais(new Pais(rs.getString(4))),
                        //   provinciaDAO.ObtenerProvincia(new Provincia(rs.getString(5))) 
                          new Pais(rs.getString(4)), new Provincia(rs.getString(5)) 
	            ));
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
	public void AltadeAeropuerto(Aeropuerto alta) {

		Connection con = ConexionSQLServer.QuispeConexion();	
		CallableStatement miAlta = null;
		
		try {
				
			miAlta = con.prepareCall("{CALL SP_AltadeAeropuerto (?,?,?,?)}");
		
			miAlta.setString(1, alta.getCodigodeAeropuerto());
			miAlta.setString(2, alta.getCiudad());
			miAlta.setString(3, alta.getPais().getIDPais());
			miAlta.setString(4, alta.getProvincia().getIDProvincia());
			
			miAlta.executeUpdate();
			miAlta.close();
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	
	@Override
	public void ModificaciondeAeropuerto(Aeropuerto modificar) {
		
		Connection con = ConexionSQLServer.QuispeConexion();	
		CallableStatement miModificacion = null;
		
		try {
			
			miModificacion = con.prepareCall("{call SP_ModificaciondeAeropuerto (?,?,?,?,?) }");
			
			miModificacion.setInt(1, modificar.getIDAeropuerto());
			miModificacion.setString(2, modificar.getCodigodeAeropuerto());
			miModificacion.setString(3,modificar.getCiudad());
			miModificacion.setString(4, modificar.getPais().getIDPais());
			miModificacion.setString(5, modificar.getProvincia().getIDProvincia());
			
		
			
			miModificacion.executeUpdate();
			miModificacion.close();
			con.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	
	
	@Override
	public void BajadeAeropuerto(Aeropuerto bajaAeropuerto) {

		Connection con = ConexionSQLServer.QuispeConexion();	
		CallableStatement miBaja = null;
		
		try {
	
			miBaja = con.prepareCall("{CALL SP_BajadeAeropuerto (?)}");
			miBaja.setInt(1, bajaAeropuerto.getIDAeropuerto());
            
		    miBaja.executeUpdate();
			miBaja.close();
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
