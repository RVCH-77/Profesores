package com.panquesitos.recursos_humanos.model;


import jakarta.persistence.*;

@Entity
@Table(name = "rol")
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // llave primaria autoincrementable
    @Column(name = "id_rol")
    private int idRol;

     @Column(name = "nombre") // nombre de la columna en la BD
    private String nombre;

    // Constructor vacío
    public Rol() {}
    // Constructor con parámetros
    public Rol(String nombre) {
        this.nombre = nombre;
    }
    // Getters y Setters
    public int getIdRol() {
        return idRol;

    }
    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombreRol(String nombre) {
        this.nombre = nombre;
    }


}
