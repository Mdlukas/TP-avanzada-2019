package edu.usal.implementaciones.ImplJDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import edu.usal.dao.interfaces.PasajeroDAO;
import edu.usal.dao.negocio.Aerolinea;
import edu.usal.dao.negocio.Cliente;
import edu.usal.dao.negocio.Pasajero;
import edu.usal.util.ConexionSQLServer;

public class PasajeroDAOImplSQLCallebleStatement implements PasajeroDAO {

	@Override
	public Pasajero ObtenerPasajero(Pasajero consulta) {
//
//		Connection con = ConexionSQLServer.QuispeConexion();
//		CallableStatement miConsulta = null;
//
//		try {
//
//			miConsulta = con.prepareCall("{call SP_ConsultadePasajero (?)}");
//			System.out.println("Ingrese IDPasajero para consultar: ");
//			miConsulta.setString(1, consulta.getIDnrodepasajero());
//
//			 ResultSet rs = miConsulta.executeQuery();
//
//	         rs.next();
//			Pasajero Pasajero = new Pasajero(rs.getString(1),
//					rs.getString(2),
//					rs.getString(3),
//					rs.getString(4),new Cliente (rs.getString(6)),
//					new Aerolinea (rs.getString(5)));
//
//
//			rs.close();
//			miConsulta.close();
//			con.close();
//
//			return Pasajero;
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
		
		return null;
	}

	@Override
	public List<Pasajero> listadodePasajeros() {
		
//		Connection con = ConexionSQLServer.QuispeConexion();
//		CallableStatement miListado = null;
//
//		try {
//
//			miListado = con.prepareCall("{call SP_ListadodePasajero}");
//		    ResultSet rs = miListado.executeQuery();
//
//			List<Pasajero> listado = new  ArrayList<Pasajero>();
//	         while (rs.next())
//	         {
//
//	               listado.add(new Pasajero(rs.getString(1),
//	            		   rs.getString(2),
//	            		   rs.getString(3),
//	            		   rs.getString(4), new Cliente (rs.getString(5)),
//	            		   new Aerolinea (rs.getString(6))));
//
//	         }
//
//			rs.close();
//			miListado.close();
//			con.close();
//
//
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
		return null;
	}

	@Override
	public void AltadePasajero(Pasajero alta) {
	
//		Connection con = ConexionSQLServer.QuispeConexion();
//		CallableStatement miAlta = null;
//
//		try {
//
//			miAlta = con.prepareCall("{CALL SP_AltadePasajero (?,?,?,?,?,?)}");
//
//			miAlta.setString(1, alta.getIDnrodepasajero());
//			miAlta.setString(2, alta.getAlianza());
//			miAlta.setString(3, alta.getNumero());
//			miAlta.setString(4,alta.getCategoria());
//			miAlta.setString(5,alta.getCliente().getIDCliente());
//			miAlta.setString(6, alta.getAerolinea().getIDAerolinea());
//
//            miAlta.executeUpdate();
//			miAlta.close();
//			con.close();
//
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}

	@Override
	public void ModificaciondePasajero(Pasajero modificacion) {

		Connection con = ConexionSQLServer.QuispeConexion();	
		CallableStatement miModificacion = null;
		
	
		try {
			
			miModificacion = con.prepareCall("{call SP_ModificaciondePasajero (?,?,?,?,?,?) }");
			
			miModificacion.setString(1, modificacion.getIDnrodepasajero());
			miModificacion.setString(2, modificacion.getAlianza());
			miModificacion.setString(3, modificacion.getNumero());
			miModificacion.setString(4,modificacion.getCategoria());
			miModificacion.setString(5, modificacion.getCategoria());
			miModificacion.setString(6, modificacion.getAerolinea().getIDAerolinea());
			
		
			miModificacion.executeUpdate();
			miModificacion.close();
			con.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void BajadePasajero(Pasajero baja) {
		
		Connection con = ConexionSQLServer.QuispeConexion();	
		CallableStatement miBaja = null;
		
		
		try {
	
			miBaja = con.prepareCall("{CALL SP_BajadePasajero (?)}");
			miBaja.setString(1, baja.getIDnrodepasajero());
            
		    miBaja.executeUpdate();
			miBaja.close();
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	
	
}
