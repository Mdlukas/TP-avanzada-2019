package edu.usal.dao.implementaciones.ImplJDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import edu.usal.dao.interfaces.VentaDAO;
import edu.usal.domain.Venta;

import edu.usal.util.ConexionSQLServer;

public class VentaDAOImplSQLCallebleStatement implements VentaDAO {

	@Override
	public Venta ObtenerVenta(Venta obtener) {
//
//		Connection con = ConexionSQLServer.QuispeConexion();
//		CallableStatement miConsulta = null;
//
//		try {
//
//			miConsulta = con.prepareCall("{call SP_ConsultadeVenta (?)}");
//			System.out.println("Ingrese IDVenta para consultar: ");
//			miConsulta.setString(1, obtener.getIDVenta());
//
//			 ResultSet rs = miConsulta.executeQuery();
//
//	         rs.next();
//			Venta venta = new Venta(rs.getString(1),
//					rs.getString(2),
//					TipoPago.valueOf(rs.getString(3)),
//					new Cliente (rs.getString(4)),
//					new Vuelo (rs.getString(5)),
//					new Aerolinea(rs.getString(6)));
//
//
//			rs.close();
//			miConsulta.close();
//			con.close();
//
//			return venta;
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
	public List<Venta> listadodeVentas() {
//
//		Connection con = ConexionSQLServer.QuispeConexion();
//		CallableStatement miListado = null;
//
//		try {
//
//			miListado = con.prepareCall("{call SP_ListadodeVenta}");
//		    ResultSet rs = miListado.executeQuery();
//
//			List<Venta> listado = new  ArrayList<Venta>();
//
//			while (rs.next())
//	         {
//
//	               listado.add(new Venta(rs.getString(1),
//	   					rs.getString(2),
//						TipoPago.valueOf(rs.getString(3)),
//						new Cliente (rs.getString(4)),
//						new Vuelo (rs.getString(5)),
//						new Aerolinea(rs.getString(6))));
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
		
		return null;
	}

	@Override
	public void AltadeVenta(Venta alta) {
//
//
//
//		Connection con = ConexionSQLServer.QuispeConexion();
//		CallableStatement miAlta = null;
//
//
//		try {
//
//			miAlta = con.prepareCall("{CALL SP_AltadeVenta (?,?,?,?,?,?)}");
//
//			miAlta.setString(1, alta.getIDVenta());
//			miAlta.setString(2, alta.getFecha_HS_Venta());
//			miAlta.setString(3, alta.getFormadePago().toString());
//			miAlta.setString(4,alta.getCliente().getIDCliente());
//			miAlta.setString(5, alta.getVuelo().getIDVuelo());
//			miAlta.setString(6, alta.getAerolinea().getIDAerolinea() );
//
//			miAlta.executeUpdate();
//			miAlta.close();
//			con.close();
//
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//

	}

	
	
	@Override
	public void ModificaciondeVenta(Venta modificar) {
	
//
//		Connection con = ConexionSQLServer.QuispeConexion();
//		CallableStatement miModificacion = null;
//
//
//		try {
//
//			miModificacion = con.prepareCall("{call SP_ModificaciondeVenta (?,?,?,?,?,?) }");
//
//			miModificacion.setString(1, modificar.getIDVenta());
//			miModificacion.setString(2, modificar.getFecha_HS_Venta());
//			miModificacion.setString(3, modificar.getFormadePago().toString());
//			miModificacion.setString(4,modificar.getCliente().getIDCliente());
//			miModificacion.setString(5, modificar.getVuelo().getIDVuelo());
//			miModificacion.setString(6, modificar.getAerolinea().getIDAerolinea() );
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
//

	}

	
	
	@Override
	public void BajadeVenta(Venta baja) {
	
		
		Connection con = ConexionSQLServer.QuispeConexion();	
		CallableStatement miBaja = null;
		
		
		try {
	
			miBaja = con.prepareCall("{CALL SP_BajadeVenta (?)}");
			miBaja.setString(1, baja.getIDVenta());
            
	      miBaja.executeUpdate();
			miBaja.close();
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		

	}

	
	
}
