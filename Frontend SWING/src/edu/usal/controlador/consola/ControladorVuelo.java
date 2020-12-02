package edu.usal.controlador.consola;

import edu.usal.dao.factory.FactoryVuelo;
import edu.usal.dao.interfaces.VueloDAO;
import edu.usal.domain.Aerolinea;
import edu.usal.domain.TipoPago;
import edu.usal.domain.Vuelo;
import edu.usal.vista.consola.VistaVuelo;

import java.util.List;

public class ControladorVuelo {

    private VistaVuelo vistaVuelo;
    private VueloDAO Vuelo;

    public ControladorVuelo(VistaVuelo vista) {
        this.vistaVuelo = vista;
        try {
            this.Vuelo = FactoryVuelo.GetVueloImplementacion();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ControladorVuelo() {
        try {
            this.Vuelo = FactoryVuelo.GetVueloImplementacion();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean AltadeVuelo(Vuelo Alta) {
        Alta.setNumeroVuelo(this.HandleNumeroVuelo(Alta));
        return this.Vuelo.AltadeVuelo(Alta);
    }

    public boolean BajadeVuelo(Vuelo Baja) {
        return this.Vuelo.BajadeVuelo(Baja);
    }

    public boolean ModificaciondeVuelo(Vuelo Modificacion) {
        Modificacion.setNumeroVuelo(this.HandleNumeroVuelo(Modificacion));
        return this.Vuelo.ModificaciondeVuelo(Modificacion);
    }

    public Vuelo ConsultadeVuelo(Vuelo Consulta) {
        return this.Vuelo.ConsultadeVuelo(Consulta);
    }

    public List<Vuelo> ListadodeVuelo() {
        return this.Vuelo.listadodeVuelos();
    }

    public List<Vuelo> ListadoDeVuelosPorAerolinea(Aerolinea a) {
        return this.Vuelo.listadoDeVuelosPorAerolinea(a);
    }


    //Funcion para manejar la restriccion del numero de vuelo
    private String HandleNumeroVuelo(Vuelo alta) {
        String firstLetters = "";
        int validador = 0;
        for (String input: alta.getAerolinea().getNombreAereoLinea().split(" ")) {
            firstLetters += input.charAt(0);
            validador++;
        }
        if (validador < 2){
            String input = alta.getAerolinea().getNombreAereoLinea();
            firstLetters += input.charAt(1);
        }
        firstLetters = firstLetters+"-"+alta.getNumeroVuelo();
        return firstLetters;
    }

    public void MostrarMenuVuelo() {

        int opcion = vistaVuelo.menu();

        switch (opcion) {
            case 1:
                System.out.println("Alta de Vuelo ");
                System.out.println("\n");
                this.AltadeVuelo(this.vistaVuelo.AltadeVuelo());
                this.MostrarMenuVuelo();
                break;

            case 2:
                System.out.println("Baja de Vuelo \n");
                System.out.println("\n");
                this.BajadeVuelo(this.vistaVuelo.BajadeVuelo());
                this.MostrarMenuVuelo();
                break;

            case 3:
                System.out.println("Modificacion de Vuelo \n");
                System.out.println("\n");
                this.ModificaciondeVuelo(this.vistaVuelo.ModificaciondeVuelo());
                this.MostrarMenuVuelo();
                break;

            case 4:
                System.out.println("Consulta de Vuelo \n");
                System.out.println("\n");
                this.ConsultadeVuelo(this.vistaVuelo.ConsultadeVuelo());
                this.MostrarMenuVuelo();
                break;

            case 5:
                System.out.println("Listado de Vuelo \n");
                System.out.println("\n");
                this.vistaVuelo.ListadodeVuelo(this.ListadodeVuelo());
                this.MostrarMenuVuelo();
                break;

            case 6:
                System.out.println("Finalizar Ejecucion \n");

                break;

        }

    }



}
