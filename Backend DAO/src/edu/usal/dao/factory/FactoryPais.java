package edu.usal.dao.factory;

import edu.usal.dao.implementaciones.ImplJDBC.ClienteDAOImplSQL;
import edu.usal.dao.implementaciones.ImplJDBC.PaisDAOImplSQL;
import edu.usal.dao.interfaces.ClienteDAO;
import edu.usal.util.PropertiesUtil;

import java.io.IOException;

public class FactoryPais {

    private static String implementacion = PropertiesUtil.getString("Pais_implementation");

    public static PaisDAOImplSQL GetImplementacion() throws IOException {
        if (implementacion.equals("SQL")) {
            System.out.println("Retorno una implementacion del tipo SQL para el uso de paises!");
            return new PaisDAOImplSQL();
        } else if (implementacion.equals("TXT")) {
            System.out.println("?");
        }
        return null;
    }
}
