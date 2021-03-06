package edu.usal.vista.consola;

import java.util.List;

import edu.usal.domain.Cliente;
import edu.usal.domain.Pasajero;
import edu.usal.domain.Pasaporte;
import edu.usal.domain.Telefono;
import edu.usal.util.IOGeneral;

public class VistaCliente {


    public int menu() {
        System.out.println("\n" + "1- Alta de Cliente");
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
        cliente.setPasajeroFrecuente(pasajero);


        //El ID es autogenerado, no hace alta settearlo :)
        cliente.setIDCliente(IOGeneral.leerInt("Ingrese ID : ", "Eso no es un int!"));
//        System.out.println("No te preocupes, nosotros asignaremos el ID correspondiente :)");
        cliente.setNombreCliente(IOGeneral.leerLinea("Ingrese Nombre : "));
        cliente.setApellidoCliente(IOGeneral.leerLinea("Ingrese Apellido : "));
        cliente.setRS(IOGeneral.leerFrase("Ingrese RS: "));
        cliente.setDni(IOGeneral.leerFrase("Ingrese DNI: "));
        System.out.println("No te preocupes, no asignamos fecha desde este CRUD!");
//		cliente.setFechaNacimiento(IOGeneral.leerFrase("Ingrese Fecha Nacimiento: "));
        cliente.setMail(IOGeneral.leerFrase("Ingrese Mail: "));


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
        cliente.setPasajeroFrecuente(pasajero);


        System.out.println("Ingrese los nuevos datos a Modificar! ");


        cliente.setIDCliente(IOGeneral.leerInt("Ingrese ID : ", "Eso no es un id valido!"));
        cliente.setNombreCliente(IOGeneral.leerLinea("Ingrese Nombre : "));
        cliente.setApellidoCliente(IOGeneral.leerLinea("Ingrese Apellido : "));
        cliente.setRS(IOGeneral.leerFrase("Ingrese RS: "));
        cliente.setDni(IOGeneral.leerFrase("Ingrese DNI: "));
//		cliente.setFechaNacimiento(IOGeneral.leerFrase("Ingrese Fecha Nacimiento: "));
        cliente.setMail(IOGeneral.leerFrase("Ingrese Mail: "));

        return cliente;
    }


    public Cliente ConsultadeCliente() {
        System.out.println("Cliente por ID: " + "\n");
        Cliente cliente = new Cliente();
        cliente.setIDCliente(IOGeneral.leerInt("Ingrese ID : ", "Eso no es un id valido!"));
        return cliente;
    }

    public void imprimirConsultadeClientes(Cliente cliente) {
        if (cliente != null) {
            System.out.println("Cliente: ");
            System.out.println("IDCliente: " + cliente.getIDCliente());
            System.out.println("Nombre : " + cliente.getNombreCliente());
            System.out.println("Apellido: " + cliente.getApellidoCliente());
            System.out.println("RS:" + cliente.getRS());
            System.out.println("DNI: " + cliente.getDni());
            System.out.println("Fecha Nacimiento: " + cliente.getFechaNacimiento());
            System.out.println("Mail: " + cliente.getMail());
            System.out.println("---- Telefono! ----");
            if (cliente.getTelefono() != null) {
                System.out.println(cliente.getTelefono().toString());
            } else {
                System.out.println("No tiene datos de telefono!");
            }
            System.out.println("-------------------------------------------------------------------------------------");
            System.out.println("---- Pasaporte! ----");
            if (cliente.getPasaporte() != null) {
                System.out.println(cliente.getPasaporte().toString());
            } else {
                System.out.println("No tiene datos de Pasaporte!");
            }
            System.out.println("-------------------------------------------------------------------------------------");
            System.out.println("---- Pasajero Frecuente! ----");
            if (cliente.getPasajeroFrecuente() != null) {
                System.out.println(cliente.getPasajeroFrecuente().toString());
            } else {
                System.out.println("No tiene datos de Pasajero Frecuente!");
            }
            System.out.println("-------------------------------------------------------------------------------------");
            System.out.println("---- Direccion! ----");
            if (cliente.getDireccion() != null) {
                System.out.println(cliente.getDireccion().toString());
            } else {
                System.out.println("No tiene datos de Direccion!");
            }
            System.out.println("-------------------------------------------------------------------------------------");
        } else {
            System.out.println("Ese cliente no existe!");
        }
    }


}
