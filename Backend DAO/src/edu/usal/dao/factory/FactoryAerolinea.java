package edu.usal.dao.factory;

import edu.usal.dao.implementaciones.ImplJDBC.AerolineaDAOImplSQL;
import edu.usal.dao.interfaces.AerolineaDAO;
import edu.usal.util.PropertiesUtil;

public class FactoryAerolinea {

    private static final String implementacion = PropertiesUtil.getString("Aerolineas_implementation");

    public static AerolineaDAO GetAerolineaImplementacion() {
        if (implementacion.equals("SQL")) {
            System.out.println("Retorno una implementacion del tipo SQL para el uso de Aerolineas!");
            return new AerolineaDAOImplSQL();
        } else if (implementacion.equals("TXT")) {
            System.out.println("No hay imeplementacion TXT cargada.");
        }
        return null;
    }

}
