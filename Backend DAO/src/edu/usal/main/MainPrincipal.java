package edu.usal.main;

import edu.usal.dao.factory.FactoryAlianza;
import edu.usal.dao.factory.FactoryProvincia;
import edu.usal.dao.interfaces.AlianzaDAO;
import edu.usal.dao.interfaces.ProvinciaDAO;
import edu.usal.domain.Alianza;
import edu.usal.domain.Provincia;

import java.util.ArrayList;

public class MainPrincipal {


    public static void main(String[] args) {

        System.out.println("--------------------- Este es un test de files!");
        AlianzaDAO dao = FactoryAlianza.GetAlianzaImplementacion("FILE");
        ProvinciaDAO dao2 = FactoryProvincia.GetProvinciaImplementacion("FILE");

        ArrayList<Alianza> alianzasCargadas = dao.ReadList();
        ArrayList<Provincia> provinciasCargadas = dao2.ReadList();

        for (Alianza a:alianzasCargadas) {
            System.out.println(a.getNombreAlianza());
        }
        if(dao.BuscarPorNombre("test") != null){
            System.out.println("Encontre el string en el txt!");
        }
        if(dao.BuscarPorNombre("No existo xd") == null){
            System.out.println("No encontre el string en el txt");
        }

        for(Provincia p:provinciasCargadas){
            System.out.println(p.getNombreProvincia());
        }


    }


}
