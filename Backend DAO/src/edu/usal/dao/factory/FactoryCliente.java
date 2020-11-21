package edu.usal.dao.factory;


import java.io.IOException;

import edu.usal.dao.implementaciones.ImplJDBC.ClienteDAOImplSQL;
import edu.usal.dao.interfaces.ClienteDAO;
import edu.usal.util.PropertiesUtil;


public class FactoryCliente {

	private static String implementacion = PropertiesUtil.getString("Cliente_implementation");

    public static ClienteDAO GetImplementacion() throws IOException {
        if (implementacion.equals("SQL")) {
			System.out.println("Retorno una implementacion del tipo SQL para el uso de clientes!");
            return new ClienteDAOImplSQL();
        } else if (implementacion.equals("TXT")) {
			System.out.println("?");
		}
        return null;
    }


}
