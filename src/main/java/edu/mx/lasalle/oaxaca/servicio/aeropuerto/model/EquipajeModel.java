package edu.mx.lasalle.oaxaca.servicio.aeropuerto.model;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

/**
 *
 * @author david
 */

@Entity 
@Table(name = "equipaje")
public class EquipajeModel {
    @Id
    @GeneratedValue (strategy= GenerationType.SEQUENCE)
    
    @Column(name="idEquipaje")
    private int idEquipaje;

    @Column(name="peso")
    @NotNull
    private String peso;

    @Column(name="altura")
    @NotNull
    private String altura;

    @Column(name="tipo")
    @NotNull
    private String tipo;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "idPasajero", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private PasajeroModel idPasajero;

    public EquipajeModel(int idEquipaje, @NotNull String peso, @NotNull String altura, @NotNull String tipo,
            PasajeroModel idPasajero) {
        this.idEquipaje = idEquipaje;
        this.peso = peso;
        this.altura = altura;
        this.tipo = tipo;
        this.idPasajero = idPasajero;
    }

    public EquipajeModel() {
    }

    public int getIdEquipaje() {
        return idEquipaje;
    }

    public void setIdEquipaje(int idEquipaje) {
        this.idEquipaje = idEquipaje;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public PasajeroModel getIdPasajero() {
        return idPasajero;
    }

    public void setIdPasajero(PasajeroModel idPasajero) {
        this.idPasajero = idPasajero;
    }
    
    
}
