package edu.usal.vista.consola;

import edu.usal.domain.Aerolinea;
import edu.usal.domain.Cliente;
import edu.usal.domain.TipoPago;
import edu.usal.domain.Venta;
import edu.usal.util.IOGeneral;

import java.util.List;

public class VistaVenta {


    public int menu() {
        System.out.println("CRUD DE Venta!");

        System.out.println("1- Alta");
        System.out.println("2- Baja");
        System.out.println("3- Modificacion");
        System.out.println("4- Consulta");
        System.out.println("5- Listado");
        System.out.println("6- salir");
        return IOGeneral.leerInt("ingrese una opcion ", "solo nros.");

    }

    public Venta AltadeVenta() {
        Venta venta = new Venta();
        Cliente cliente = new Cliente();
        Aerolinea aerolinea = new Aerolinea();

        venta.setCliente(cliente);
        venta.setAerolinea(aerolinea);


        //TODO implementar fecha con datepicker a la hora de settear este Date!

//      venta.setFecha_HS_Venta("Ingrese Fecha HS Venta: ");

        venta.setFormadePago(TipoPago.getPago(IOGeneral.leerFrase("Ingrese tipo de Pago (Tarjeta de Credito , Tarjeta de Debito , Efectivo)")));

        return venta;

    }

    public Venta ModificaciondeVenta() {

        Venta venta = new Venta();
        Cliente cliente = new Cliente();
        Aerolinea aerolinea = new Aerolinea();

        venta.setCliente(cliente);
        venta.setAerolinea(aerolinea);

        System.out.print("Ingrese Datos a modificar: ");

        //TODO datepicker venta...

//        venta.setFecha_HS_Venta("Ingrese Fecha HS Venta: ");

        venta.setFormadePago(TipoPago.getPago(IOGeneral.leerFrase("Ingrese tipo de Pago (Tarjeta de Credito , Tarjeta de Debito , Efectivo)")));


//		venta.getCliente().setIDCliente(IOGeneral.leerFrase("Ingrese IDCliente: "));
//		venta.getAerolinea().setIDAerolinea(IOGeneral.leerFrase("Ingrese IDAerolinea: "));

        return venta;

    }


    public Venta BajadeVenta() {
        System.out.println("Baja de Venta por ID: " + "\n");
        Venta venta = new Venta();

        venta.setIDVenta(IOGeneral.leerInt("Ingresa ID: para Realizar la Baja", "Error, tiene que ser un numero!"));

        return venta;

    }

    public void ListadodeVenta(List<Venta> listado) {
        System.out.println("Mostrando " + "\n");

        for (Venta venta : listado) {
			this.imprimirVenta(venta);
        }

    }


    public Venta ConsultadeVenta() {
        System.out.println("Cliente por ID: " + "\n");
        Venta venta = new Venta();

        venta.setIDVenta(IOGeneral.leerInt("Ingresa IDVenta: ", "Error, tiene que ser un numero!"));

        return venta;

    }

    public void imprimirVenta(Venta venta)  //extra
    {
        System.out.println("Venta: " + "\n");


        System.out.println("IDVenta: " + venta.getIDVenta());
        System.out.println("Fecha HS Venta: " + venta.getFecha_HS_Venta());
        System.out.println("Forma de Pago: " + venta.getFormadePago());

        System.out.println("IDVuelo: " + venta.getVuelo().getIDVuelo());
        System.out.println("IDAerolinea: " + venta.getAerolinea().getIDAerolinea());

    }


}
