package edu.usal.implementaciones.ImplJDBC;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import edu.usal.dao.interfaces.ClienteDAO;
import edu.usal.dao.negocio.Cliente;
import edu.usal.util.ConexionSQLServer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ClienteDAOImplSQL implements ClienteDAO {

    @Override
    public Cliente ConsultadeCliente(Cliente IDCliente) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PersistenciaAerolineas");

        //Comienzo la transaccion.
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        Cliente ClienteEncontrado = entityManager.find(Cliente.class, IDCliente.getIDCliente());
        //Realizo commit!
        try {
            entityManager.getTransaction().commit();
            entityManagerFactory.close();
            return ClienteEncontrado;
        } catch (Exception e) {
            System.out.println("No se pudo encontrar el cliente con el ID: " + IDCliente.getIDCliente());
            entityManagerFactory.close();
            return null;
        }
    }

    @Override
    public List<Cliente> leerTodoCliente() throws IOException, ClassNotFoundException {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PersistenciaAerolineas");

        //Comienzo la transaccion.
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        //Native query para hacer un SELECT *
        List<Cliente> clientes = entityManager.createQuery("SELECT c FROM Cliente c").getResultList();
        //Realizo commit!
        entityManager.getTransaction().commit();

        entityManagerFactory.close();
        //Retorno clientes.
        return clientes;

    }

    @Override
    public void AltaCliente(Cliente alta) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PersistenciaAerolineas");

        //Genero cliente para guardar y le setteo todos los datos!
        Cliente save = new Cliente();
        save.setIDCliente(alta.getIDCliente());
        save.setApellidoCliente(alta.getApellidoCliente());
        save.setNombreCliente(alta.getNombreCliente());
        save.setDni(alta.getDni());
        save.setRS(alta.getRS());
        //TODO save.setFechaNacimiento(alta.getFechaNacimiento();
        save.setMail(alta.getMail());
        //Comienzo la transaccion.
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        try {
            entityManager.persist(save);
            //Realizo commit!
            entityManager.getTransaction().commit();
            System.out.println("Se guardo el cliente de forma correcta!");
        } catch (Exception e) {
            System.out.println("No pude guardar nada hermano!");
        }
        entityManagerFactory.close();
    }

    @Override
    public void ModCliente(Cliente modificar) throws ClassNotFoundException, IOException {
        //Guardo cliente Actualizado!
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PersistenciaAerolineas");
        //Comienzo la transaccion.
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        try {
            //Utilizo la live transaction  para hacer el mod
            Cliente enBaseDeDatos = entityManager.find(Cliente.class,modificar.getIDCliente());
            enBaseDeDatos.setApellidoCliente(modificar.getApellidoCliente());
            enBaseDeDatos.setNombreCliente(modificar.getNombreCliente());
            enBaseDeDatos.setDni(modificar.getDni());
            enBaseDeDatos.setRS(modificar.getRS());
            //TODO save.setFechaNacimiento(alta.getFechaNacimiento();
            enBaseDeDatos.setMail(modificar.getMail());
            //Realizo commit!
            entityManager.getTransaction().commit();
            System.out.println("Se guardo actualizo el cliente " + modificar.getIDCliente() + "  de forma correcta!");
        } catch (Exception e) {
            System.out.println("No pude guardar nada hermano!");
        }
        entityManagerFactory.close();
    }

    @Override
    public void BajaCliente(Cliente baja) throws ClassNotFoundException, IOException {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PersistenciaAerolineas");

        //Comienzo la transaccion.
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Cliente ClienteEncontrado = entityManager.find(Cliente.class, baja.getIDCliente());
        //Borro el cliente!
        entityManager.remove(ClienteEncontrado);
        //Realizo commit!
        try {
            entityManager.getTransaction().commit();
            entityManagerFactory.close();
            System.out.println("Borre el cliente: "+baja.getIDCliente()+" sin problemas!");
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            System.out.println("No se pudo borr el cliente con el ID: " + baja.getIDCliente());
            entityManagerFactory.close();
        }
        entityManagerFactory.close();

    }


}
