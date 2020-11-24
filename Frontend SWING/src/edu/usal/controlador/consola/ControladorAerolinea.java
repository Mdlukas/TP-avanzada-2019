package edu.usal.controlador.consola;

import edu.usal.dao.factory.FactoryAerolinea;
import edu.usal.dao.interfaces.AerolineaDAO;
import edu.usal.vista.consola.VistaAerolinea;

public class ControladorAerolinea {


    private VistaAerolinea vistaAerolinea;
    private AerolineaDAO Aerolinea;


    public ControladorAerolinea(VistaAerolinea vista) {
        this.vistaAerolinea = vista;
        try {
            this.Aerolinea = FactoryAerolinea.GetAerolineaImplementacion("SQL");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public void AltadeAerolinea() {


        this.Aerolinea.AltadeAerolinea(vistaAerolinea.AltadeAerolinea());

    }

    public void ListadodeAerolinea() {

        this.vistaAerolinea.ListadodeAerolinea(Aerolinea.listadodeAerolineas());
    }


    public void ConsultadeAerolinea() {
        vistaAerolinea.imprimirAerolinea(this.Aerolinea.ConsultarAerolinea(vistaAerolinea.ConsultadeAerolinea()));

    }

    public void BajadeAerolinea() {
        this.Aerolinea.BajadeAerolinea(vistaAerolinea.BajadeAerolinea());

    }

    public void ModificaciondeAerolinea() {

        this.Aerolinea.ModificaciondeAerolinea(vistaAerolinea.ModificaciondeAerolinea());
    }


    public void MostrarMenuAerolinea() {

        int opcion = vistaAerolinea.menu();

        switch (opcion) {


            case 1:
                System.out.println("Alta de Aerolinea ");
                System.out.println("\n");
                this.AltadeAerolinea();
                this.MostrarMenuAerolinea();

                break;


            case 2:
                System.out.println("Baja de Aerolinea \n");
                System.out.println("\n");
                this.BajadeAerolinea();
                this.MostrarMenuAerolinea();


                break;


            case 3:
                System.out.println("Modificacion de Aerolinea \n");
                System.out.println("\n");
                this.ModificaciondeAerolinea();
                this.MostrarMenuAerolinea();

                break;

            case 4:
                System.out.println("Consulta de Aerolinea \n");
                System.out.println("\n");
                this.ConsultadeAerolinea();
                this.MostrarMenuAerolinea();
                break;


            case 5:
                System.out.println("Listado de Aerolinea \n");
                System.out.println("\n");
                this.ListadodeAerolinea();
                this.MostrarMenuAerolinea();

                break;

            case 6:
                System.out.println("Finalizar Ejecucion \n");

                break;

        }

    }


}
