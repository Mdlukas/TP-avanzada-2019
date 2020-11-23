package edu.usal.dao.implementaciones.ImplJDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import edu.usal.dao.interfaces.AerolineaDAO;
import edu.usal.domain.Aerolinea;
import edu.usal.util.ConexionSQLServer;

public class AerolineaDAOImplSQL implements AerolineaDAO {

	@Override
	public Aerolinea ObtenerAerolinea(Aerolinea consulta) {
		
//
//		Connection con = ConexionSQLServer.QuispeConexion();
//		CallableStatement miConsulta = null;
//
//		try {
//
//			miConsulta = con.prepareCall("{call SP_ConsultadeAerolinea (?)}");
//			System.out.println("Ingrese IDAerolinea para consultar: ");
//			miConsulta.setString(1, consulta.getIDAerolinea());
//
//			 ResultSet rs = miConsulta.executeQuery();
//
//	         rs.next();
//			Aerolinea aerolinea = new Aerolinea(rs.getString(1),
//					rs.getString(2),
//					rs.getString(3));
//
//
//			rs.close();
//			miConsulta.close();
//			con.close();
//
//			return aerolinea;
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
		
		
		
		return null;
	}

	@Override
	public List<Aerolinea> listadodeAerolineas() {
	
//		Connection con = ConexionSQLServer.QuispeConexion();
//		CallableStatement miListado = null;
//
//		try {
//
//			miListado = con.prepareCall("{call SP_ListadodeAerolinea}");
//		    ResultSet rs = miListado.executeQuery();
//
//			List<Aerolinea> listado = new  ArrayList<Aerolinea>();
//	         while (rs.next())
//	         {
//
//	               listado.add(new Aerolinea(rs.getString(1),
//	            		   rs.getString(2),
//	            		   rs.getString(3)));
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
//
//
		
		return null;
	}

	@Override
	public void AltadeAerolinea(Aerolinea alta) {
		
//
//		Connection con = ConexionSQLServer.QuispeConexion();
//		CallableStatement miAlta = null;
//
//
//		try {
//
//			miAlta = con.prepareCall("{CALL SP_AltadeAerolinea (?,?,?)}");
//
//			miAlta.setString(1, alta.getIDAerolinea());
//			miAlta.setString(2, alta.getNombreAereoLinea());
//			miAlta.setString(3, alta.getAlianza());
//
//			miAlta.executeUpdate();
//
//			miAlta.close();
//			con.close();
//
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}

	@Override
	public void ModificaciondeAerolinea(Aerolinea modificar) {
		

//		Connection con = ConexionSQLServer.QuispeConexion();
//		CallableStatement miModificacion = null;
//
//
//		try {
//
//			miModificacion = con.prepareCall("{call SP_ModificaciondeAerolinea (?,?,?) }");
//
//			miModificacion.setString(1, modificar.getIDAerolinea());
//			miModificacion.setString(2, modificar.getNombreAereoLinea());
//			miModificacion.setString(3,modificar.getAlianza());
//
//
//			miModificacion.executeUpdate();
//			miModificacion.close();
//			con.close();
//
//
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}

	@Override
	public void BajadeAerolinea(Aerolinea baja) {
		
		
//		Connection con = ConexionSQLServer.QuispeConexion();
//		CallableStatement miBaja = null;
//
//
//		try {
//
//			miBaja = con.prepareCall("{CALL SP_BajadeAerolinea (?)}");
//			miBaja.setString(1, baja.getIDAerolinea());
//
//			miBaja.executeUpdate();
//			miBaja.close();
//			con.close();
//
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		

	}

}
