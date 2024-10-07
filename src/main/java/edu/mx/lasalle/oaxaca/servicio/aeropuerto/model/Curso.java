package edu.mx.lasalle.oaxaca.servicio.aeropuerto.model;

import java.util.Set;
import java.util.HashSet;
import jakarta.persistence.*;

@Entity
@Table(name = "curso")
public class Curso {
    @Id
    @Column(name = "clave_curso")
    private String clave_curso;

    @Column(name = "nombre")
    private String nombre;

    @ManyToMany(fetch = FetchType.LAZY, 
        cascade ={
            CascadeType.PERSIST,
            CascadeType.MERGE
            }, mappedBy = "estudiante_curso")
        private Set<Estudiante> estudiantes = new HashSet<>();
}
