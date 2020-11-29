package edu.usal.dao.implementaciones.ImplJDBC;

import edu.usal.dao.interfaces.VueloDAO;
import edu.usal.domain.Cliente;
import edu.usal.domain.Vuelo;
import edu.usal.util.ConexionSQLServer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
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
    public void AltadeVuelo(Vuelo alta) {
        Vuelo save = new Vuelo();
        //Solamente agrego los objetos sin relaciones, por que me guardo esos para el modificar!
        save.setCantAsientos(alta.getCantAsientos());
        save.setTiempovuelo(alta.getTiempovuelo());
        this.entityManager.getTransaction().begin();
        try {
            this.entityManager.persist(save);
            this.entityManager.getTransaction().commit();
            System.out.println("Se guardo el vuelo de forma correcta!");
        } catch (Exception e) {
            this.entityManager.getTransaction().rollback();
            e.printStackTrace();
            System.out.println("No pude guardar el vuelo hermano!");
        }
    }

    @Override
    public void ModificaciondeVuelo(Vuelo modificar) {
        this.entityManager.getTransaction().begin();
        try {
            Vuelo enBaseDeDatos = this.entityManager.find(Vuelo.class, modificar.getIDVuelo());
            enBaseDeDatos.setTiempovuelo(modificar.getTiempovuelo());
            enBaseDeDatos.setCantAsientos(modificar.getCantAsientos());
            this.entityManager.getTransaction().commit();
            System.out.println("Se guardo actualizo el vuelo " + modificar.getIDVuelo() + "  de forma correcta!");
        } catch (Exception e) {
            this.entityManager.getTransaction().rollback();
            e.printStackTrace();
            System.out.println("No pude editar el vuelo hermano!");
        }
    }

    @Override
    public void BajadeVuelo(Vuelo baja) {
        this.entityManager.getTransaction().begin();
        Vuelo vueloEncontrado = entityManager.find(Vuelo.class, baja.getIDVuelo());
        try {
            this.entityManager.remove(vueloEncontrado);
            this.entityManager.getTransaction().commit();
            System.out.println("Borre el vuelo: " + baja.getIDVuelo() + " sin problemas!");
        } catch (Exception e) {
            //Realizo un rollback si no se pudo borrar el cliente.
            this.entityManager.getTransaction().rollback();
            e.printStackTrace();
            System.out.println("No se pudo borrar el cliente con el ID: " + baja.getIDVuelo());
        }
    }


}
