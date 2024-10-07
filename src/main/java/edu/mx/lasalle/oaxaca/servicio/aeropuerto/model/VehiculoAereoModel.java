package edu.mx.lasalle.oaxaca.servicio.aeropuerto.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;


@Entity
@Table(name = "vehiculoAereo")
public class VehiculoAereoModel {
    @Id
    @GeneratedValue (strategy= GenerationType.SEQUENCE)
    
    @Column(name="idVehiculoAereo")
    private int idVehiculoAereo;
    
    @Column(name="matricula")
    @NotNull
    private String matricula;
    
    @Column(name="serie")
    @NotNull
    private String serie;
    
    @Column(name="capacidad")
    @NotNull
    private int capacidad;

    @Column(name="color")
    @NotNull
    private String color;

    @Column(name="estado")
    @NotNull
    private boolean estado;

    @Column(name="antiguedad")
    @NotNull
    private String antiguedad;

    @Column(name="tiempoAire")
    @NotNull
    private double tiempoAire;

    @Column(name="llantas")
    @NotNull
    private int llantas;

    @Column(name="tanque")
    @NotNull
    private String tanque;

    @Column(name="distancia")
    @NotNull
    private double distancia;

    

    public VehiculoAereoModel(int idVehiculoAereo, @NotNull String matricula, @NotNull String serie,
            @NotNull int capacidad, @NotNull String color, @NotNull boolean estado, @NotNull String antiguedad,
            @NotNull double tiempoAire, @NotNull int llantas, @NotNull String tanque, @NotNull double distancia) {
        this.idVehiculoAereo = idVehiculoAereo;
        this.matricula = matricula;
        this.serie = serie;
        this.capacidad = capacidad;
        this.color = color;
        this.estado = estado;
        this.antiguedad = antiguedad;
        this.tiempoAire = tiempoAire;
        this.llantas = llantas;
        this.tanque = tanque;
        this.distancia = distancia;
    }

    

    public VehiculoAereoModel() {
    }



    public int getIdVehiculoAereo() {
        return idVehiculoAereo;
    }

    public void setIdVehiculoAereo(int idVehiculoAereo) {
        this.idVehiculoAereo = idVehiculoAereo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(String antiguedad) {
        this.antiguedad = antiguedad;
    }

    public double getTiempoAire() {
        return tiempoAire;
    }

    public void setTiempoAire(double tiempoAire) {
        this.tiempoAire = tiempoAire;
    }

    public int getLlantas() {
        return llantas;
    }

    public void setLlantas(int llantas) {
        this.llantas = llantas;
    }

    public String getTanque() {
        return tanque;
    }

    public void setTanque(String tanque) {
        this.tanque = tanque;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    
}
