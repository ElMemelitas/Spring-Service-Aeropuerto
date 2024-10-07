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
}
