package edu.usal.dao.implementaciones.ImplJDBC;

import edu.usal.dao.interfaces.AerolineaDAO;
import edu.usal.domain.Aerolinea;
import edu.usal.domain.Cliente;
import edu.usal.util.ConexionSQLServer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class AerolineaDAOImplSQL implements AerolineaDAO {

    //Genero entidad manager basado en la persistencia.
    EntityManager entityManager = ConexionSQLServer.entityManagerFactory.createEntityManager();

    @Override
    public Aerolinea ConsultarAerolinea(Aerolinea consulta) {
        this.entityManager.getTransaction().begin();
        Aerolinea AerolineaEncontrada = this.entityManager.find(Aerolinea.class, consulta.getIDAerolinea());
        try {
            this.entityManager.getTransaction().commit();
            return AerolineaEncontrada;
        } catch (Exception e) {
            System.out.println("No se pudo encontrar el cliente con el ID: " + consulta.getIDAerolinea());
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Aerolinea> listadodeAerolineas() {
        //Comienzo la transaccion!
        this.entityManager.getTransaction().begin();
        //Native query para hacer un SELECT *
        List<Aerolinea> aerolineas = this.entityManager.createQuery("SELECT a FROM Aerolinea a").getResultList();
        //Realizo commit!
        try {
            this.entityManager.getTransaction().commit();
            //Retorno clientes.
            return aerolineas;
        } catch (Exception e) {
            System.out.println("No pude retornar las Aerolineas!");
            this.entityManager.getTransaction().rollback();
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void AltadeAerolinea(Aerolinea alta) {
        //Genero cliente para guardar y le setteo todos los datos!
        Aerolinea save = new Aerolinea();
        save.setNombreAereoLinea(alta.getNombreAereoLinea());
        save.setAlianza(alta.getAlianza());
        //Comienzo la transaccion.
        this.entityManager.getTransaction().begin();
        try {
            this.entityManager.persist(save);
            //Realizo commit!
            this.entityManager.getTransaction().commit();
            System.out.println("Se guardo el Aerolinea de forma correcta!");
        } catch (Exception e) {
            this.entityManager.getTransaction().rollback();
            e.printStackTrace();
            System.out.println("No pude guardar la Aerolinea hermano!");
        }
    }

    @Override
    public void ModificaciondeAerolinea(Aerolinea modificar) {
        //Comienzo la transaccion.
        this.entityManager.getTransaction().begin();
        try {
            //Utilizo la live transaction  para hacer el modificacion
            Aerolinea enBaseDeDatos = this.entityManager.find(Aerolinea.class, modificar.getIDAerolinea());
            enBaseDeDatos.setNombreAereoLinea(modificar.getNombreAereoLinea());
            enBaseDeDatos.setAlianza(modificar.getAlianza());
            //Realizo commit!
            this.entityManager.getTransaction().commit();
            System.out.println("Se guardo actualizo la Aerolinea " + modificar.getNombreAereoLinea() + "  de forma correcta!");
        } catch (Exception e) {
            this.entityManager.getTransaction().rollback();
            e.printStackTrace();
            System.out.println("No pude modificar esa Aerolinea hermano!");
        }
    }

    @Override
    public void BajadeAerolinea(Aerolinea baja) {
        //Comienzo la transaccion.
        this.entityManager.getTransaction().begin();
        Aerolinea AerolineaEncontrada = entityManager.find(Aerolinea.class, baja.getIDAerolinea());
        try {
            //Borro el cliente!
            this.entityManager.remove(AerolineaEncontrada);
            //Realizo commit!
            this.entityManager.getTransaction().commit();
            System.out.println("Borre la Aerolinea: " + baja.getIDAerolinea() + " sin problemas!");
        } catch (Exception e) {
            //Realizo un rollback si no se pudo borrar el cliente.
            this.entityManager.getTransaction().rollback();
            e.printStackTrace();
            System.out.println("No se pudo borrar la erolinea con el ID: " + baja.getIDAerolinea());
        }

    }

}
