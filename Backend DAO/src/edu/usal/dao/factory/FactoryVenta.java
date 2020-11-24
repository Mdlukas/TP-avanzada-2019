package edu.usal.dao.factory;

import edu.usal.dao.implementaciones.ImplJDBC.VentaDAOImplSQL;
import edu.usal.dao.interfaces.VentaDAO;
import edu.usal.util.PropertiesUtil;

public class FactoryVenta {

    private static String implementacion = PropertiesUtil.getString("Venta_implementation");

    public static VentaDAO GetVentaImplementacion(String sql) {
        if (implementacion.equals("SQL")) {
            System.out.println("Retorno una implementacion del tipo SQL para el uso de clientes!");
            return new VentaDAOImplSQL();
        } else if (implementacion.equals("TXT")) {
            System.out.println("?");
        }
        return null;
    }
}
