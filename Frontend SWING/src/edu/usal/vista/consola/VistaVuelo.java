package edu.usal.vista.consola;

import edu.usal.domain.Vuelo;
import edu.usal.util.IOGeneral;

import java.util.List;

public class VistaVuelo {


    public int menu() {
        System.out.println("CRUD DE Vuelo!");
        System.out.println("1- Alta");
        System.out.println("2- Baja");
        System.out.println("3- Modificacion");
        System.out.println("4- Consulta");
        System.out.println("5- Listado");
        System.out.println("6- salir");
        return IOGeneral.leerInt("Ingrese una opcion ", "solo nros.");
    }

    public Vuelo AltadeVuelo() {
        Vuelo vuelo = new Vuelo();
        vuelo.setCantAsientos(IOGeneral.leerInt("Ingrese cantidad de Asientos: ", "El numero de asientos tiene que ser un.. numero."));
        //TODO implementar date-picker cuando se realize la interfaz del swingo.
        //vuelo.setFechaSalida(IOGeneral.leerFrase("Ingrese Fecha Salida: "));
        //vuelo.setFechaLLegada(IOGeneral.leerFrase("Ingrese Fecha LLegada: "));
        vuelo.setTiempovuelo(IOGeneral.leerFrase("Ingrese Tiempo de Vuelo: "));
//        vuelo.getAeropuertodeSalida().setIDAeropuerto(IOGeneral.leerInt("Ingrese IDAeripuerto de Salida", "debe ser Int"));
//        vuelo.getAeropuertodeLLegada().setIDAeropuerto(IOGeneral.leerInt("Ingrese IDAeropuerto de LLegada", "debe ser INT"));
        //vuelo.getAerolinea().setIDAerolinea(IOGeneral.leerFrase("Ingrese IDAerolinea: "));
        return vuelo;
    }

    public Vuelo ModificaciondeVuelo() {
        Vuelo vuelo = new Vuelo();
        System.out.println("Ingrese Datos a modificar: ");
        vuelo.setIDVuelo(IOGeneral.leerInt("Ingrese IDVuelo: ", "Error tiene que ser un numero."));
        vuelo.setCantAsientos(IOGeneral.leerInt("Ingrese cantidad de Asientos a modificar: ", "El numero de asientos tiene que ser un.. numero."));
        //TODO implementar date-picker cuando se realize la interfaz del swingo.
        //vuelo.setFechaSalida(IOGeneral.leerFrase("Ingrese Fecha Salida: "));
        //vuelo.setFechaLLegada(IOGeneral.leerFrase("Ingrese Fecha LLegada: "));
        vuelo.setTiempovuelo(IOGeneral.leerFrase("Ingrese Tiempo de Vuelo: "));
//        vuelo.getAeropuertodeSalida().setIDAeropuerto(IOGeneral.leerInt("Ingrese IDAeripuerto de Salida", "debe ser Int"));
//        vuelo.getAeropuertodeLLegada().setIDAeropuerto(IOGeneral.leerInt("Ingrese IDAeropuerto de LLegada", "debe ser INT"));
//        vuelo.getAerolinea().setIDAerolinea(IOGeneral.leerFrase("Ingrese IDAerolinea: "));
        return vuelo;
    }


    public Vuelo BajadeVuelo() {
        System.out.println("Baja de Vuelo por ID: " + "\n");
        Vuelo vuelo = new Vuelo();

        vuelo.setIDVuelo(IOGeneral.leerInt("Ingresa ID: para Realizar la Baja", "Error tiene que ser un numero!"));

        return vuelo;
    }

    public void ListadodeVuelo(List<Vuelo> listado) {
        System.out.println("Mostrando " + "\n");
        for (Vuelo vuelo : listado) {
            this.imprimirVuelo(vuelo);
        }
    }


    public Vuelo ConsultadeVuelo() {
        System.out.println("Cliente por ID: " + "\n");
        Vuelo Vuelo = new Vuelo();
        Vuelo.setIDVuelo(IOGeneral.leerInt("Ingresa IDVuelo: ", "Error tiene que ser un numero!"));
        return Vuelo;
    }

    public void imprimirVuelo(Vuelo vuelo) {
        System.out.println("IDVuelo: " + vuelo.getIDVuelo());
        System.out.println("Cantidad de Asientos: " + vuelo.getCantAsientos());
        System.out.println("Fecha de Salida: " + vuelo.getFechaSalida());
        System.out.println("Fecha de LLegada: " + vuelo.getFechaLLegada());
        System.out.println("Tiempo de Vuelo: " + vuelo.getTiempovuelo());
        if (vuelo.getAeropuertodeLLegada() != null) {
            System.out.println("IDAeropuerto Salida: " + vuelo.getAeropuertodeSalida().getCodigodeAeropuerto());
        }
        if (vuelo.getAeropuertodeSalida() != null) {
            System.out.println("IDAeropuerto LLegada: " + vuelo.getAeropuertodeLLegada().getCodigodeAeropuerto());
        } if (vuelo.getAerolinea() != null){
            System.out.println("IDAerolinea:" + vuelo.getAerolinea().getIDAerolinea());
        }
        System.out.println("\n" + "----------------------------------------------------------------------------------");
    }


}
