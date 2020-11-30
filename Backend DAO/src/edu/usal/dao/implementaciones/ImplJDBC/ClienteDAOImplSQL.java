package edu.usal.dao.implementaciones.ImplJDBC;

import java.util.ArrayList;
import java.util.List;

import edu.usal.dao.interfaces.ClienteDAO;
import edu.usal.domain.Cliente;
import edu.usal.domain.Telefono;
import edu.usal.util.ConexionSQLServer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ClienteDAOImplSQL implements ClienteDAO {

    //Genero entidad manager basado en la persistencia.
    EntityManager entityManager = ConexionSQLServer.entityManagerFactory.createEntityManager();


    @Override
    public Cliente ConsultadeCliente(Cliente IDCliente) {
        this.entityManager.getTransaction().begin();
        //Busco el cliente que estoy tratando de encontrar...
        Cliente ClienteEncontrado = this.entityManager.find(Cliente.class, IDCliente.getIDCliente());
        //Realizo commit!
        try {
            this.entityManager.getTransaction().commit();
            return ClienteEncontrado;
        } catch (Exception e) {
            System.out.println("No se pudo encontrar el cliente con el ID: " + IDCliente.getIDCliente());
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Cliente> leerTodoCliente() {
        //Comienzo la transaccion!
        this.entityManager.getTransaction().begin();
        //Native query para hacer un SELECT *
        List<Cliente> clientesDB = this.entityManager.createQuery("SELECT NEW  Cliente (c.IDCliente,c.mail,c.NombreCliente,c.ApellidoCliente,c.dni) FROM Cliente c").getResultList();
        //Realizo commit!
        try{
            this.entityManager.getTransaction().commit();
            return clientesDB;
        } catch (Exception e){
            System.out.println("No pude retornar los clientes!");
            this.entityManager.getTransaction().rollback();
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean AltaCliente(Cliente alta) {
        //Comienzo la transaccion.
        this.entityManager.getTransaction().begin();
        try {
            this.entityManager.persist(alta);
            //Realizo commit!
            this.entityManager.getTransaction().commit();
            System.out.println("Se guardo el cliente de forma correcta!");
            return true;
        } catch (Exception e) {
            this.entityManager.getTransaction().rollback();
            e.printStackTrace();
            System.out.println("No pude guardar nada hermano!");
            return false;
        }
    }

    //Guardo cliente Actualizado!
    @Override
    public boolean ModCliente(Cliente modificar) {
        //Comienzo la transaccion.
        this.entityManager.getTransaction().begin();
        try {
            //Utilizo la live transaction  para hacer el modificacion
            Cliente enBaseDeDatos = this.entityManager.find(Cliente.class, modificar.getIDCliente());
            //Datos base del cliente
            enBaseDeDatos.setApellidoCliente(modificar.getApellidoCliente());
            enBaseDeDatos.setNombreCliente(modificar.getNombreCliente());
            enBaseDeDatos.setDni(modificar.getDni());
            enBaseDeDatos.setRS(modificar.getRS());
            enBaseDeDatos.setMail(modificar.getMail());
            enBaseDeDatos.setFechaNacimiento(modificar.getFechaNacimiento());
            //Varios objetos.
            enBaseDeDatos.setPasajeroFrecuente(modificar.getPasajeroFrecuente());
            enBaseDeDatos.setDireccion(modificar.getDireccion());
            enBaseDeDatos.setPasaporte(modificar.getPasaporte());
            enBaseDeDatos.setTelefono(modificar.getTelefono());
            //Realizo commit!
            this.entityManager.getTransaction().commit();
            System.out.println("Se guardo actualizo el cliente " + modificar.getIDCliente() + "  de forma correcta!");
            return true;
        } catch (Exception e) {
            this.entityManager.getTransaction().rollback();
            e.printStackTrace();
            System.out.println("No pude guardar nada hermano!");
            return false;
        }
    }

    @Override
    public boolean BajaCliente(Cliente baja) {
        //Comienzo la transaccion.
        this.entityManager.getTransaction().begin();
        Cliente ClienteEncontrado = entityManager.find(Cliente.class, baja.getIDCliente());
        try {
            //Borro el cliente!
            this.entityManager.remove(ClienteEncontrado);
            //Realizo commit!
            this.entityManager.getTransaction().commit();
            System.out.println("Borre el cliente: " + baja.getIDCliente() + " sin problemas!");
            return true;
        } catch (Exception e) {
            //Realizo un rollback si no se pudo borrar el cliente.
            this.entityManager.getTransaction().rollback();
            e.printStackTrace();
            System.out.println("No se pudo borrar el cliente con el ID: " + baja.getIDCliente());
            return false;
        }
    }


}
