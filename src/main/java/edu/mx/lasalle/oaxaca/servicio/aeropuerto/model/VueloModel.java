package edu.mx.lasalle.oaxaca.servicio.aeropuerto.model;

import java.sql.Time;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "vuelo")
public class VueloModel {
    @Id
    @GeneratedValue (strategy= GenerationType.SEQUENCE)
    
    @Column(name="idVuelo")
    private int idVuelo;

    @Column(name="origen")
    @NotNull
    private String origen;

    @Column(name="destino")
    @NotNull
    private String destino;

    @Column(name="duracion")
    @NotNull
    private Time duracion;
    
    @Column(name="horaSalida")
    @NotNull
    private String horaSalida;

    @Column(name="horaLlegada")
    @NotNull
    private String horaLlegada;

    @OneToOne
    @JoinColumn(name="idVehiculoAereo")
    @OnDelete(action=OnDeleteAction.CASCADE)
    private VehiculoAereoModel idVehiculoAereo;

    @OneToOne
    @JoinColumn(name="idTerminal")
    @OnDelete(action=OnDeleteAction.CASCADE)
    private TerminalModel idTerminal;

    public VueloModel(String origen, String destino, Time duracion, String horaSalida, String horaLlegada, VehiculoAereoModel idVehiculoAereo, TerminalModel idTerminal) {
        this.origen = origen;
        this.destino = destino;
        this.duracion = duracion;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.idVehiculoAereo = idVehiculoAereo;
        this.idTerminal = idTerminal;
    }

    public VueloModel() {
    }

    public int getIdVuelo() {
        return idVuelo;
    }

    public void setIdVuelo(int idVuelo) {
        this.idVuelo = idVuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Time getDuracion() {
        return duracion;
    }

    public void setDuracion(Time duracion) {
        this.duracion = duracion;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(String horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public VehiculoAereoModel getIdVehiculoAereo() {
        return idVehiculoAereo;
    }

    public void setIdVehiculoAereo(VehiculoAereoModel idVehiculoAereo) {
        this.idVehiculoAereo = idVehiculoAereo;
    }

    public TerminalModel getIdTerminal() {
        return idTerminal;
    }

    public void setIdTerminal(TerminalModel idTerminal) {
        this.idTerminal = idTerminal;
    }

    
}
