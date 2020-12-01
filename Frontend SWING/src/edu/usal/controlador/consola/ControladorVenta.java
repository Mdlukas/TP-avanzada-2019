package edu.usal.controlador.consola;

import edu.usal.dao.factory.FactoryVenta;
import edu.usal.dao.interfaces.VentaDAO;
import edu.usal.domain.Venta;
import edu.usal.vista.consola.VistaVenta;

import java.util.List;

public class ControladorVenta {

    private VistaVenta vistaVenta;
    private VentaDAO Venta;


    public ControladorVenta(VistaVenta vista) {
        this.vistaVenta = vista;
        try {
            this.Venta = FactoryVenta.GetVentaImplementacion();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ControladorVenta() {
        try {
            this.Venta = FactoryVenta.GetVentaImplementacion();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean AltadeVenta(Venta Alta) {
        return this.Venta.AltadeVenta(Alta);
    }

    public List<Venta> ListadodeVenta() {
        return this.Venta.listadodeVentas();
    }


    public Venta ConsultadeVenta(Venta Obtener) {
        return this.Venta.ObtenerVenta(Obtener);
    }

    public boolean BajadeVenta(Venta Baja) {
        return this.Venta.BajadeVenta(Baja);
    }

    public boolean ModificaciondeVenta(Venta Modificacion) {
        return this.Venta.ModificaciondeVenta(Modificacion);
    }


    public void MostrarMenuVenta() {
        int opcion = vistaVenta.menu();
        switch (opcion) {
            case 1:
                System.out.println("Alta de Venta ");
                System.out.println("\n");
                this.AltadeVenta(this.vistaVenta.AltadeVenta());
                this.MostrarMenuVenta();
                break;

            case 2:
                System.out.println("Baja de Venta \n");
                System.out.println("\n");
                this.BajadeVenta(this.vistaVenta.BajadeVenta());
                this.MostrarMenuVenta();
                break;

            case 3:
                System.out.println("Modificacion de Venta \n");
                System.out.println("\n");
                this.ModificaciondeVenta(this.vistaVenta.ModificaciondeVenta());
                this.MostrarMenuVenta();
                break;

            case 4:
                System.out.println("Consulta de Venta \n");
                System.out.println("\n");
                this.ConsultadeVenta(this.vistaVenta.ConsultadeVenta());
                this.MostrarMenuVenta();
                break;

            case 5:
                System.out.println("Listado de Venta \n");
                System.out.println("\n");
                this.vistaVenta.ListadodeVenta(this.ListadodeVenta());
                this.MostrarMenuVenta();
                break;

            case 6:
                System.out.println("Finalizar Ejecucion \n");
                break;
        }

    }


}
