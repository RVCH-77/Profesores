package com.panquesitos.recursos_humanos.model;

import jakarta.persistence.*;
import java.time.LocalDate;
@Entity // representa una tabla en la base de datos
@Table(name = "profesores") // tabla
public class Profesor {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY) // llave primaria autoincrementable
        @Column(name = "id_profesor")
        private Long idProfesor;

        @Column(nullable = false)
        private String nombre;

        @Column(nullable = false)
        private  String apellido_paterno;

        @Column(nullable = false)
        private String apellido_materno;

        @Column(nullable = false, unique = true)
        private String correo;

        @Column(nullable = false)
        private String contrasena;



    // Constructor vacío
        public Profesor() {}

        // Constructor con parámetros
        public Profesor(String nombre, String correo, String contrasena, String apellido_paterno, String apellido_materno) {
            this.nombre = nombre;
            this.apellido_paterno = apellido_paterno;
            this.apellido_materno = apellido_materno;
            this.correo = correo;
            this.contrasena = contrasena;
        }

        // Getters y Setters
        public Long getIdProfesor() {
            return idProfesor;
        }

        public void setIdProfesor(Long idProfesor) {
            this.idProfesor = idProfesor;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public String getApellido_paterno() {
            return apellido_paterno;
        }
        public void setApellido_paterno(String apellido_paterno) {
            this.apellido_paterno = apellido_paterno;
        }
        public String getApellido_materno() {
            return apellido_materno;
        }
        public void setApellido_materno(String apellido_materno) {
            this.apellido_materno = apellido_materno;
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


    }


