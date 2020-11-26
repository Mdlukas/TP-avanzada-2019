package edu.usal.vista.consola;

import edu.usal.controlador.consola.*;

import java.util.Scanner;


public class VISTAGENERAL {


    public void MenuPrincipal() {

        System.out.println("CRUDs del TP ANUAL PROGRAMACION AVANZADA ");
        System.out.println("\n");
        int n;
        @SuppressWarnings("resource")
        Scanner leer = new Scanner(System.in);

        do {
            System.out.println("Eliga una de las siguientes OPCIONES: "
                    + "\n 1- CRUD de Clientes."
                    + "\n 2- CRUD de Vuelos."
                    + "\n 3- CRUD de Aerolineas."
                    + "\n 4- CRUD de Ventas."
                    + "\n 5- Implementacion Files."
                    + "\n 6- Salir");

            n = leer.nextInt();

        } while (n < 1 || n > 5);


        switch (n) {
            case 1:
                VistaCliente vistaCliente = new VistaCliente();
                ControladorCliente controladorCliente = null;
                controladorCliente = new ControladorCliente(vistaCliente);
                controladorCliente.MiMenuCliente();
                break;

            case 2:
                VistaVuelo vistaVuelo = new VistaVuelo();
                ControladorVuelo controladorVuelo = null;
                controladorVuelo = new ControladorVuelo(vistaVuelo);
                controladorVuelo.MostrarMenuVuelo();
                break;

            case 3:
                VistaAerolinea vistaAerolinea = new VistaAerolinea();
                ControladorAerolinea controladorAerolinea = null;
                controladorAerolinea = new ControladorAerolinea(vistaAerolinea);
                controladorAerolinea.MostrarMenuAerolinea();
                break;

            case 4:
                VistaVenta vistaVenta = new VistaVenta();
                ControladorVenta controladorVenta = null;
                controladorVenta = new ControladorVenta(vistaVenta);
                controladorVenta.MostrarMenuVenta();
                break;
            case 5:
                VistaAlianzayProvincia vistaAlianzayProvincia = new VistaAlianzayProvincia();
                ControladorAlianzayProvincia controladorAlianzayProvincia = new ControladorAlianzayProvincia(vistaAlianzayProvincia);
                controladorAlianzayProvincia.MostrarMenuFile();
                break;
            case 6:
                System.out.println("Gracias por usar el Improvisado por consola!");
                n = 7;
                break;

        }


    }

}
