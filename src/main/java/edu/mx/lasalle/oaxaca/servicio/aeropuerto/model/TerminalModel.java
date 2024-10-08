package edu.mx.lasalle.oaxaca.servicio.aeropuerto.model;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "terminal")
public class TerminalModel {
    @Id
    @GeneratedValue (strategy= GenerationType.SEQUENCE)
    
    @Column(name="idTerminal")
    private int idTerminal;

    @Column(name="capacidad")
    @NotNull
    private int capacidad;

    @Column(name="disponible")
    @NotNull
    private boolean disponible;

    @OneToOne
    @JoinColumn(name="idAeropuerto")
    @OnDelete(action=OnDeleteAction.CASCADE)
    private AeropuertoModel idAeropuerto;

    public TerminalModel(int capacidad, boolean disponible, AeropuertoModel idAeropuerto) {
        this.capacidad = capacidad;
        this.disponible = disponible;
        this.idAeropuerto = idAeropuerto;
    }

    public TerminalModel() {
    }

    public int getIdTerminal() {
        return idTerminal;
    }

    public void setIdTerminal(int idTerminal) {
        this.idTerminal = idTerminal;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public AeropuertoModel getIdAeropuerto() {
        return idAeropuerto;
    }

    public void setIdAeropuerto(AeropuertoModel idAeropuerto) {
        this.idAeropuerto = idAeropuerto;
    }

    
}
