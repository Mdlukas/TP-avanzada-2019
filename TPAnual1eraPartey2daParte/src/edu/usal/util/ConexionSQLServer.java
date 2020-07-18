package edu.usal.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionSQLServer {
	
	
	public static synchronized Connection QuispeConexion() {
		try {
						
			Class.forName(PropertiesUtil.getString("JDBC_DRIVER"));
			Connection connection = DriverManager.getConnection(PropertiesUtil.getString("JDBC_URL"), PropertiesUtil.getString("JDBC_USER"), PropertiesUtil.getString("JDBC_PASS"));
			if (!connection.isClosed()) {
				return connection;
			}
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
			
		} 
		
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	

}
