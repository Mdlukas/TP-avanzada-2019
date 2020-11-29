package edu.usal.dao.implementaciones.ImplJDBC;

import edu.usal.dao.interfaces.VentaDAO;
import edu.usal.domain.Venta;
import edu.usal.domain.Vuelo;
import edu.usal.util.ConexionSQLServer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class VentaDAOImplSQL implements VentaDAO {

    EntityManager entityManager = ConexionSQLServer.entityManagerFactory.createEntityManager();

    @Override
    public Venta ObtenerVenta(Venta obtener) {
        this.entityManager.getTransaction().begin();
        Venta ventaEncontrado = this.entityManager.find(Venta.class, obtener.getIDVenta());
        try {
            this.entityManager.getTransaction().commit();
            return ventaEncontrado;
        } catch (Exception e) {
            System.out.println("No se pudo encontrar la venta con el ID: " + obtener.getIDVenta());
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Venta> listadodeVentas() {
        this.entityManager.getTransaction().begin();
        List<Venta> ventas = this.entityManager.createQuery("SELECT v FROM Venta v").getResultList();
        try{
            this.entityManager.getTransaction().commit();
            return ventas;
        } catch (Exception e){
            System.out.println("No pude retornar las ventas!");
            this.entityManager.getTransaction().rollback();
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void AltadeVenta(Venta alta) {
        Venta save = new Venta();
        //Solamente agrego los objetos sin relaciones, por que me guardo esos para el modificar!
        save.setFormadePago(alta.getFormadePago());
        //TODO aca es donde tendria que ir al set de Cliente/Vuelo y Aerolinea.
        this.entityManager.getTransaction().begin();
        try {
            this.entityManager.persist(save);
            this.entityManager.getTransaction().commit();
            System.out.println("Se guardo venta de forma correcta!");
        } catch (Exception e) {
            this.entityManager.getTransaction().rollback();
            e.printStackTrace();
            System.out.println("No pude guardar la venta hermano!");
        }
    }


    @Override
    public void ModificaciondeVenta(Venta modificar) {
        this.entityManager.getTransaction().begin();
        try {
            Venta enBaseDeDatos = this.entityManager.find(Venta.class, modificar.getIDVenta());
            enBaseDeDatos.setFormadePago(modificar.getFormadePago());
            //TODO aca es donde tendria que ir al set de Cliente/Vuelo y Aerolinea.
            this.entityManager.getTransaction().commit();
            System.out.println("Se guardo actualizo la venta " + modificar.getIDVenta() + "  de forma correcta!");
        } catch (Exception e) {
            this.entityManager.getTransaction().rollback();
            e.printStackTrace();
            System.out.println("No pude editar la venta hermano!");
        }
    }


    @Override
    public void BajadeVenta(Venta baja) {
        this.entityManager.getTransaction().begin();
        Venta ventaEncontrada = entityManager.find(Venta.class, baja.getIDVenta());
        try {
            this.entityManager.remove(ventaEncontrada);
            this.entityManager.getTransaction().commit();
            System.out.println("Borre la venta: " + baja.getIDVenta() + " sin problemas!");
        } catch (Exception e) {
            //Realizo un rollback si no se pudo borrar el cliente.
            this.entityManager.getTransaction().rollback();
            e.printStackTrace();
            System.out.println("No se pudo borrar el cliente con el ID: " + baja.getIDVenta());
        }
    }


}
