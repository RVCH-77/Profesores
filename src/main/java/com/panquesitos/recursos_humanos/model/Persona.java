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

    // Constructor vacío
        public Persona() {}

        // Constructor con parámetros
        public Persona(String numeroEmpleado, String nombre, String apellidoPaterno, String apellidoMaterno, String usuario, String contrasena, Rol rol) {
            this.numeroEmpleado = numeroEmpleado;
            this.nombre = nombre;
            this.apellidoPaterno = apellidoPaterno;
            this.apellidoMaterno = apellidoMaterno;
            this.usuario = usuario;
            this.contrasena = contrasena;
            this.rol = rol;
        }

        // Getters y Setters
        public Long getIdEmpleado() {
            return idEmpleado;
        }

        public void setIdEmpleado(Long idEmpleado) {
            this.idEmpleado = idEmpleado;
        }

        public String getNumeroEmpleado() {
            return numeroEmpleado;
        }

        public void setNumeroEmpleado(String numeroEmpleado) {
            this.numeroEmpleado = numeroEmpleado;
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
        public String getUsuario() {
            return usuario;
        }
        public void setUsuario(String usuario) {
            this.usuario = usuario;
        }
        public String getContrasena() {
            return contrasena;
        }
        public void setContrasena(String contrasena) {
            this.contrasena = contrasena;
        }
        public Rol getRol() {
            return rol;
        }
        public void setRol(Rol rol) {
            this.rol = rol;
        }


}
