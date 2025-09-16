package com.panquesitos.profesores.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "calificaciones")
public class Calificaciones {


    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY) // llave primaria
    @Column(name = "id_calificacion")
    private int idCalificacion;

    @Column(nullable = false)
    private int idProfesor;

    @Column (nullable = false)
    private int idGrupo;

    @Column(nullable = false)
    private int idAlumno;

    @Column(nullable = false)
    private int idMateria;

    @Column(nullable = false)
    private float calificacion;

    @Column(nullable = false)
    private LocalDate fecha;

    // Constructor vacío
    public Calificaciones() {}
    // Constructor con parámetros
    public Calificaciones(int idProfesor, int idAlumno, int idMateria, float calificacion, LocalDate fecha) {
        this.idProfesor = idProfesor;
        this.idAlumno = idAlumno;
        this.idMateria = idMateria;
        this.calificacion = calificacion;
        this.fecha = fecha;
    }
    // Getters y Setters
    public int getIdCalificacion() {
        return idCalificacion;
    }
    public void setIdCalificacion(int idCalificacion) {
        this.idCalificacion = idCalificacion;
    }
    public int getIdProfesor() {
        return idProfesor;

    }
    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }
    public int getIdGrupo() {
        return idGrupo;
    }
    public void setIdGrupo(int idGrupo) {
        this.idGrupo = idGrupo;
    }
    public int getIdAlumno() {
        return idAlumno;
    }
    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }
    public int getIdMateria() {
        return idMateria;
    }
    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }
    public float getCalificacion() {
        return calificacion;
    }
    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

}
