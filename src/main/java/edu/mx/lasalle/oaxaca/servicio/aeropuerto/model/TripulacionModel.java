package edu.mx.lasalle.oaxaca.servicio.aeropuerto.model;

import java.sql.Date;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "tripulacion")
public class TripulacionModel {
    @Id
    @GeneratedValue (strategy= GenerationType.SEQUENCE)
    
    @Column(name="idTripulacion")
    private int idTripulacion;
    
    @Column(name="antiguedad")
    @NotNull
    private int antiguedad;
    
    @Column(name="turno")
    @NotNull
    private String turno;
    
    @Column(name="horasVuelo")
    @NotNull
    private double horasVuelo;

    @Column(name="nombre")
    @NotNull
    private String nombre;

    @Column(name="fechaNac")
    @NotNull
    private Date fechaNac;

    @Column(name="genero")
    @NotNull
    private String genero;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "idVuelo", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private VueloModel idVuelo;
}
