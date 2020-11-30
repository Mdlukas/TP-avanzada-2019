package edu.usal.controlador.consola;

import edu.usal.dao.factory.FactoryAerolinea;
import edu.usal.dao.factory.FactoryProvincia;
import edu.usal.dao.interfaces.AerolineaDAO;
import edu.usal.domain.Aerolinea;
import edu.usal.vista.consola.VistaAerolinea;

import java.util.List;

public class ControladorAerolinea {


    private  VistaAerolinea vistaAerolinea;
    private AerolineaDAO Aerolinea;


    public ControladorAerolinea(VistaAerolinea vista) {
        this.vistaAerolinea = vista;
        try {
            this.Aerolinea = FactoryAerolinea.GetAerolineaImplementacion();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ControladorAerolinea(){
        try {
            this.Aerolinea = FactoryAerolinea.GetAerolineaImplementacion();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public List<Aerolinea> ListadodeAerolinea() {
        return Aerolinea.listadodeAerolineas();
    }


    public Aerolinea ConsultadeAerolinea(Aerolinea consulta) {
         return this.Aerolinea.ConsultarAerolinea(consulta);
    }

    public boolean AltadeAerolinea(Aerolinea Alta) {
        return this.Aerolinea.AltadeAerolinea(Alta);
    }

    public boolean BajadeAerolinea(Aerolinea Baja) {
        return this.Aerolinea.BajadeAerolinea(Baja);
    }

    public boolean ModificaciondeAerolinea(Aerolinea Modificacion) {
        return this.Aerolinea.ModificaciondeAerolinea(Modificacion);
    }


    public void MostrarMenuAerolinea() {

        int opcion = vistaAerolinea.menu();

        switch (opcion) {


            case 1:
                System.out.println("Alta de Aerolinea ");
                System.out.println("\n");
                this.AltadeAerolinea(this.vistaAerolinea.AltadeAerolinea());
                this.MostrarMenuAerolinea();
                break;

            case 2:
                System.out.println("Baja de Aerolinea \n");
                System.out.println("\n");
                this.BajadeAerolinea(this.vistaAerolinea.BajadeAerolinea());
                this.MostrarMenuAerolinea();
                break;

            case 3:
                System.out.println("Modificacion de Aerolinea \n");
                System.out.println("\n");
                this.ModificaciondeAerolinea(this.vistaAerolinea.ModificaciondeAerolinea());
                this.MostrarMenuAerolinea();

                break;

            case 4:
                System.out.println("Consulta de Aerolinea \n");
                System.out.println("\n");
                this.ConsultadeAerolinea(this.vistaAerolinea.ConsultadeAerolinea());
                this.MostrarMenuAerolinea();
                break;

            case 5:
                System.out.println("Listado de Aerolinea \n");
                System.out.println("\n");
                this.vistaAerolinea.ListadodeAerolinea(this.ListadodeAerolinea());
                this.MostrarMenuAerolinea();

                break;

            case 6:
                System.out.println("Finalizar Ejecucion \n");

                break;

        }

    }


}
