package edu.mx.lasalle.oaxaca.servicio.aeropuerto.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "avion")
public class AvionModel {
    @Id
    @GeneratedValue (strategy= GenerationType.SEQUENCE)
    
    @Column(name="idAvion")
    private int idAvion;

    @Column(name="aerolinea")
    @NotNull
    private String aerolinea;
    
    @Column(name="tipoMotor")
    @NotNull
    private String tipoMotor;

    @Column(name="puertas")
    @NotNull
    private int puertas;

    @Column(name="tipoAvion")
    @NotNull
    private String tipoAvion;
    
    @OneToOne
    @JoinColumn(name="idVehiculoAereo")
    @OnDelete(action=OnDeleteAction.CASCADE)
    private VehiculoAereoModel idVehiculoAereo;


    public AvionModel(String aerolinea, String tipoMotor, int puertas, String tipoAvion, VehiculoAereoModel idVehiculoAereo) {
        this.aerolinea = aerolinea;
        this.tipoMotor = tipoMotor;
        this.puertas = puertas;
        this.tipoAvion = tipoAvion;
        this.idVehiculoAereo = idVehiculoAereo;
    }

    public AvionModel() {
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public String getTipoAvion() {
        return tipoAvion;
    }

    public void setTipoAvion(String tipoAvion) {
        this.tipoAvion = tipoAvion;
    }

    public VehiculoAereoModel getIdVehiculoAereo() {
        return idVehiculoAereo;
    }

    public void setIdVehiculoAereo(VehiculoAereoModel idVehiculoAereo) {
        this.idVehiculoAereo = idVehiculoAereo;
    }

    
}
