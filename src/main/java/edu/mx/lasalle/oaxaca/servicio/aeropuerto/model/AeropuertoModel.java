package edu.mx.lasalle.oaxaca.servicio.aeropuerto.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "aeropuerto")
public class AeropuertoModel {
    @Id
    @GeneratedValue (strategy= GenerationType.SEQUENCE)
    
    @Column(name="idAeropuerto")
    private int idAeropuerto;

    @Column(name="nombreAeropuerto")
    @NotNull
    private String nombreAeropuerto;

    @Column(name="numPistas")
    @NotNull
    private int numPistas;

    @Column(name="tipoAvion")
    @NotNull
    private String tipoAvion;

    public AeropuertoModel(int idAeropuerto, @NotNull String nombreAeropuerto, @NotNull int numPistas,
            @NotNull String tipoAvion) {
        this.idAeropuerto = idAeropuerto;
        this.nombreAeropuerto = nombreAeropuerto;
        this.numPistas = numPistas;
        this.tipoAvion = tipoAvion;
    }

    public AeropuertoModel() {
    }

    public int getIdAeropuerto() {
        return idAeropuerto;
    }

    public void setIdAeropuerto(int idAeropuerto) {
        this.idAeropuerto = idAeropuerto;
    }

    public String getNombreAeropuerto() {
        return nombreAeropuerto;
    }

    public void setNombreAeropuerto(String nombreAeropuerto) {
        this.nombreAeropuerto = nombreAeropuerto;
    }

    public int getNumPistas() {
        return numPistas;
    }

    public void setNumPistas(int numPistas) {
        this.numPistas = numPistas;
    }

    public String getTipoAvion() {
        return tipoAvion;
    }

    public void setTipoAvion(String tipoAvion) {
        this.tipoAvion = tipoAvion;
    }

    
}
