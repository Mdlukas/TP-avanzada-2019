package edu.usal.dao.implementaciones.ImplStreamYString;

import edu.usal.dao.interfaces.AlianzaDAO;
import edu.usal.domain.Alianza;
import edu.usal.util.FileHelper;
import edu.usal.util.PropertiesUtil;

import java.io.File;
import java.util.ArrayList;

public class AlianzaDAOImplFile implements AlianzaDAO {

    //Primero instancio el file.
    static String path = PropertiesUtil.getString("path_files") + "/alianzas.txt";
    //Genero path especifico dependiendo del file.
    File f = new File(path);

    @Override
    //Metodo que trae una lista de ovbjetos alianzas, basado en cada linea guardada en el file.
    public ArrayList<Alianza> ReadList() {
        alianzasCargadas.clear();
        for (String alianza : FileHelper.LeerArchivoLista(path)) {
            alianzasCargadas.add(new Alianza(alianza));
        }
        System.out.println("------------------------- "+alianzasCargadas.toString());
        return alianzasCargadas;
    }

    @Override
    //Metodo que recorre la lista en memoria y que retorna la alianza buscada, si no encuentra nada; vuelve un nulo.
    public Alianza BuscarPorNombre(String nombre) {
        for (Alianza alianza : alianzasCargadas) {
            if (alianza.getNombreAlianza().equalsIgnoreCase(nombre)) {
                return alianza;
            }
        }
        return null;
    }
}
