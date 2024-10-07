package edu.mx.lasalle.oaxaca.servicio.aeropuerto.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.sql.Time;

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
    private Time tiempoRestantePiloto;


    @OneToOne
    @JoinColumn(name="idTripulacion")
    @OnDelete(action=OnDeleteAction.CASCADE)
    private TripulacionModel idTripulacion;
}
