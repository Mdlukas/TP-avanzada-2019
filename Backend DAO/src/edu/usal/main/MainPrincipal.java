package edu.usal.main;

import edu.usal.dao.factory.FactoryAlianza;
import edu.usal.dao.factory.FactoryPais;
import edu.usal.dao.factory.FactoryProvincia;
import edu.usal.dao.interfaces.AlianzaDAO;
import edu.usal.dao.interfaces.PaisDAO;
import edu.usal.dao.interfaces.ProvinciaDAO;
import edu.usal.domain.Alianza;
import edu.usal.domain.Pais;
import edu.usal.domain.Provincia;
import edu.usal.util.ConexionSQLServer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainPrincipal {


    public static void main(String[] args) throws IOException, ClassNotFoundException {

//        System.out.println("--------------------- Este es un test de files!");
//        AlianzaDAO dao = FactoryAlianza.GetAlianzaImplementacion("FILE");
//        ProvinciaDAO dao2 = FactoryProvincia.GetProvinciaImplementacion("FILE");
//
//        ArrayList<Alianza> alianzasCargadas = dao.ReadList();
//        ArrayList<Provincia> provinciasCargadas = dao2.ReadList();
//
//        for (Alianza a:alianzasCargadas) {
//            System.out.println(a.getNombreAlianza());
//        }
//        if(dao.BuscarPorNombre("test") != null){
//            System.out.println("Encontre el string en el txt!");
//        }
//        if(dao.BuscarPorNombre("No existo xd") == null){
//            System.out.println("No encontre el string en el txt");
//        }
//
//        for(Provincia p:provinciasCargadas){
//            System.out.println(p.getNombreProvincia());
//        }

        if (ConexionSQLServer.ConnectToSqlDatabase() != null){
            PaisDAO dao = FactoryPais.GetImplementacion();
            List<Pais> paises = dao.listadodePaises();
            for (Pais p: paises) {
                System.out.println(p.toString());
            }
        }

    }


}
