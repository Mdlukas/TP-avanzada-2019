package edu.usal.dao.factory;

import edu.usal.dao.implementaciones.ImplStreamYString.AlianzaDAOImplFile;
import edu.usal.dao.interfaces.AlianzaDAO;
import edu.usal.util.PropertiesUtil;

public class FactoryAlianza {

    private static final String implementacion = PropertiesUtil.getString("Alianza_implementation");

    public static AlianzaDAO GetVentaImplementacion(String sql) {
        if (implementacion.equals("SQL")) {
            System.out.println("Retorno una implementacion del tipo SQL para el uso de alianzas!");
            //Pero alianzas no tiene una implementacion SQL!
            return null;
        } else if (implementacion.equals("FILE")) {
            System.out.println("Retorno una implementacion del tipo TXT para el uso de alianzas!");
            return new AlianzaDAOImplFile();
        }
        return null;
    }
}
