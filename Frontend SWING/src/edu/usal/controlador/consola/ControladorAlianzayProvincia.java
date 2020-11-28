package edu.usal.controlador.consola;


import edu.usal.dao.factory.FactoryAlianza;
import edu.usal.dao.factory.FactoryProvincia;
import edu.usal.dao.interfaces.AlianzaDAO;
import edu.usal.dao.interfaces.ProvinciaDAO;
import edu.usal.domain.Provincia;
import edu.usal.vista.consola.VistaAlianzayProvincia;

//Este controlador puramente existe para el testeo y validacion de estas interfaces del punto de vista de la logica.
public class ControladorAlianzayProvincia {

    private final VistaAlianzayProvincia vista;
    private static AlianzaDAO daoAlianza;
    private static ProvinciaDAO daoProvincia;

    public ControladorAlianzayProvincia(VistaAlianzayProvincia vista) {
        this.vista = new VistaAlianzayProvincia();
        try{
            daoAlianza = FactoryAlianza.GetAlianzaImplementacion("FILE");
            daoProvincia = FactoryProvincia.GetProvinciaImplementacion("FILE");
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void ListarProvincias(){
        this.vista.ImprimirProvincias(daoProvincia.ReadList());
    }

    public void ListarAlianzas(){
        this.vista.ImprimirAlianzas(daoAlianza.ReadList());
    }

    public void MostrarMenuFile(){
        int opcion = this.vista.MostrarMenuFile();
        switch (opcion){
            case 1:
                this.ListarAlianzas();
                this.MostrarMenuFile();
                break;

            case 2:
                this.ListarProvincias();
                this.MostrarMenuFile();
        }

    }

}
