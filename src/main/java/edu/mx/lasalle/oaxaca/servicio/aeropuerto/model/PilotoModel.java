package edu.mx.lasalle.oaxaca.servicio.aeropuerto.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "piloto")
public class PilotoModel {
    @Id
    @GeneratedValue (strategy= GenerationType.SEQUENCE)
    
    @Column(name="idPiloto")
    private int idPiloto;

    @Column(name="rango")
    @NotNull
    private String rango;

    @Column(name="licencia")
    @NotNull
    private String licencia;
    
    @Column(name="tipoAeronave")
    @NotNull
    private String tipoAeronave;

    @Column(name="saludMental")
    @NotNull
    private String saludMental;

    @OneToOne
    @JoinColumn(name="idTripulacion")
    @OnDelete(action=OnDeleteAction.CASCADE)
    private TripulacionModel idTripulacion;

    public PilotoModel(String rango, String licencia, String tipoAeronave, String saludMental, TripulacionModel idTripulacion) {
        this.rango = rango;
        this.licencia = licencia;
        this.tipoAeronave = tipoAeronave;
        this.saludMental = saludMental;
        this.idTripulacion = idTripulacion;
    }

    public PilotoModel() {
    }

    public int getIdPiloto() {
        return idPiloto;
    }

    public void setIdPiloto(int idPiloto) {
        this.idPiloto = idPiloto;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public String getTipoAeronave() {
        return tipoAeronave;
    }

    public void setTipoAeronave(String tipoAeronave) {
        this.tipoAeronave = tipoAeronave;
    }

    public String getSaludMental() {
        return saludMental;
    }

    public void setSaludMental(String saludMental) {
        this.saludMental = saludMental;
    }

    public TripulacionModel getIdTripulacion() {
        return idTripulacion;
    }

    public void setIdTripulacion(TripulacionModel idTripulacion) {
        this.idTripulacion = idTripulacion;
    }

    
}
