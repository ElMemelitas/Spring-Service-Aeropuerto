package edu.mx.lasalle.oaxaca.servicio.aeropuerto.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "copiloto")
public class CopilotoModel {
    @Id
    @GeneratedValue (strategy= GenerationType.SEQUENCE)
    
    @Column(name="idCopiloto")
    private int idCopiloto;

    @Column(name="rango")
    @NotNull
    private String rango;

    @Column(name="tiempoRestantePiloto")
    @NotNull
    private String tiempoRestantePiloto;


    @OneToOne
    @JoinColumn(name="idTripulacion")
    @OnDelete(action=OnDeleteAction.CASCADE)
    private TripulacionModel idTripulacion;

    public CopilotoModel(String rango, String tiempoRestantePiloto, TripulacionModel idTripulacion) {
        this.rango = rango;
        this.tiempoRestantePiloto = tiempoRestantePiloto;
        this.idTripulacion = idTripulacion;
    }

    public CopilotoModel() {
    }

    public int getIdCopiloto() {
        return idCopiloto;
    }

    public void setIdCopiloto(int idCopiloto) {
        this.idCopiloto = idCopiloto;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public String getTiempoRestantePiloto() {
        return tiempoRestantePiloto;
    }

    public void setTiempoRestantePiloto(String tiempoRestantePiloto) {
        this.tiempoRestantePiloto = tiempoRestantePiloto;
    }

    public TripulacionModel getIdTripulacion() {
        return idTripulacion;
    }

    public void setIdTripulacion(TripulacionModel idTripulacion) {
        this.idTripulacion = idTripulacion;
    }

    
}
