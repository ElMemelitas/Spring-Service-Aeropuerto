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

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "idVuelo", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private VueloModel idVuelo;

    public BoletoModel(int idBoleto, @NotNull String asiento, @NotNull double costo, PasajeroModel idPasajero,
            VueloModel idVuelo) {
        this.idBoleto = idBoleto;
        this.asiento = asiento;
        this.costo = costo;
        this.idPasajero = idPasajero;
        this.idVuelo = idVuelo;
    }

    public BoletoModel() {
    }

    public int getIdBoleto() {
        return idBoleto;
    }

    public void setIdBoleto(int idBoleto) {
        this.idBoleto = idBoleto;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public PasajeroModel getIdPasajero() {
        return idPasajero;
    }

    public void setIdPasajero(PasajeroModel idPasajero) {
        this.idPasajero = idPasajero;
    }

    public VueloModel getIdVuelo() {
        return idVuelo;
    }

    public void setIdVuelo(VueloModel idVuelo) {
        this.idVuelo = idVuelo;
    }

    
}
