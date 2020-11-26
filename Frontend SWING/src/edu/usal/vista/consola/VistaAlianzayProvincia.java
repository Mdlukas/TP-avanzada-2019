package edu.usal.vista.consola;

import edu.usal.domain.Alianza;
import edu.usal.domain.Provincia;
import edu.usal.util.IOGeneral;

import java.util.ArrayList;

public class VistaAlianzayProvincia {

    public void ImprimirAlianzas(ArrayList<Alianza> alianzasCargadas){
        System.out.println("------------------------ Estas son todas las Alianzas cargadas en el sistema ------------");
        for (Alianza a: alianzasCargadas) {
            System.out.println(a.getNombreAlianza());
        }
        System.out.println("-----------------------------------------------------------------------------------------");
    }

    public void ImprimirProvincias(ArrayList<Provincia> provinciasCargadas) {
        System.out.println("------------------------ Estas son todas las provincias Cargadas para la Argentina! -----");
        for (Provincia p: provinciasCargadas) {
            System.out.println(p.getNombreProvincia());
        }
        System.out.println("-----------------------------------------------------------------------------------------");
    }

    public int MostrarMenuFile() {
        System.out.println("\n" + "1- Mostrar Alianzas");
        System.out.println("2- Mostrar provincias");
        System.out.println("3- Salir");
        return IOGeneral.leerInt("ingrese una opcion ", "solo nros.");
    }
}
