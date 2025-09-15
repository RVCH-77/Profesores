package com.panquesitos.recursos_humanos.model;

import jakarta.persistence.*;
import java.time.LocalDate;
@Entity // representa una tabla en la base de datos
@Table(name = "profesores")
public class Profesor {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id_profesor")
        private Long idProfesor;

        @Column(nullable = false)
        private String nombre;

        @Column(nullable = false, unique = true)
        private String correo;

        @Column(nullable = false)
        private String contrasena;

        @Column(name = "fecha_registro", nullable = false)
        private LocalDate fechaRegistro;

        // Constructor vacío
        public Profesor() {}

        // Constructor con parámetros
        public Profesor(String nombre, String correo, String contrasena, LocalDate fechaRegistro) {
            this.nombre = nombre;
            this.correo = correo;
            this.contrasena = contrasena;
            this.fechaRegistro = fechaRegistro;
        }

        // Getters y Setters
        public Long getIdProfesor() {
            return idProfesor;
        }

        public void setIdProfesor(Long idProfesor) {
            this.idProfesor = idProfesor;
        }

        public String getNombre() {
            return this.nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getCorreo() {
            return this.correo;
        }

        public void setCorreo(String correo) {
            this.correo = correo;
        }

        public String getContrasena() {
            return this.contrasena;
        }

        public void setContrasena(String contrasena) {
            this.contrasena = contrasena;
        }

        public LocalDate getFechaRegistro() {
            return fechaRegistro;
        }

        public void setFechaRegistro(LocalDate fechaRegistro) {
            this.fechaRegistro = fechaRegistro;
        }
    }


