package edu.mx.lasalle.oaxaca.servicio.aeropuerto.model;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "boleto")
public class BoletoModel {
    @Id
    @GeneratedValue (strategy= GenerationType.SEQUENCE)
    
    @Column(name="idBoleto")
    private int idBoleto;

    @Column(name="asiento")
    @NotNull
    private String asiento;

    @Column(name="costo")
    @NotNull
    private double costo;

    @OneToOne
    @JoinColumn(name="idPasajero")
    @OnDelete(action=OnDeleteAction.CASCADE)
    private PasajeroModel idPasajero;

    @OneToOne
    @JoinColumn(name="idVuelo")
    @OnDelete(action=OnDeleteAction.CASCADE)
    private VueloModel idVuelo;

}
