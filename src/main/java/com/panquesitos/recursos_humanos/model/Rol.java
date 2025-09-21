package com.panquesitos.recursos_humanos.model;


import jakarta.persistence.*;

@Entity
@Table(name = "rol")
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // llave primaria autoincrementable
    @Column(name = "id_rol")
    private Long idRol;
    @Column(nullable = false, unique = true)
    private String nombreRol;

    // Constructor vacío
    public Rol() {}
    // Constructor con parámetros
    public Rol(String nombreRol) {
        this.nombreRol = nombreRol;
    }
    // Getters y Setters
    public Long getIdRol() {
        return idRol;

    }
    public void setIdRol(Long idRol) {
        this.idRol = idRol;
    }
    public String getNombreRol() {
        return nombreRol;
    }
    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }

    
}
