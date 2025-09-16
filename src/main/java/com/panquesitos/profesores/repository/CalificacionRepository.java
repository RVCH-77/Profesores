package com.panquesitos.profesores.repository;

import com.panquesitos.profesores.model.Calificaciones;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CalificacionRepository {

    // Métodos personalizados opcionales
    List<Calificaciones> findByIdAlumno(int idAlumno);

    List<Calificaciones> findByIdProfesor(int idProfesor);

    List<Calificaciones> findByIdMateria(int idMateria);

    List<Calificaciones> findByIdGrupo(int idGrupo);
}
