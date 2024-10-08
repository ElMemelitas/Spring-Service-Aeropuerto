package edu.mx.lasalle.oaxaca.servicio.aeropuerto.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
/**
 *
 * @author david
 */

@Entity 
@Table(name = "pasajero")

public class PasajeroModel {
    @Id
    @GeneratedValue (strategy= GenerationType.SEQUENCE)
    
    @Column(name="idPasajero")
    private int idPasajero;

    @Column(name="nombre")
    @NotNull
    private String nombre;

    @Column(name="apellidos")
    @NotNull
    private String apellidos;

    @Column(name="direccion")
    @NotNull
    private String direccion;

    @Column(name="fechaNac")
    @NotNull
    private LocalDate fechaNac;
    
    @Column(name="discapacidad")
    @NotNull
    private boolean discapacidad;

    @Column(name="nacionalidad")
    @NotNull
    private String nacionalidad;

    public PasajeroModel(int idPasajero, @NotNull String nombre, @NotNull String apellidos, @NotNull String direccion,
            @NotNull LocalDate fechaNac, @NotNull boolean discapacidad, @NotNull String nacionalidad) {
        this.idPasajero = idPasajero;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.fechaNac = fechaNac;
        this.discapacidad = discapacidad;
        this.nacionalidad = nacionalidad;
    }

    public PasajeroModel() {
    }

    public int getIdPasajero() {
        return idPasajero;
    }

    public void setIdPasajero(int idPasajero) {
        this.idPasajero = idPasajero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public boolean isDiscapacidad() {
        return discapacidad;
    }

    public void setDiscapacidad(boolean discapacidad) {
        this.discapacidad = discapacidad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "PasajeroModel [idPasajero=" + idPasajero + ", nombre=" + nombre + ", apellidos=" + apellidos
                + ", direccion=" + direccion + ", fechaNac=" + fechaNac + ", discapacidad=" + discapacidad
                + ", nacionalidad=" + nacionalidad + "]";
    }

    
}

