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
    private String idTerminal;

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
}
