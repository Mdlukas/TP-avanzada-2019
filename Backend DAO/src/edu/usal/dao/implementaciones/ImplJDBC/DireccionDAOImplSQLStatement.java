package edu.usal.dao.implementaciones.ImplJDBC;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;


import edu.usal.dao.interfaces.DireccionDAO;
import edu.usal.domain.Direccion;
import edu.usal.util.ConexionSQLServer;

public class DireccionDAOImplSQLStatement implements  DireccionDAO {

	@Override
	public Direccion ObtenerDireccion(Direccion consulta) {
	

//		Connection con = ConexionSQLServer.QuispeConexion();
//	    Statement ps;
//
//
//	    try {
//			ps = con.createStatement();
//
//		    String query = "SELECT * FROM Direccion WHERE Direccion.IDDireccion = '"+consulta.getIDDireccion()+"'";
//
//			ResultSet rs = ps.executeQuery(query);
//
//			rs.next();
//
//		        Direccion Direccion = new Direccion  (rs.getString(1),
//		        rs.getString(2),
//				rs.getString(3),
//				rs.getString(4),
//				rs.getString(5), new Pais (rs.getString(6)), new Provincia (rs.getString(7)), new Cliente (rs.getString(8)) );
//
//			rs.close();
//			ps.close();
//			con.close();
//
//             return Direccion;
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//
	    
		
		return null;
	}

	@Override
	public List<Direccion> listadodeDirecciones() {
        
		
//		Connection con = ConexionSQLServer.QuispeConexion();
//
//		try {
//
//		Statement st = con.createStatement();
//
//		List<Direccion> lista = new ArrayList<Direccion>();
//		String query= "SELECT * FROM Direccion";
//
//		 ResultSet rs = st.executeQuery(query);
//
//		 while (rs.next())
//		 {
//
//
//		  lista.add(new Direccion  (rs.getString(1),
//			        rs.getString(2),
//					rs.getString(3),
//					rs.getString(4),
//					rs.getString(5),
//					new Pais (rs.getString(6)), new Provincia (rs.getString(7)), new Cliente (rs.getString(8)) ));
//
//		 }
//		 rs.close();
//		 st.close();
//		 con.close();
//
//		 return lista;
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	     
		
		return null;
	}

	@Override
	public void AltadeDireccion(Direccion alta) {
     
		Connection con = ConexionSQLServer.QuispeConexion();
		
		  try {
			Statement st = con.createStatement();

		 String query= "INSERT INTO Direccion VALUES ('"	+alta.getIDDireccion() +"','"
		 
				 +alta.getCalle()+"','"
				 +alta.getAltura()+"','"
				 +alta.getCiudad()+"','"
				 +alta.getCodigoPostal()+ "','" +alta.getPais().getIDPais()+"','"
				 +alta.getProvincia().getIDProvincia()+"','"+alta.getCliente().getIDCliente() + "')";

		 
	     st.execute(query);
		 st.close();
		 con.close();	
		 
		 
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

	@Override
	public void ModificaciondeDireccion(Direccion modificar) {
	
		Connection con = ConexionSQLServer.QuispeConexion();
		Statement st = null;
		try {
			
			st = con.createStatement();
			
			String query = "UPDATE Direccion SET IDDireccion = '"	+modificar.getIDDireccion()
			+"',Calle = '"+modificar.getCalle()+"',Altura = '"+modificar.getAltura()+"',Ciudad = '"
					+modificar.getCiudad()+"',codigoPostal = '"+modificar.getCodigoPostal()+"'"
			+ "',Pais = '"+modificar.getPais().getIDPais() + "',Provincia = '"+modificar.getProvincia().getIDProvincia()
                 + "',Cliente = '"+modificar.getCliente().getIDCliente()
                 + " WHERE Direccion.IDDireccion = '"+modificar.getIDDireccion()+"'" ;
			
			st.execute(query);
			st.close();
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void BajadeDireccion(Direccion baja) {
	
		
		Connection con = ConexionSQLServer.QuispeConexion();
		Statement st = null;
		try {
			
			st = con.createStatement();
			String query = "DELETE FROM Direccion WHERE Direccion.IDDireccion = '"+baja.getIDDireccion()+"'";
			
			st.execute(query);
			st.close();
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}



}

