package edu.usal.controlador.consola;

import edu.usal.dao.factory.FactoryVuelo;
import edu.usal.dao.interfaces.VueloDAO;
import edu.usal.vista.consola.VistaVuelo;

public class ControladorVuelo {


    private VistaVuelo vistaVuelo;
    private VueloDAO Vuelo;


    public ControladorVuelo(VistaVuelo vista) {
        this.vistaVuelo = vista;
        try {
            this.Vuelo = FactoryVuelo.GetVueloImplementacion("SQL");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public void AltadeVuelo() {


        this.Vuelo.AltadeVuelo(vistaVuelo.AltadeVuelo());

    }

    public void ListadodeVuelo() {

        this.vistaVuelo.ListadodeVuelo(Vuelo.listadodeVuelos());
    }


    public void ConsultadeVuelo() {
        vistaVuelo.imprimirVuelo(this.Vuelo.ConsultadeVuelo(vistaVuelo.ConsultadeVuelo()));

    }

    public void BajadeVuelo() {
        this.Vuelo.BajadeVuelo(vistaVuelo.BajadeVuelo());

    }

    public void ModificaciondeVuelo() {

        this.Vuelo.ModificaciondeVuelo(vistaVuelo.ModificaciondeVuelo());
    }


    public void MostrarMenuVuelo() {

        int opcion = vistaVuelo.menu();

        switch (opcion) {


            case 1:
                System.out.println("Alta de Vuelo ");
                System.out.println("\n");
                this.AltadeVuelo();
                this.MostrarMenuVuelo();

                break;


            case 2:
                System.out.println("Baja de Vuelo \n");
                System.out.println("\n");
                this.BajadeVuelo();
                this.MostrarMenuVuelo();


                break;


            case 3:
                System.out.println("Modificacion de Vuelo \n");
                System.out.println("\n");
                this.ModificaciondeVuelo();
                this.MostrarMenuVuelo();

                break;

            case 4:
                System.out.println("Consulta de Vuelo \n");
                System.out.println("\n");
                this.ConsultadeVuelo();
                this.MostrarMenuVuelo();
                break;


            case 5:
                System.out.println("Listado de Vuelo \n");
                System.out.println("\n");
                this.ListadodeVuelo();
                this.MostrarMenuVuelo();

                break;

            case 6:
                System.out.println("Finalizar Ejecucion \n");

                break;

        }

    }


}
