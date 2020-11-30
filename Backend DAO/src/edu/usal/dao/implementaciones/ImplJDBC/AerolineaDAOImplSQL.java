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
    public boolean AltadeAerolinea(Aerolinea alta) {
        //Comienzo la transaccion.
        this.entityManager.getTransaction().begin();
        try {
            this.entityManager.persist(alta);
            //Realizo commit!
            this.entityManager.getTransaction().commit();
            System.out.println("Se guardo el Aerolinea de forma correcta!");
            return true;
        } catch (Exception e) {
            this.entityManager.getTransaction().rollback();
            e.printStackTrace();
            System.out.println("No pude guardar la Aerolinea hermano!");
            return false;
        }
    }

    @Override
    public boolean ModificaciondeAerolinea(Aerolinea modificar) {
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
            return true;
        } catch (Exception e) {
            this.entityManager.getTransaction().rollback();
            e.printStackTrace();
            System.out.println("No pude modificar esa Aerolinea!");
            return false;
        }
    }

    @Override
    public boolean BajadeAerolinea(Aerolinea baja) {
        //Comienzo la transaccion.
        this.entityManager.getTransaction().begin();
        Aerolinea AerolineaEncontrada = entityManager.find(Aerolinea.class, baja.getIDAerolinea());
        try {
            //Borro el cliente!
            this.entityManager.remove(AerolineaEncontrada);
            //Realizo commit!
            this.entityManager.getTransaction().commit();
            System.out.println("Borre la Aerolinea: " + baja.getIDAerolinea() + " sin problemas!");
            return true;
        } catch (Exception e) {
            //Realizo un rollback si no se pudo borrar el cliente.
            this.entityManager.getTransaction().rollback();
            e.printStackTrace();
            System.out.println("No se pudo borrar la erolinea con el ID: " + baja.getIDAerolinea());
            return false;
        }

    }

}
