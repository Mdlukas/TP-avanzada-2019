package edu.usal.vista.consola;

import java.util.List;

import edu.usal.dao.negocio.Cliente;
import edu.usal.dao.negocio.Pasajero;
import edu.usal.dao.negocio.Pasaporte;
import edu.usal.dao.negocio.Telefono;
import edu.usal.util.IOGeneral;

public class VistaCliente {


    public int menu() {
        System.out.println("\n"+"1- Alta de Cliente");
        System.out.println("2- Baja de Cliente");
        System.out.println("3- Modificacion de Cliente ");
        System.out.println("4- Consulta de Cliente");
        System.out.println("5- Listado de Cliente");
        System.out.println("6- salir");
        return IOGeneral.leerInt("ingrese una opcion ", "solo nros.");
    }


    public Cliente AltaCliente() {
        Cliente cliente = new Cliente();

        Telefono telefono = new Telefono();
        Pasaporte pasaporte = new Pasaporte();
        Pasajero pasajero = new Pasajero();

        cliente.setTelefono(telefono);
        cliente.setPasaporte(pasaporte);
        cliente.setNrodepasajero(pasajero);


        cliente.setIDCliente(IOGeneral.leerInt("Ingrese ID : ", "Eso no es un int!"));
        cliente.setNombreCliente(IOGeneral.leerLinea("Ingrese Nombre : "));
        cliente.setApellidoCliente(IOGeneral.leerLinea("Ingrese Apellido : "));
        cliente.setRS(IOGeneral.leerFrase("Ingrese RS: "));
        cliente.setDni(IOGeneral.leerFrase("Ingrese DNI: "));
        System.out.println("No te preocupes, no asignamos fecha desde este CRUD!");
//		cliente.setFechaNacimiento(IOGeneral.leerFrase("Ingrese Fecha Nacimiento: "));
        cliente.setMail("Ingrese Mail: ");


        return cliente;

    }


    public void ListadodeClientes(List<Cliente> listado) {
        System.out.println("Listado:");
        System.out.println("------------------------------------------------------------------------------------------");
        for (Cliente cliente : listado) {
            this.imprimirConsultadeClientes(cliente);
        }
    }


    public Cliente BajadeCliente() {
        Cliente cliente = new Cliente();
        cliente.setIDCliente(IOGeneral.leerInt("Ingrese ID para realizar la Baja", "Eso no es un int!"));
        return cliente;
    }


    public Cliente ModificaciondeCliente() {
        Cliente cliente = new Cliente();

        Telefono telefono = new Telefono();
        Pasaporte pasaporte = new Pasaporte();
        Pasajero pasajero = new Pasajero();

        cliente.setTelefono(telefono);
        cliente.setPasaporte(pasaporte);
        cliente.setNrodepasajero(pasajero);


        System.out.println("Ingrese los nuevos datos a Modificar! ");

        cliente.setIDCliente(IOGeneral.leerInt("Ingrese ID : ", "Eso no es un id valido!"));
        cliente.setNombreCliente(IOGeneral.leerLinea("Ingrese Nombre : "));
        cliente.setApellidoCliente(IOGeneral.leerLinea("Ingrese Apellido : "));
        cliente.setRS(IOGeneral.leerFrase("Ingrese RS: "));
        cliente.setDni(IOGeneral.leerFrase("Ingrese DNI: "));
//		cliente.setFechaNacimiento(IOGeneral.leerFrase("Ingrese Fecha Nacimiento: "));
        cliente.setMail("Ingrese Mail: ");

        return cliente;
    }


    public Cliente ConsultadeCliente() {
        System.out.println("Cliente por ID: " + "\n");
        Cliente cliente = new Cliente();
        cliente.setIDCliente(IOGeneral.leerInt("Ingrese ID : ", "Eso no es un id valido!"));
        return cliente;
    }

    public void imprimirConsultadeClientes(Cliente cliente){
        if(cliente != null){
            System.out.println("Cliente: ");
            System.out.println("IDCliente: " + cliente.getIDCliente());
            System.out.println("Nombre : " + cliente.getNombreCliente());
            System.out.println("Apellido: " + cliente.getApellidoCliente());
            System.out.println("RS:" + cliente.getRS());
            System.out.println("DNI: " + cliente.getDni());
            System.out.println("Fecha Nacimiento: " + cliente.getFechaNacimiento());
            System.out.println("Mail: " + cliente.getMail());
            System.out.println("-------------------------------------------------------------------------------------");
        } else {
            System.out.println("Ese cliente no existe!");
        }
    }


}
