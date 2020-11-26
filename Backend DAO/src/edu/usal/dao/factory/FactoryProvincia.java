package edu.usal.dao.factory;

import edu.usal.dao.implementaciones.ImplStreamYString.ProvinciaDAOImplFile;
import edu.usal.dao.interfaces.ProvinciaDAO;
import edu.usal.util.PropertiesUtil;

public class FactoryProvincia {

    private static final String implementacion = PropertiesUtil.getString("Alianza_implementation");

    public static ProvinciaDAO GetProvinciaImplementacion(String sql) {
        if (implementacion.equals("SQL")) {
            System.out.println("Retorno una implementacion del tipo SQL para el uso de provincias!");
            //Pero alianzas no tiene una implementacion SQL!
            return null;
        } else if (implementacion.equals("FILE")) {
            System.out.println("Retorno una implementacion del tipo TXT para el uso de provincias!");
            return new ProvinciaDAOImplFile();
        }
        return null;
    }
}
