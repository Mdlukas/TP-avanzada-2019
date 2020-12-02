package edu.usal.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Ventas")
public class Venta {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDVenta", unique = true)
    private int IDVenta;

    @Basic
    @Column(name = "FechaDeVenta")
    private Date Fecha_HS_Venta;

    @Basic
    @Column(name = "FormaDePago")
    private String FormadePago;

    @Basic
    @Column(name = "Precio")
    private String precio;

    @Basic
    @Column(name = "Cuotas")
    private String cuotas;

    @ManyToOne
    @JoinColumn(name = "idCliente")
    private Cliente Cliente;

    @ManyToOne
    @JoinColumn(name = "idVuelo")
    private Vuelo Vuelo;




    public Venta() {
    }

    public Venta(int iDVenta, Date fecha_HS_Venta, String formadePago, edu.usal.domain.Cliente cliente,
                 Vuelo vuelo, edu.usal.domain.Aerolinea aerolinea) {
        super();
        IDVenta = iDVenta;
        Fecha_HS_Venta = fecha_HS_Venta;
        FormadePago = formadePago;
        Cliente = cliente;
        Vuelo = vuelo;
    }


    public int getIDVenta() {
        return IDVenta;
    }

    public void setIDVenta(int iDVenta) {
        IDVenta = iDVenta;
    }

    public Cliente getCliente() {
        return Cliente;
    }

    public void setCliente(Cliente cliente) {
        Cliente = cliente;
    }

    public Vuelo getVuelo() {
        return Vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        Vuelo = vuelo;
    }

    public Date getFecha_HS_Venta() {
        return Fecha_HS_Venta;
    }


    public void setFecha_HS_Venta(Date fecha_HS_Venta) {
        Fecha_HS_Venta = fecha_HS_Venta;
    }


    public String getFormadePago() {
        return FormadePago;
    }


    public void setFormadePago(String formadePago) {
        FormadePago = formadePago;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getCuotas() {
        return cuotas;
    }

    public void setCuotas(String cuotas) {
        this.cuotas = cuotas;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "IDVenta=" + IDVenta +
                ", Fecha_HS_Venta=" + Fecha_HS_Venta +
                ", FormadePago='" + FormadePago + '\'' +
                ", precio='" + precio + '\'' +
                ", cuotas='" + cuotas + '\'' +
                ", Cliente=" + Cliente +
                ", Vuelo=" + Vuelo +
                '}';
    }
}
