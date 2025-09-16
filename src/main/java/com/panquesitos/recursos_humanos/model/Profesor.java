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
        private  String apellidoPaterno;

        @Column(nullable = false)
        private String apellidoMaterno;

        @Column(nullable = false, unique = true)
        private String correo;

        @Column(nullable = false)
        private String contrasena;

    // Relación con Materia
    @ManyToOne
    @JoinColumn(name = "id_materia")
    private Materia materia;



    // Constructor vacío
        public Profesor() {}

        // Constructor con parámetros
        public Profesor(String nombre, String correo, String contrasena, String apellidoPaterno, String apellidoMaterno, Materia materia) {
            this.nombre = nombre;
            this.apellidoPaterno = apellidoPaterno;
            this.apellidoMaterno = apellidoMaterno;
            this.correo = correo;
            this.contrasena = contrasena;
            this.materia = materia;
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
        public String getApellidoPaterno() {
            return apellidoPaterno;
        }
        public void setApellidoPaterno(String apellidoPaterno) {
            this.apellidoPaterno = apellidoPaterno;
        }
        public String getApellidoMaterno() {
            return apellidoMaterno;
        }
        public void setApellidoMaterno(String apellidoMaterno) {
            this.apellidoMaterno = apellidoMaterno;
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
        public Materia getMateria() {
            return materia;
        }
        public void setMateria(Materia materia) {
            this.materia = materia;
        }



    }


