package edu.usal.controlador.consola;


import edu.usal.dao.factory.FactoryAlianza;
import edu.usal.dao.factory.FactoryProvincia;
import edu.usal.dao.interfaces.AlianzaDAO;
import edu.usal.dao.interfaces.ProvinciaDAO;
import edu.usal.domain.Alianza;
import edu.usal.domain.Provincia;
import edu.usal.vista.consola.VistaAlianzayProvincia;

import java.util.ArrayList;
import java.util.List;

//Este controlador puramente existe para el testeo y validacion de estas interfaces del punto de vista de la logica.
public class ControladorAlianzayProvincia {

    private VistaAlianzayProvincia vista;
    private static AlianzaDAO daoAlianza;
    private static ProvinciaDAO daoProvincia;

    public ControladorAlianzayProvincia(VistaAlianzayProvincia vista) {
        this.vista = new VistaAlianzayProvincia();
        try{
            daoAlianza = FactoryAlianza.GetAlianzaImplementacion();
            daoProvincia = FactoryProvincia.GetProvinciaImplementacion();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public ControladorAlianzayProvincia() {
        try{
            daoAlianza = FactoryAlianza.GetAlianzaImplementacion();
            daoProvincia = FactoryProvincia.GetProvinciaImplementacion();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public List<Provincia> ListarProvincias(){
        return daoProvincia.ReadList();
    }

    public List<Alianza> ListarAlianzas(){
        return daoAlianza.ReadList();
    }

    //Para la ejecucion en consola
    public void MostrarMenuFile(){
        int opcion = this.vista.MostrarMenuFile();
        switch (opcion){
            case 1:
                this.vista.ImprimirAlianzas((ArrayList<Alianza>) this.ListarAlianzas());
                this.MostrarMenuFile();
                break;

            case 2:
                this.vista.ImprimirProvincias((ArrayList<Provincia>) this.ListarProvincias());
                this.MostrarMenuFile();
                break;
        }

    }

}
