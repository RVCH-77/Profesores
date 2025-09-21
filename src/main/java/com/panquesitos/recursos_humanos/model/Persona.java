package com.panquesitos.recursos_humanos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import java.time.LocalDate;
@Entity // representa una tabla en la base de datos
@Table(name = "empleado") // tabla

public class Persona {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY) // llave primaria autoincrementable
        @Column(name = "id_empleado")
        private Long idEmpleado;

        @Column(nullable = false)
        private String numeroEmpleado;
        @Column(nullable = false)
        private String nombre;

        @Column(nullable = false)
        private  String apellidoPaterno;

        @Column(nullable = false)
        private String apellidoMaterno;

        @Column(nullable = false, unique = true)
        private String usuario;

        @Column(nullable = false)
        private String contrasena;

    // Relación con Materia
    @ManyToOne
    @JoinColumn(name = "id_rol")
    private Rol rol;

}
