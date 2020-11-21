package edu.usal.dao.implementaciones.ImplJDBC;

import java.util.List;

import edu.usal.dao.interfaces.ClienteDAO;
import edu.usal.domain.Cliente;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ClienteDAOImplSQL implements ClienteDAO {

    //Genero entidad de persistencia Hibernate.
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PersistenciaAerolineas");
    //Genero entidad manager basado en la persistencia.
    EntityManager entityManager = entityManagerFactory.createEntityManager();


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
        List<Cliente> clientes = this.entityManager.createQuery("SELECT c FROM Cliente c").getResultList();
        //Realizo commit!
        try{
            this.entityManager.getTransaction().commit();
            //Retorno clientes.
            return clientes;
        } catch (Exception e){
            System.out.println("No pude retornar los clientes!");
            this.entityManager.getTransaction().rollback();
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void AltaCliente(Cliente alta) {
        //Genero cliente para guardar y le setteo todos los datos!
        Cliente save = new Cliente();
//        save.setIDCliente(alta.getIDCliente());
        save.setApellidoCliente(alta.getApellidoCliente());
        save.setNombreCliente(alta.getNombreCliente());
        save.setDni(alta.getDni());
        save.setRS(alta.getRS());
        //TODO save.setFechaNacimiento(alta.getFechaNacimiento();
        save.setMail(alta.getMail());
        //Comienzo la transaccion.
        this.entityManager.getTransaction().begin();
        try {
            this.entityManager.persist(save);
            //Realizo commit!
            this.entityManager.getTransaction().commit();
            System.out.println("Se guardo el cliente de forma correcta!");
        } catch (Exception e) {
            this.entityManager.getTransaction().rollback();
            e.printStackTrace();
            System.out.println("No pude guardar nada hermano!");
        }
    }

    //Guardo cliente Actualizado!
    @Override
    public void ModCliente(Cliente modificar) {
        //Comienzo la transaccion.
        this.entityManager.getTransaction().begin();
        try {
            //Utilizo la live transaction  para hacer el modificacion
            Cliente enBaseDeDatos = this.entityManager.find(Cliente.class, modificar.getIDCliente());
            enBaseDeDatos.setApellidoCliente(modificar.getApellidoCliente());
            enBaseDeDatos.setNombreCliente(modificar.getNombreCliente());
            enBaseDeDatos.setDni(modificar.getDni());
            enBaseDeDatos.setRS(modificar.getRS());
            //TODO save.setFechaNacimiento(alta.getFechaNacimiento();
            enBaseDeDatos.setMail(modificar.getMail());
            //Realizo commit!
            this.entityManager.getTransaction().commit();
            System.out.println("Se guardo actualizo el cliente " + modificar.getIDCliente() + "  de forma correcta!");
        } catch (Exception e) {
            this.entityManager.getTransaction().rollback();
            e.printStackTrace();
            System.out.println("No pude guardar nada hermano!");
        }
    }

    @Override
    public void BajaCliente(Cliente baja) {
        //Comienzo la transaccion.
        this.entityManager.getTransaction().begin();
        Cliente ClienteEncontrado = entityManager.find(Cliente.class, baja.getIDCliente());
        try {
            //Borro el cliente!
            this.entityManager.remove(ClienteEncontrado);
            //Realizo commit!
            this.entityManager.getTransaction().commit();
            System.out.println("Borre el cliente: " + baja.getIDCliente() + " sin problemas!");
        } catch (Exception e) {
            //Realizo un rollback si no se pudo borrar el cliente.
            this.entityManager.getTransaction().rollback();
            e.printStackTrace();
            System.out.println("No se pudo borrar el cliente con el ID: " + baja.getIDCliente());
        }
    }


}
