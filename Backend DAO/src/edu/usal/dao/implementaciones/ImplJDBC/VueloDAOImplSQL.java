package edu.usal.dao.implementaciones.ImplJDBC;

import edu.usal.dao.factory.FactoryAerolinea;
import edu.usal.dao.interfaces.AerolineaDAO;
import edu.usal.dao.interfaces.VueloDAO;
import edu.usal.domain.*;
import edu.usal.util.ConexionSQLServer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class VueloDAOImplSQL implements VueloDAO {

    EntityManager entityManager = ConexionSQLServer.entityManagerFactory.createEntityManager();

    @Override
    public Vuelo ConsultadeVuelo(Vuelo obtener) {
        this.entityManager.getTransaction().begin();
        Vuelo vueloEncontrado = this.entityManager.find(Vuelo.class, obtener.getIDVuelo());
        try {
            this.entityManager.getTransaction().commit();
            return vueloEncontrado;
        } catch (Exception e) {
            System.out.println("No se pudo encontrar el vuelo con el ID: " + obtener.getIDVuelo());
            e.printStackTrace();
            return null;
        }
    }


    @Override
    public List<Vuelo> listadodeVuelos() {
        this.entityManager.getTransaction().begin();
        List<Vuelo> vuelos = this.entityManager.createQuery("SELECT v FROM Vuelo v").getResultList();
        try{
            this.entityManager.getTransaction().commit();
            return vuelos;
        } catch (Exception e){
            System.out.println("No pude retornar los vuelos!");
            this.entityManager.getTransaction().rollback();
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Vuelo> listadoDeVuelosPorAerolinea(Aerolinea a) {
        //Comienzo la transaccion!
        this.entityManager.getTransaction().begin();
        a = this.entityManager.find(Aerolinea.class, a.getIDAerolinea());
        //Native query para hacer un SELECT *
        Query q = this.entityManager.createQuery("SELECT v FROM Vuelo v WHERE aerolinea=:a");
        q.setParameter("a",a);
        List<Vuelo> vuelos = q.getResultList();
        //Realizo commit!
        try {
            this.entityManager.getTransaction().commit();
            //Retorno clientes.
            return vuelos;
        } catch (Exception e) {
            System.out.println("No pude retornar las Aerolineas!");
            this.entityManager.getTransaction().rollback();
            e.printStackTrace();
            return null;
        }
    }


    @Override
    public boolean AltadeVuelo(Vuelo alta) {
        this.entityManager.getTransaction().begin();
        Aeropuerto llegada = this.entityManager.find(Aeropuerto.class,alta.getAeropuertodeLLegada().getCodigodeAeropuerto());
        Aeropuerto salida = this.entityManager.find(Aeropuerto.class,alta.getAeropuertodeSalida().getCodigodeAeropuerto());
        try {
            if(llegada != null){
                alta.setAeropuertodeLLegada(llegada);
            } if (salida != null){
                alta.setAeropuertodeSalida(salida);
            }
            alta.setAerolinea(this.entityManager.find(Aerolinea.class, alta.getAerolinea().getIDAerolinea()));
            this.entityManager.persist(alta);
            this.entityManager.getTransaction().commit();
            System.out.println("Se guardo el vuelo de forma correcta!");
            return true;
        } catch (Exception e) {
            this.entityManager.getTransaction().rollback();
            e.printStackTrace();
            System.out.println("No pude guardar el vuelo hermano!");
            return false;
        }
    }

    @Override
    public boolean ModificaciondeVuelo(Vuelo modificar) {
        this.entityManager.getTransaction().begin();
        Aeropuerto llegada = this.entityManager.find(Aeropuerto.class,modificar.getAeropuertodeLLegada().getCodigodeAeropuerto());
        Aeropuerto salida = this.entityManager.find(Aeropuerto.class,modificar.getAeropuertodeSalida().getCodigodeAeropuerto());
        try {
            Vuelo enBaseDeDatos = this.entityManager.find(Vuelo.class, modificar.getIDVuelo());
            if(llegada != null){
                enBaseDeDatos.setAeropuertodeLLegada(llegada);
            } if (salida != null){
                enBaseDeDatos.setAeropuertodeSalida(salida);
            }
            enBaseDeDatos.setTiempovuelo(modificar.getTiempovuelo());
            enBaseDeDatos.setAerolinea(this.entityManager.find(Aerolinea.class, modificar.getAerolinea().getIDAerolinea()));
            enBaseDeDatos.setCantAsientos(modificar.getCantAsientos());
            enBaseDeDatos.setFechaSalida(modificar.getFechaSalida());
            enBaseDeDatos.setFechaLLegada(modificar.getFechaLLegada());
            this.entityManager.getTransaction().commit();
            System.out.println("Se guardo actualizo el vuelo " + modificar.getIDVuelo() + "  de forma correcta!");
            return true;
        } catch (Exception e) {
            this.entityManager.getTransaction().rollback();
            e.printStackTrace();
            System.out.println("No pude editar el vuelo hermano!");
            return false;
        }
    }

    @Override
    public boolean BajadeVuelo(Vuelo baja) {
        this.entityManager.getTransaction().begin();
        Vuelo vueloEncontrado = entityManager.find(Vuelo.class, baja.getIDVuelo());
        try {
            this.entityManager.remove(vueloEncontrado);
            this.entityManager.getTransaction().commit();
            System.out.println("Borre el vuelo: " + baja.getIDVuelo() + " sin problemas!");
            return true;
        } catch (Exception e) {
            //Realizo un rollback si no se pudo borrar el cliente.
            this.entityManager.getTransaction().rollback();
            e.printStackTrace();
            System.out.println("No se pudo borrar el cliente con el ID: " + baja.getIDVuelo());
            return false;
        }
    }


}
