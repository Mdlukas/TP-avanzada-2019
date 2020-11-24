package edu.usal.vista.consola;

import edu.usal.domain.Aerolinea;
import edu.usal.util.IOGeneral;
import org.hibernate.dialect.pagination.AbstractLimitHandler;

import java.util.List;

public class VistaAerolinea {


    public int menu() {
        System.out.println("CRUD DE Aerolinea!");

        System.out.println("1- Alta");
        System.out.println("2- Baja");
        System.out.println("3- Modificacion");
        System.out.println("4- Consulta");
        System.out.println("5- Listado");
        System.out.println("6- salir");
        return IOGeneral.leerInt("ingrese una opcion ", "solo nros.");

    }

    public Aerolinea AltadeAerolinea() {
        Aerolinea aerolinea = new Aerolinea();


//		aerolinea.setIDAerolinea(IOGeneral.leerFrase("Ingrese IDAerolinea: "));
        aerolinea.setNombreAereoLinea(IOGeneral.leerFrase("Ingrese Nombre Aerolinea"));
        aerolinea.setAlianza(IOGeneral.leerFrase("Ingrese el tipo de Alianza: "));

        return aerolinea;

    }

    public Aerolinea ModificaciondeAerolinea() {
        Aerolinea aerolinea = new Aerolinea();

//		aerolinea.setIDAerolinea(IOGeneral.leerFrase("Ingrese IDAerolinea: "));

        aerolinea.setIDAerolinea(IOGeneral.leerInt("Ingrese IDAerolinea a Modificar: ", "El id tiene que ser un numero!"));
        aerolinea.setNombreAereoLinea(IOGeneral.leerFrase("Ingrese Nombre Aerolinea a Modificar"));
        aerolinea.setAlianza(IOGeneral.leerFrase("Ingrese el tipo de Alianza: "));

        return aerolinea;


    }


    public Aerolinea BajadeAerolinea() {
        System.out.println("Baja de Aerolinea por ID: " + "\n");
        Aerolinea aerolinea = new Aerolinea();
        aerolinea.setIDAerolinea(IOGeneral.leerInt("Ingresa ID: para Realizar la Baja.", "El id tiene que ser un numero!"));
        return aerolinea;
    }

    public void ListadodeAerolinea(List<Aerolinea> listado) {
        System.out.println(" =-= Mostrando todas las Aerolineas cargadas!:  =-=" + "\n");
        for (Aerolinea aerolinea : listado) {
            this.imprimirAerolinea(aerolinea);
        }
    }


    public Aerolinea ConsultadeAerolinea() {
        System.out.println("Cliente por ID: " + "\n");
        Aerolinea aerolinea = new Aerolinea();

        aerolinea.setIDAerolinea(IOGeneral.leerInt("Ingresa IDAerolinea: ", "El id tiene que ser un numero!"));

        return aerolinea;

    }

    public void imprimirAerolinea(Aerolinea aerolinea) {
        System.out.println("Aerolinea: " + "\n");
        System.out.println("IDAerolinea: " + aerolinea.getIDAerolinea());
        System.out.println("Nombre Aerolinea: " + aerolinea.getNombreAereoLinea());
        System.out.println("Alianza: "+aerolinea.getAlianza());
        System.out.println("\n" + "-------------------------------------------------------------------------------------");
    }

}
