package com.panquesitos.recursos_humanos.model;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Entity
@Table(name = "materias")
@Getter
@Setter
public class Materia {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer idMateria;

        @Column(nullable = false, unique = true)
        private String nombre;
    }


