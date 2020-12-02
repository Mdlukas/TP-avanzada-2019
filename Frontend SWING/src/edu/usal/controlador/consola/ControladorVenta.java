package edu.usal.controlador.consola;

import edu.usal.dao.factory.FactoryVenta;
import edu.usal.dao.interfaces.VentaDAO;
import edu.usal.domain.Venta;
import edu.usal.util.DateHelper;
import edu.usal.vista.consola.VistaVenta;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
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

    public String AltadeVenta(Venta Alta) {
        if (this.ValidateAsientos(Alta)) {
            if (this.ValidateEdad(Alta)) {
                if(this.ValidarPasaportes(Alta)){
                    if (this.Venta.AltadeVenta(Alta)) {
                        return "La venta se guardo de forma correcta!";
                    } else {
                        return "No se pudo guardar, consulte la consola!";
                    }
                }
                return "El pasaporte no es valido! o La cantidad de meses entre el vuelo y el vencimiento es menor a 6!";
            }
            return "El cliente es muy joven para volar! (Menor de 18)";
        }
        return "No quedan asientos libres en ese vuelo!";
    }

    //Valido los pasaportes..
    private boolean ValidarPasaportes(Venta alta) {
        LocalDate fechaEmisionPasaporte = DateHelper.DateHelper(alta.getCliente().getPasaporte().getFechadeEmision());
        LocalDate fechaVenta = DateHelper.DateHelper(alta.getFecha_HS_Venta());
        LocalDate fechaVencimiento = DateHelper.DateHelper(alta.getCliente().getPasaporte().getFechadeVencimiento());
        LocalDate fechaLlegada = DateHelper.DateHelper(alta.getVuelo().getFechaLLegada());
        Period period = Period.between(fechaEmisionPasaporte,fechaVenta);
        int emisionAnteriorAVenta = period.getDays();
        long vencimientoMayor = ChronoUnit.MONTHS.between(fechaLlegada,fechaVencimiento);
        if (emisionAnteriorAVenta > 0 && vencimientoMayor > 6) {
            return true;
        } else {
            return false;
        }
    }

    //Valido que el pibito tenga porlomenos 18 años para volar.
    private boolean ValidateEdad(Venta alta) {
        LocalDate nacimientoCliente = DateHelper.DateHelper(alta.getCliente().getFechaNacimiento());
        LocalDate fechaVuelo = DateHelper.DateHelper(alta.getVuelo().getFechaSalida());
        Period period = Period.between(nacimientoCliente, fechaVuelo);
        int edad = period.getYears();
        System.out.println(edad);
        if (edad >= 18) {
            return true;
        } else {
            return false;
        }
    }

    //Valido que alcancen los sientos.
    private boolean ValidateAsientos(Venta alta) {
        int asientosLibres = alta.getVuelo().getCantAsientos();
        if (asientosLibres > 0) {
            alta.getVuelo().setCantAsientos(asientosLibres - 1);
            return true;
        } else {
            return false;
        }
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
