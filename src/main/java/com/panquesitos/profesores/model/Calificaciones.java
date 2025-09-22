package com.panquesitos.profesores.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "calificaciones")
public class Calificaciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_calificacion")
    private Long idCalificacion;

    @Column(name = "id_empleado", nullable = false)
    private Long idEmpleado; // viene de RH

    @Column(name = "id_grupo", nullable = false)
    private Long idGrupo; // viene de Servicios Escolares

    @Column(name = "id_alumno", nullable = false)
    private Long idAlumno; // viene de Alumnos

    @Column(name = "id_materia", nullable = false)
    private Long idMateria; // viene de Servicios Escolares

    @Column(nullable = false)
    private Double calificacion;

    @Column(nullable = false)
    private LocalDate fecha;

    // Constructor vacío
    public Calificaciones() {}

    // Constructor con parámetros
    public Calificaciones(Long idEmpleado, Long idGrupo, Long idAlumno, Long idMateria, Double calificacion, LocalDate fecha) {
        this.idEmpleado = idEmpleado;
        this.idGrupo = idGrupo;
        this.idAlumno = idAlumno;
        this.idMateria = idMateria;
        this.calificacion = calificacion;
        this.fecha = fecha;
    }

    // Getters y Setters
    public Long getIdCalificacion() {
        return idCalificacion;
    }

    public void setIdCalificacion(Long idCalificacion) {
        this.idCalificacion = idCalificacion;
    }

    public Long getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Long idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Long getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(Long idGrupo) {
        this.idGrupo = idGrupo;
    }

    public Long getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(Long idAlumno) {
        this.idAlumno = idAlumno;
    }

    public Long getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(Long idMateria) {
        this.idMateria = idMateria;
    }

    public Double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Double calificacion) {
        this.calificacion = calificacion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
