package edu.usal.dao.implementaciones.ImplStreamYString;

import edu.usal.dao.interfaces.ProvinciaDAO;
import edu.usal.domain.Provincia;
import edu.usal.domain.Provincia;
import edu.usal.util.FileHelper;
import edu.usal.util.PropertiesUtil;

import java.io.File;
import java.util.ArrayList;

public class ProvinciaDAOImplFile implements ProvinciaDAO {

    //Primero instancio el file.
    static String path = PropertiesUtil.getString("path_files") + "/provincias.txt";
    //Genero path especifico dependiendo del file.
    File f = new File(path);

    @Override
    public ArrayList<Provincia> ReadList() {
        provinciasCargadas.clear();
        for (String textoEncontrado : FileHelper.LeerArchivoLista(path)) {
            Provincia p = new Provincia();
            p.setNombreProvincia(textoEncontrado);
            provinciasCargadas.add(p);
        }
        return provinciasCargadas;
    }

    @Override
    public Provincia BuscarPorNombre(String nombre) {
        for (Provincia provincia : provinciasCargadas) {
            if (provincia.getNombreProvincia().equalsIgnoreCase(nombre)) {
                return provincia;
            }
        }
        return null;
    }
}
