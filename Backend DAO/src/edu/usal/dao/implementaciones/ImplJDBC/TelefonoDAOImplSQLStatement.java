package edu.usal.dao.implementaciones.ImplJDBC;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import edu.usal.dao.interfaces.TelefonoDAO;
import edu.usal.domain.Telefono;
import edu.usal.util.ConexionSQLServer;

public class TelefonoDAOImplSQLStatement implements TelefonoDAO {


		@Override
		public Telefono ObtenerTelefono(Telefono consulta) {
//
//
//			Connection con = ConexionSQLServer.QuispeConexion();
//		    Statement ps;
//
//		    try {
//				ps = con.createStatement();
//
//			    String query = "SELECT * FROM Telefono WHERE Telefono.IDTelefono = '"+consulta.getIDTelefono()+"'";
//
//				ResultSet rs = ps.executeQuery(query);
//
//				rs.next();
//
//			        Telefono telefono = new Telefono  (rs.getString(1),
//			        new Cliente (rs.getString(2)),rs.getString(3),
//					rs.getString(4),
//					rs.getString(5));
//
//				rs.close();
//				ps.close();
//				con.close();
//
//	             return telefono;
//
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//
			return null;
		}

		@Override
		public List<Telefono> listadodeTelefonos() {
//
//
//			Connection con = ConexionSQLServer.QuispeConexion();
//
//			try {
//
//			Statement st = con.createStatement();
//
//			List<Telefono> lista = new ArrayList<Telefono>();
//			String query= "SELECT * FROM Telefono";
//
//			 ResultSet rs = st.executeQuery(query);
//
//			 while (rs.next())
//			 {
//
//
//			  lista.add( new Telefono  (rs.getString(1),
//				        new Cliente (rs.getString(2)),rs.getString(3),
//						rs.getString(4),
//						rs.getString(5)));
//
//			 }
//			 rs.close();
//			 st.close();
//			 con.close();
//
//			 return lista;
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//
			
			return null;
		}

		@Override
		public void AltadeTelefono(Telefono alta) {
	     
			Connection con = ConexionSQLServer.QuispeConexion();
			//transacion atomica , coxion comit
			  try {
				Statement st = con.createStatement();

			 String query= "INSERT INTO Telefono VALUES ('"	+alta.getIDTelefono() +"','"
			 
					 +alta.getCliente().getIDCliente()+"','"
					 +alta.getNumeroCelular()+"','"
					 +alta.getNumeroLaboral()+"','"
					 +alta.getNumeroPersonal()+"')";
			 
		   
		     st.execute(query);
			 st.close();
			 con.close();	
			 
			 
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

		}

		@Override
		public void ModificaciondeTelefono(Telefono modificar) {
		
			Connection con = ConexionSQLServer.QuispeConexion();
			Statement st = null;
			try {
				
				st = con.createStatement();
				
				String query = "UPDATE Telefono SET IDTelefono = '"	+modificar.getIDTelefono()
				+"',IDCliente = '"+modificar.getCliente().getIDCliente()+"',direccion = '"+modificar.getNumeroCelular()+"',telefono = '"
						+modificar.getNumeroLaboral()+"',PaginaWeb = '"+modificar.getNumeroPersonal()+"'" + " WHERE Telefono.IDTelefono = '"+modificar.getIDTelefono()+"'" ;
				
				st.execute(query);
				st.close();
				con.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

		@Override
		public void BajadeTelefono(Telefono baja) {
		
			
			Connection con = ConexionSQLServer.QuispeConexion();
			Statement st = null;
			try {
				
				st = con.createStatement();
				String query = "DELETE FROM Telefono WHERE Telefono.IDTelefono = '"+baja.getIDTelefono()+"'";
				
				st.execute(query);
				st.close();
				con.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}

	

}
