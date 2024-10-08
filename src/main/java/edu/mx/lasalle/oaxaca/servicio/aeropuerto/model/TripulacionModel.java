package edu.mx.lasalle.oaxaca.servicio.aeropuerto.model;

import java.time.LocalDate;

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
    private LocalDate fechaNac;

    @Column(name="genero")
    @NotNull
    private String genero;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "idVuelo", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private VueloModel idVuelo;

    public TripulacionModel(int antiguedad, String turno, double horasVuelo, String nombre, LocalDate fechaNac, String genero, VueloModel idVuelo) {
        this.antiguedad = antiguedad;
        this.turno = turno;
        this.horasVuelo = horasVuelo;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.genero = genero;
        this.idVuelo = idVuelo;
    }

    public TripulacionModel() {
    }

    public int getIdTripulacion() {
        return idTripulacion;
    }

    public void setIdTripulacion(int idTripulacion) {
        this.idTripulacion = idTripulacion;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getHorasVuelo() {
        return horasVuelo;
    }

    public void setHorasVuelo(double horasVuelo) {
        this.horasVuelo = horasVuelo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public VueloModel getIdVuelo() {
        return idVuelo;
    }

    public void setIdVuelo(VueloModel idVuelo) {
        this.idVuelo = idVuelo;
    }

    
}
