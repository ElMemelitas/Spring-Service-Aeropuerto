package edu.mx.lasalle.oaxaca.servicio.aeropuerto.model;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "helicoptero")
public class HelicopteroModel {
    @Id
    @GeneratedValue (strategy= GenerationType.SEQUENCE)
    
    @Column(name="idHelicoptero")
    private int idHelicoptero;

    @Column(name="numeroHelices")
    @NotNull
    private int numeroHelices;
    
    @Column(name="tipoHelicoptero")
    @NotNull
    private String tipoHelicoptero;
    
    @OneToOne
    @JoinColumn(name="idVehiculoAereo")
    @OnDelete(action=OnDeleteAction.CASCADE)
    private VehiculoAereoModel idVehiculoAereo;

    public HelicopteroModel(int numeroHelices, String tipoHelicoptero, VehiculoAereoModel idVehiculoAereo) {
        this.numeroHelices = numeroHelices;
        this.tipoHelicoptero = tipoHelicoptero;
        this.idVehiculoAereo = idVehiculoAereo;
    }

    public HelicopteroModel() {
    }

    public int getNumeroHelices() {
        return numeroHelices;
    }

    public void setNumeroHelices(int numeroHelices) {
        this.numeroHelices = numeroHelices;
    }

    public String getTipoHelicoptero() {
        return tipoHelicoptero;
    }

    public void setTipoHelicoptero(String tipoHelicoptero) {
        this.tipoHelicoptero = tipoHelicoptero;
    }

    public VehiculoAereoModel getIdVehiculoAereo() {
        return idVehiculoAereo;
    }

    public void setIdVehiculoAereo(VehiculoAereoModel idVehiculoAereo) {
        this.idVehiculoAereo = idVehiculoAereo;
    }

    
}
