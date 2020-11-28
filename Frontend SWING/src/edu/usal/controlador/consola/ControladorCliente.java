package edu.usal.controlador.consola;

import edu.usal.dao.factory.FactoryCliente;
import edu.usal.dao.interfaces.ClienteDAO;
import edu.usal.domain.Cliente;
import edu.usal.vista.consola.VistaCliente;

import java.io.IOException;
import java.util.List;


public class ControladorCliente {

    private final VistaCliente vistaConsola;
    private ClienteDAO cliente;


    public ControladorCliente(VistaCliente vista) {
        this.vistaConsola = vista;
        try {
            this.cliente = FactoryCliente.GetImplementacion();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ControladorCliente() {
        this.vistaConsola = null;
        try {
            this.cliente = FactoryCliente.GetImplementacion();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void AltaCliente(Cliente alta) {
        try {
            this.cliente.AltaCliente(alta);
        } catch (ClassNotFoundException | IOException classNotFoundException) {
            classNotFoundException.printStackTrace();
        }
    }

    public void BajadeCliente(Cliente baja) {
        try {
            this.cliente.BajaCliente(baja);
        } catch (ClassNotFoundException | IOException classNotFoundException) {
            classNotFoundException.printStackTrace();
        }
    }

    public void ModificaciondeCliente(Cliente modificacion){
        try {
            this.cliente.ModCliente(modificacion);
        } catch (ClassNotFoundException | IOException classNotFoundException) {
            classNotFoundException.printStackTrace();
        }
    }

    public Cliente ConsultadeCliente(Cliente consulta) {
        return this.cliente.ConsultadeCliente(consulta);
    }

    public List<Cliente> ListadodeClientes(){
        try{
        List<Cliente> clientesEncontrados = this.cliente.leerTodoCliente();
        return clientesEncontrados;
        } catch (ClassNotFoundException | IOException classNotFoundException){
            classNotFoundException.printStackTrace();
        }
        return null;
    }

    //Este menu solamente se utiliza para la implementacion de los CRUDS por consola. En la implementacion por swing,
    //cada pantalla llama de forma directa a cada uno de los metodos de los controladores.
    public void MiMenuCliente() {
        int opcion = vistaConsola.menu();
        switch (opcion) {
            case 1:
                this.AltaCliente(this.vistaConsola.AltaCliente());
                this.MiMenuCliente();
                break;
            case 2:
                this.BajadeCliente(this.vistaConsola.BajadeCliente());
                this.MiMenuCliente();
            case 3:
                this.ModificaciondeCliente(this.vistaConsola.ModificaciondeCliente());
                this.MiMenuCliente();
                break;
            case 4:
                this.vistaConsola.imprimirConsultadeClientes(this.ConsultadeCliente(this.vistaConsola.ConsultadeCliente()));
                this.MiMenuCliente();
                break;
            case 5:
                this.vistaConsola.ListadodeClientes(this.ListadodeClientes());
                this.MiMenuCliente();
                break;
            case 6:
                System.out.println("Ejecucion Finalizada");
                break;
        }
    }
}
