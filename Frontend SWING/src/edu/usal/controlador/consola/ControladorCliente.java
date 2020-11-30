package edu.usal.controlador.consola;

import edu.usal.dao.factory.FactoryCliente;
import edu.usal.dao.factory.FactoryPais;
import edu.usal.dao.factory.FactoryProvincia;
import edu.usal.dao.interfaces.ClienteDAO;
import edu.usal.dao.interfaces.PaisDAO;
import edu.usal.dao.interfaces.ProvinciaDAO;
import edu.usal.domain.Cliente;
import edu.usal.domain.Pais;
import edu.usal.domain.Provincia;
import edu.usal.vista.consola.VistaCliente;

import java.io.IOException;
import java.util.List;


public class ControladorCliente {

    private final VistaCliente vistaConsola;
    private PaisDAO pais;
    private ClienteDAO cliente;
    private ProvinciaDAO provincia;


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
            this.pais = FactoryPais.GetImplementacion();
            this.provincia = FactoryProvincia.GetProvinciaImplementacion();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean AltaCliente(Cliente alta) {
        try {
            return this.cliente.AltaCliente(alta);
        } catch (ClassNotFoundException | IOException classNotFoundException) {
            classNotFoundException.printStackTrace();
            return false;
        }
    }

    public boolean BajadeCliente(Cliente baja) {
        try {
            return this.cliente.BajaCliente(baja);
        } catch (ClassNotFoundException | IOException classNotFoundException) {
            classNotFoundException.printStackTrace();
            return false;
        }
    }

    public boolean ModificaciondeCliente(Cliente modificacion) {
        try {
             return this.cliente.ModCliente(modificacion);
        } catch (ClassNotFoundException | IOException classNotFoundException) {
            classNotFoundException.printStackTrace();
            return false;
        }
    }

    public Cliente ConsultadeCliente(Cliente consulta) {
        return this.cliente.ConsultadeCliente(consulta);
    }

    //Metodo para traer los paises desde la base de datos!
    public List<Pais> GetPaises() {
        try {
            List<Pais> paises = this.pais.listadodePaises();
            return paises;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    //Para los paises a la hora de gestionar un cliente!
    public List<Cliente> ListadodeClientes() {
        try {
            return this.cliente.leerTodoCliente();
        } catch (ClassNotFoundException | IOException classNotFoundException) {
            classNotFoundException.printStackTrace();
        }
        return null;
    }

    //Para las provincias a la hora de gestionar un cliente!
    public List<Provincia> GetProvincias() {
        try {
            return this.provincia.ReadList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
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
