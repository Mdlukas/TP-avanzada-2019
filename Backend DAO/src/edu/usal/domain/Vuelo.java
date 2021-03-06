package edu.usal.domain;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Vuelos")
public class Vuelo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDVuelos", unique = true)
    private int IDVuelo;

    @Basic
    @Column(name = "NUMvuelo")
    private String numeroVuelo;

	@Basic
	@Column(name = "CantAsientos")
    private int cantAsientos;

	@Basic
	@Column(name = "FechaHoraSalida")
    private Date fechaSalida;

	@Basic
	@Column(name = "FechaHoraLlegada")
    private Date fechaLlegada;

	@Basic
	@Column(name = "TiempoVuelo")
    private String tiempovuelo;

	@ManyToOne
	@JoinColumn(name = "idAeropuertoSalida")
    private Aeropuerto aeropuertodeSalida;

	@ManyToOne
	@JoinColumn(name = "idAeropuertoLlegada")
    private Aeropuerto aeropuertodeLlegada;

	@ManyToOne
	@JoinColumn(name = "idLineaAerea")
    private Aerolinea aerolinea;



    public Vuelo() {
    }

    public Vuelo(int idvuelo) {
        IDVuelo = idvuelo;
    }


    public Vuelo(int iDVuelo,
				 Date fechaSalida,
				 Date fechaLLegada,
                 String tiempovuelo,
				 Aeropuerto aeropuertodeSalida,
				 Aeropuerto aeropuertodeLLegada,
				 Aerolinea aerolinea) {
        super();
        IDVuelo = iDVuelo;
        this.fechaSalida = fechaSalida;
        this.fechaLlegada = fechaLLegada;
        this.tiempovuelo = tiempovuelo;
        this.aeropuertodeSalida = aeropuertodeSalida;
        this.aeropuertodeLlegada = aeropuertodeLLegada;
        this.aerolinea = aerolinea;
    }


    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(String numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public Aeropuerto getAeropuertodeSalida() {
        return aeropuertodeSalida;
    }

    public void setAeropuertodeSalida(Aeropuerto aeropuertodeSalida) {
        this.aeropuertodeSalida = aeropuertodeSalida;
    }

    public Aeropuerto getAeropuertodeLLegada() {
        return aeropuertodeLlegada;
    }

    public void setAeropuertodeLLegada(Aeropuerto aeropuertodeLLegada) {
        this.aeropuertodeLlegada = aeropuertodeLLegada;
    }

    public Aerolinea getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(Aerolinea aerolinea) {
        this.aerolinea = aerolinea;
    }

    public int getIDVuelo() {
        return IDVuelo;
    }

    public void setIDVuelo(int iDVuelo) {
        IDVuelo = iDVuelo;
    }


    public int getCantAsientos() {
        return cantAsientos;
    }


    public void setCantAsientos(int cantAsientos) {
        this.cantAsientos = cantAsientos;
    }


    public Date getFechaSalida() {
        return fechaSalida;
    }


    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }


    public Date getFechaLLegada() {
        return fechaLlegada;
    }


    public void setFechaLLegada(Date fechaLLegada) {
        this.fechaLlegada = fechaLLegada;
    }


    public String getTiempovuelo() {
        return tiempovuelo;
    }


    public void setTiempovuelo(String tiempovuelo) {
        this.tiempovuelo = tiempovuelo;
    }

	@Override
	public String toString() {
		return "Vuelo{" +
				"IDVuelo=" + IDVuelo +
                ", numVuelo " + numeroVuelo +
				", cantAsientos=" + cantAsientos +
				", fechaSalida=" + fechaSalida +
				", fechaLlegada=" + fechaLlegada +
				", tiempovuelo='" + tiempovuelo + '\'' +
				", aeropuertodeSalida=" + aeropuertodeSalida.getCodigodeAeropuerto() +
				", aeropuertodeLlegada=" + aeropuertodeLlegada.getCodigodeAeropuerto() +
				", aerolinea=" + aerolinea.getNombreAereoLinea() +
				'}';
	}
}
