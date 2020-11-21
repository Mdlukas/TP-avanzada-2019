package edu.usal.vista.consola;

import java.util.Scanner;

import edu.usal.controlador.consola.ControladorAerolinea;
import edu.usal.controlador.consola.ControladorAeropuerto;
import edu.usal.controlador.consola.ControladorCliente;
import edu.usal.controlador.consola.ControladorDireccion;
import edu.usal.controlador.consola.ControladorPais;
import edu.usal.controlador.consola.ControladorPasajero;
//import edu.usal.controlador.consola.ControladorPasaporte;
import edu.usal.controlador.consola.ControladorProvincia;
import edu.usal.controlador.consola.ControladorTelefono;
import edu.usal.controlador.consola.ControladorVenta;
import edu.usal.controlador.consola.ControladorVuelo;

public class VISTAGENERAL {


    public void MenuPrincipal() {

        System.out.println("CRUDs del TP ANUAL PGM AVANZADA ");
        System.out.println("\n");
        int n;
        @SuppressWarnings("resource")
        Scanner leer = new Scanner(System.in);

        do {
//	System.out.println("Eliga Una de las siguientes OPCIONES"
//			+ "\n 1- para Dirigirse al Crud de Paises"
//			+ "\n 2- para dirigirse al de Provincia "
//			+ "\n 3- para el de Aeropuertos "
//			+ "\n 4- para el de Clientes"
//			+ "\n 5- para el de Aerolineas"
//			+ "\n 6- para el de Pasaporte"
//			+ "\n 7- para el de Telefono"
//			+ "\n 8- para el de Venta"
//			+ "\n 9- para el de Vuelo"
//			+ "\n 10- para el de Direccion"
//			+ "\n 11- para el de Pasajero ");
            System.out.println("Eliga una de las siguientes OPCIONES: "
                    + "\n 4 - para el CRUD de Clientes."
                    + "\n 12 - Salir");

            n = leer.nextInt();

        } while (n < 1 || n > 12);


        switch (n) {
            case 1:
                VistaPais vistaPais = new VistaPais();
                ControladorPais controladorPais = null;
                controladorPais = new ControladorPais(vistaPais);
                controladorPais.MostrarMenuPais();
                break;

            case 2:
                VistaProvincia vistaProvincia = new VistaProvincia();
                ControladorProvincia controladorProvincia = null;
                controladorProvincia = new ControladorProvincia(vistaProvincia);
                controladorProvincia.MostrarMenuProvincia();
                break;

            case 3:
                VistaAeropuerto vistaAeropuerto = new VistaAeropuerto();   //Problema
                ControladorAeropuerto controladorAeropuerto = null;
                controladorAeropuerto = new ControladorAeropuerto(vistaAeropuerto);
                controladorAeropuerto.MostrarMenuAeropuerto();
                break;

            case 4:
                VistaCliente vistaCliente = new VistaCliente();
                ControladorCliente controladorCliente = null;
                controladorCliente = new ControladorCliente(vistaCliente);
                controladorCliente.MiMenuCliente();
                break;

            case 5:
                VistaAerolinea vistaAerolinea = new VistaAerolinea();
                ControladorAerolinea controladorAerolinea = null;
                controladorAerolinea = new ControladorAerolinea(vistaAerolinea);
                controladorAerolinea.MostrarMenuAerolinea();
                break;


//            case 6:
////                VistaPasaporte vistaPasaporte = new VistaPasaporte();
//                ControladorPasaporte controladorPasaporte = null;
//                controladorPasaporte = new ControladorPasaporte(vistaPasaporte);
//                controladorPasaporte.MostrarMenuPasaporte();
//                break;

            case 7:
                VistaTelefono vistaTelefono = new VistaTelefono();
                ControladorTelefono controladorTelefono = null;
                controladorTelefono = new ControladorTelefono(vistaTelefono);
                controladorTelefono.MostrarMenuTelefono();
                break;

            case 8:
                VistaVenta vistaVenta = new VistaVenta();
                ControladorVenta controladorVenta = null;
                controladorVenta = new ControladorVenta(vistaVenta);
                controladorVenta.MostrarMenuVenta();
                break;

            case 9:
                VistaVuelo vistaVuelo = new VistaVuelo();
                ControladorVuelo controladorVuelo = null;
                controladorVuelo = new ControladorVuelo(vistaVuelo);
                controladorVuelo.MostrarMenuVuelo();
                break;

            case 10:
                VistaDireccion vistaDireccion = new VistaDireccion();
                ControladorDireccion controladorDireccion = null;
                controladorDireccion = new ControladorDireccion(vistaDireccion);
                controladorDireccion.MostrarMenuDireccion();
                break;

            case 11:
                VistaPasajero vistaPasajero = new VistaPasajero();
                ControladorPasajero controladorPasajero = null;
                controladorPasajero = new ControladorPasajero(vistaPasajero);
                controladorPasajero.MostrarMenuPasajero();
                break;

            case 12:
                System.out.println("Gracias por usar el Improvisado por consola!");
                n = 13;
                break;

        }


    }

}
