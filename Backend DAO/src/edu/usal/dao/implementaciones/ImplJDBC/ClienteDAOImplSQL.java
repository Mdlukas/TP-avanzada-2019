package edu.usal.dao.implementaciones.ImplJDBC;

import edu.usal.dao.interfaces.ClienteDAO;
import edu.usal.domain.*;
import edu.usal.util.ConexionSQLServer;

import javax.persistence.EntityManager;
import java.util.List;

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
        List<Cliente> clientesDB = this.entityManager.createQuery("SELECT c FROM Cliente c").getResultList();
        //Realizo commit!
        try {
            this.entityManager.getTransaction().commit();
            return clientesDB;
        } catch (Exception e) {
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
        Aerolinea AerolineaEncontrada = this.entityManager.find(Aerolinea.class, alta.getPasajeroFrecuente().getAerolinea().getIDAerolinea());
        alta.getPasajeroFrecuente().setAerolinea(AerolineaEncontrada);
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
            //Pasajero
            Pasajero pasajeroEncontrado = this.entityManager.find(Pasajero.class, enBaseDeDatos.getPasajeroFrecuente().getIDnrodepasajero());
            pasajeroEncontrado.setNumero(modificar.getPasajeroFrecuente().getNumero());
            enBaseDeDatos.setPasajeroFrecuente(pasajeroEncontrado);
            //Direccion
            Direccion direccionEncontrada = this.entityManager.find(Direccion.class, modificar.getDireccion().getIDDireccion());
            direccionEncontrada.setCiudad(modificar.getDireccion().getCiudad());
            direccionEncontrada.setCodigoPostal(modificar.getDireccion().getCodigoPostal());
            direccionEncontrada.setAltura(modificar.getDireccion().getAltura());
            direccionEncontrada.setCalle(modificar.getDireccion().getCalle());
            enBaseDeDatos.setDireccion(direccionEncontrada);
            //Telefono
            Telefono telefonoEncontrado = this.entityManager.find(Telefono.class, modificar.getTelefono().getIDTelefono());
            telefonoEncontrado.setNumeroCelular(modificar.getTelefono().getNumeroCelular());
            telefonoEncontrado.setNumeroLaboral(modificar.getTelefono().getNumeroLaboral());
            telefonoEncontrado.setNumeroPersonal(modificar.getTelefono().getNumeroPersonal());
            enBaseDeDatos.setTelefono(telefonoEncontrado);
            //Pasaporte
            Pasaporte pasaporteEncontrado = this.entityManager.find(Pasaporte.class,modificar.getPasaporte().getIDPasaporte());
            pasaporteEncontrado.setFechadeVencimiento(modificar.getPasaporte().getFechadeVencimiento());
            pasaporteEncontrado.setFechadeEmision(modificar.getPasaporte().getFechadeEmision());
            pasaporteEncontrado.setAutoridadEmision(modificar.getPasaporte().getAutoridadEmision());
            pasaporteEncontrado.setNrodePasaporte(modificar.getPasaporte().getNrodePasaporte());
            pasaporteEncontrado.setPaisEmision(modificar.getPasaporte().getPaisEmision());
            enBaseDeDatos.setPasaporte(pasaporteEncontrado);
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
