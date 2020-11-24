package edu.usal.dao.factory;

import edu.usal.dao.implementaciones.ImplJDBC.ClienteDAOImplSQL;
import edu.usal.dao.implementaciones.ImplJDBC.VueloDAOImplSQL;
import edu.usal.dao.interfaces.VueloDAO;
import edu.usal.util.PropertiesUtil;

public class FactoryVuelo {

    private static String implementacion = PropertiesUtil.getString("Vuelo_implementation");

    public static VueloDAO GetVueloImplementacion(String sql) {
        if (implementacion.equals("SQL")) {
            System.out.println("Retorno una implementacion del tipo SQL para el uso de clientes!");
            return new VueloDAOImplSQL();
        } else if (implementacion.equals("TXT")) {
            System.out.println("?");
        }
        return null;
    }
}
