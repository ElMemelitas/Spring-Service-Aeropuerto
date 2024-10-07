package edu.mx.lasalle.oaxaca.servicio.aeropuerto.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "estudiante")
public class Estudiante {
    @Id
    @Column(name = "curp")
    private String curp;

    @NotNull
    @Column(name = "apellidos")
    private String apellidos;

    @NotNull
    @Column(name = "nombre")
    private String nombre;

    @ManyToMany(fetch = FetchType.LAZY, 
        cascade ={
            CascadeType.PERSIST,
            CascadeType.MERGE
            })
    @JoinTable(name = "estudiante_curso",
        joinColumns = @JoinColumn(name = "curp"),
        inverseJoinColumns = @JoinColumn(name = "clave_curso"))
        private Set<Curso> estudiante_curso= new HashSet<>();
}
