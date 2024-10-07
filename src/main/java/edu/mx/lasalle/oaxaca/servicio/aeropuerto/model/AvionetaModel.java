package edu.mx.lasalle.oaxaca.servicio.aeropuerto.model;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "avioneta")
public class AvionetaModel {
    @Id
    @GeneratedValue (strategy= GenerationType.SEQUENCE)
    
    @Column(name="idAvioneta")
    private int idAvioneta;

    @Column(name="numeroMotores")
    @NotNull
    private int numeroMotores;
    
    @Column(name="tipoPista")
    @NotNull
    private String tipoPista;

    @Column(name="clasificacion")
    @NotNull
    private String clasificacion;

    @Column(name="tipoConcesion")
    @NotNull
    private String tipoConcesion;
    
    @OneToOne
    @JoinColumn(name="idVehiculoAereo")
    @OnDelete(action=OnDeleteAction.CASCADE)
    private VehiculoAereoModel idVehiculoAereo;

    public AvionetaModel(int numeroMotores, String tipoPista, String clasificacion, String tipoConcesion, VehiculoAereoModel idVehiculoAereo) {
        this.numeroMotores = numeroMotores;
        this.tipoPista = tipoPista;
        this.clasificacion = clasificacion;
        this.tipoConcesion = tipoConcesion;
        this.idVehiculoAereo = idVehiculoAereo;
    }

    public AvionetaModel() {
    }

    public int getIdAvioneta() {
        return idAvioneta;
    }

    public void setIdAvioneta(int idAvioneta) {
        this.idAvioneta = idAvioneta;
    }

    public int getNumeroMotores() {
        return numeroMotores;
    }

    public void setNumeroMotores(int numeroMotores) {
        this.numeroMotores = numeroMotores;
    }

    public String getTipoPista() {
        return tipoPista;
    }

    public void setTipoPista(String tipoPista) {
        this.tipoPista = tipoPista;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getTipoConcesion() {
        return tipoConcesion;
    }

    public void setTipoConcesion(String tipoConcesion) {
        this.tipoConcesion = tipoConcesion;
    }

    public VehiculoAereoModel getIdVehiculoAereo() {
        return idVehiculoAereo;
    }

    public void setIdVehiculoAereo(VehiculoAereoModel idVehiculoAereo) {
        this.idVehiculoAereo = idVehiculoAereo;
    }



    
}
