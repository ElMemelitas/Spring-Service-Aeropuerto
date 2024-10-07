package edu.mx.lasalle.oaxaca.servicio.aeropuerto.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "sobrecargo")
public class SobrecargoModel {
    @Id
    @GeneratedValue (strategy= GenerationType.SEQUENCE)
    
    @Column(name="idSobrecargo")
    private int idSobrecargo;

    @Column(name="idiomas")
    @NotNull
    private String idiomas;

    @Column(name="certificados")
    @NotNull
    private String certificados;

    @OneToOne
    @JoinColumn(name="idTripulacion")
    @OnDelete(action=OnDeleteAction.CASCADE)
    private TripulacionModel idTripulacion;

    public SobrecargoModel(String idiomas, String certificados, TripulacionModel idTripulacion) {
        this.idiomas = idiomas;
        this.certificados = certificados;
        this.idTripulacion = idTripulacion;
    }

    public SobrecargoModel() {
    }

    public int getIdSobrecargo() {
        return idSobrecargo;
    }

    public void setIdSobrecargo(int idSobrecargo) {
        this.idSobrecargo = idSobrecargo;
    }

    public String getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String idiomas) {
        this.idiomas = idiomas;
    }

    public String getCertificados() {
        return certificados;
    }

    public void setCertificados(String certificados) {
        this.certificados = certificados;
    }

    public TripulacionModel getIdTripulacion() {
        return idTripulacion;
    }

    public void setIdTripulacion(TripulacionModel idTripulacion) {
        this.idTripulacion = idTripulacion;
    }

    
}
