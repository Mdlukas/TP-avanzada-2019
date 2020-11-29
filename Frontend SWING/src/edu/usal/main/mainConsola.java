package edu.usal.main;

import edu.usal.util.ConexionSQLServer;
import edu.usal.vista.consola.VISTAGENERAL;

public class mainConsola {

		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (ConexionSQLServer.ConnectToSqlDatabase() != null) {
			VISTAGENERAL Vista = new VISTAGENERAL();
			Vista.MenuPrincipal();
		}
	}


	
}
