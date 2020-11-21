package edu.usal.dao.factory;

import java.io.IOException;

import edu.usal.dao.implementaciones.ImplJDBC.AerolineaDAOImplSQLCallebleStatement;
import edu.usal.dao.implementaciones.ImplJDBC.AeropuertoDAOImplSQLCallebleStatement;
import edu.usal.dao.implementaciones.ImplJDBC.DireccionDAOImplSQLStatement;
import edu.usal.dao.implementaciones.ImplJDBC.PaisDAOImplSQLPreparedStatement;
import edu.usal.dao.implementaciones.ImplJDBC.PasajeroDAOImplSQLCallebleStatement;
import edu.usal.dao.implementaciones.ImplJDBC.PasaporteDAOImplSQLPreparedStatement;
import edu.usal.dao.implementaciones.ImplJDBC.ProvinciaDAOImplSQLStatement;
import edu.usal.dao.implementaciones.ImplJDBC.TelefonoDAOImplSQLStatement;
import edu.usal.dao.implementaciones.ImplJDBC.VentaDAOImplSQLCallebleStatement;
import edu.usal.dao.implementaciones.ImplJDBC.VueloDAOImplSQLCallebleStatement;
import edu.usal.dao.interfaces.AerolineaDAO;
import edu.usal.dao.interfaces.AeropuertoDAO;
import edu.usal.dao.interfaces.DireccionDAO;
import edu.usal.dao.interfaces.PaisDAO;
import edu.usal.dao.interfaces.PasajeroDAO;
import edu.usal.dao.interfaces.PasaporteDAO;
import edu.usal.dao.interfaces.ProvinciaDAO;
import edu.usal.dao.interfaces.TelefonoDAO;
import edu.usal.dao.interfaces.VentaDAO;
import edu.usal.dao.interfaces.VueloDAO;

public class FactoryGeneralJDBC {


    public static PaisDAO GetPaisImplementacion(String dao) throws IOException {
        if (dao.equals("sql")) {
            return new PaisDAOImplSQLPreparedStatement();
        }
        return null;
    }


    public static ProvinciaDAO GetProvinciaImplementacion(String dao) throws IOException {
        if (dao.equals("sql")) {
            return new ProvinciaDAOImplSQLStatement();
        }
        return null;
    }


    public static AeropuertoDAO GetAeropuertoImplementacion(String dao) throws IOException {
        if (dao.equals("sql")) {
            return new AeropuertoDAOImplSQLCallebleStatement();
        }
        return null;
    }


    public static TelefonoDAO GetTelefonoImplementacion(String dao) throws IOException {
        if (dao.equals("sql")) {
            return new TelefonoDAOImplSQLStatement();
        }
        return null;
    }


    public static DireccionDAO GetDireccionImplementacion(String dao) throws IOException {
        if (dao.equals("sql")) {
            return new DireccionDAOImplSQLStatement();
        }
        return null;
    }


    public static PasaporteDAO GetPasaporteImplementacion(String dao) throws IOException {
        if (dao.equals("sql")) {
            return new PasaporteDAOImplSQLPreparedStatement();
        }
        return null;
    }


    public static PasajeroDAO GetPasajeroImplementacion(String dao) throws IOException {
        if (dao.equals("sql")) {
            return new PasajeroDAOImplSQLCallebleStatement();
        }
        return null;
    }


    public static AerolineaDAO GetAerolineaImplementacion(String dao) throws IOException {
        if (dao.equals("sql")) {
            return new AerolineaDAOImplSQLCallebleStatement();
        }
        return null;
    }


    public static VentaDAO GetVentaImplementacion(String dao) throws IOException {
        if (dao.equals("sql")) {
            return new VentaDAOImplSQLCallebleStatement();
        }
        return null;
    }


    public static VueloDAO GetVueloImplementacion(String dao) throws IOException {
        if (dao.equals("sql")) {
            return new VueloDAOImplSQLCallebleStatement();
        }
        return null;
    }


}
