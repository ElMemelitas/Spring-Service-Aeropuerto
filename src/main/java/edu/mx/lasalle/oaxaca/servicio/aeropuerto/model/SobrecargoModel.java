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
}
