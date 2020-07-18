package edu.usal.vista.consola;

import java.util.Scanner;

import edu.usal.controlador.consola.ControladorAerolinea;
import edu.usal.controlador.consola.ControladorAeropuerto;
import edu.usal.controlador.consola.ControladorCliente;
import edu.usal.controlador.consola.ControladorDireccion;
import edu.usal.controlador.consola.ControladorPais;
import edu.usal.controlador.consola.ControladorPasajero;
import edu.usal.controlador.consola.ControladorPasaporte;
import edu.usal.controlador.consola.ControladorProvincia;
import edu.usal.controlador.consola.ControladorTelefono;
import edu.usal.controlador.consola.ControladorVenta;
import edu.usal.controlador.consola.ControladorVuelo;

public class VISTAGENERAL {


	public void MenuPrincipal()
	{
	 
	System.out.println("CRUDs del TP ANUAL PGM AVANZADA ");
	System.out.println("\n");
	int n;
	@SuppressWarnings("resource")
	Scanner leer = new Scanner(System.in);
	
	do {
	System.out.println("Eliga Una de las siguientes OPCIONES (1- para Dirigirse al Crud de Paises) "
			+ "(2- para dirigirse al de Provincia)"
			+ " (3- para el de Aeropuertos)"
			+ " 4- para el de Clientes"
			+ " 5- para el de Aerolineas"
+ " 6- para el de Pasaporte"
+ " 7- para el de Telefono"
+ " 8- para el de Venta"
+ " 9- para el de Vuelo"	
+ " 10- para el de Direccion"	
+ " 11- para el de Pasajero ");
	
	n = leer.nextInt();
	
	} while (n <1 || n>11);
	

	switch (n)
	{
	case 1 : 
	
	VistaPais vistaPais = new VistaPais();
	ControladorPais controladorPais = null;
	
	controladorPais = new ControladorPais(vistaPais);
	controladorPais.MostrarMenuPais();
		
		
		break;

	case 2 :	

		VistaProvincia vistaProvincia = new VistaProvincia();
		ControladorProvincia controladorProvincia = null;
		
		controladorProvincia = new ControladorProvincia(vistaProvincia);
		controladorProvincia.MostrarMenuProvincia();
			
		break;
		
		
		
	case 3 :	

		VistaAeropuerto vistaAeropuerto = new VistaAeropuerto();   //Problema
		ControladorAeropuerto controladorAeropuerto = null;
		
		controladorAeropuerto = new ControladorAeropuerto(vistaAeropuerto);
		controladorAeropuerto.MostrarMenuAeropuerto();
			
		break;
		
		
	case 4 : 
		
		VistaCliente vistaCliente = new VistaCliente();
		ControladorCliente controladorCliente = null;
		
		controladorCliente = new ControladorCliente (vistaCliente);
		controladorCliente.MiMenuCliente();
		
		
		break;
		
		
		
	case 5:		
		
	VistaAerolinea vistaAerolinea = new VistaAerolinea();
	ControladorAerolinea controladorAerolinea = null;
	
	controladorAerolinea = new ControladorAerolinea (vistaAerolinea);
	controladorAerolinea.MostrarMenuAerolinea();
	
		
		
	break;
		
		
	case 6 :
		
		VistaPasaporte vistaPasaporte = new VistaPasaporte();
		ControladorPasaporte controladorPasaporte = null;
		
		controladorPasaporte = new ControladorPasaporte (vistaPasaporte);
		controladorPasaporte.MostrarMenuPasaporte();
		
		
		break;
		
		
	case 7:	
		

		VistaTelefono vistaTelefono = new VistaTelefono();
		ControladorTelefono controladorTelefono = null;
		
		controladorTelefono = new ControladorTelefono (vistaTelefono);
		controladorTelefono.MostrarMenuTelefono();
		
		break;
		
		
		
	case 8: 
		

		VistaVenta vistaVenta = new VistaVenta();
		ControladorVenta controladorVenta = null;
		
		controladorVenta = new ControladorVenta (vistaVenta);
		controladorVenta.MostrarMenuVenta();
		
		
		break;
		
		
		
		
	case 9: 
		

		VistaVuelo vistaVuelo = new VistaVuelo();
		ControladorVuelo controladorVuelo = null;
		
		controladorVuelo = new ControladorVuelo (vistaVuelo);
		controladorVuelo.MostrarMenuVuelo();
		
		break;
		
	case 10: 
		
		
		

		VistaDireccion vistaDireccion = new VistaDireccion();
		ControladorDireccion controladorDireccion = null;
		
		controladorDireccion = new ControladorDireccion (vistaDireccion);
		controladorDireccion.MostrarMenuDireccion();
		
		
		
		break;
		
		
		
	case 11:
		
		
		VistaPasajero vistaPasajero = new VistaPasajero();
		ControladorPasajero controladorPasajero = null;
		
		controladorPasajero = new ControladorPasajero (vistaPasajero);
		controladorPasajero.MostrarMenuPasajero();
		
		
		
		break;
		
		
		}

	
	
	}
	
}
