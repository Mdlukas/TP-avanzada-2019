package edu.usal.dao.implementaciones.ImplJDBC;

import edu.usal.dao.interfaces.PaisDAO;
import edu.usal.domain.Pais;
import edu.usal.util.ConexionSQLServer;

import javax.persistence.EntityManager;
import java.util.List;

public class PaisDAOImplSQL implements PaisDAO {
    //Genero entidad manager basado en la persistencia.
    EntityManager entityManager = ConexionSQLServer.entityManagerFactory.createEntityManager();

    @Override
    public Pais ObtenerPais(Pais obtener) {
        return null;
    }

    @Override
    public List<Pais> listadodePaises() {
        //Comienzo la transaccion!
        this.entityManager.getTransaction().begin();
        //Native query para hacer un SELECT *
        List<Pais> paises = this.entityManager.createQuery("SELECT p FROM Pais p").getResultList();
        //Realizo commit!
        try {
            this.entityManager.getTransaction().commit();
            return paises;
        } catch (Exception e) {
            System.out.println("No pude retornar los paises!");
            this.entityManager.getTransaction().rollback();
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void AltadePais(Pais AltaPais) {

    }

    @Override
    public void ModificaciondePais(Pais ModificarPais) {

    }

    @Override
    public void BajadePais(Pais BajaPais) {

    }
}
