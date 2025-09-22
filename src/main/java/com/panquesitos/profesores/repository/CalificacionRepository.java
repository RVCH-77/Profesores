package com.panquesitos.profesores.repository;

import com.panquesitos.profesores.model.Calificaciones;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CalificacionRepository extends JpaRepository<Calificaciones, Long> {

    //Listar calificaciones por diferentes criterios
    List<Calificaciones> findByIdEmpleado(Long idEmpleado);
    List<Calificaciones> findByIdAlumno(Long idAlumno);
    List<Calificaciones> findByIdMateria(Long idMateria);
    List<Calificaciones> findByIdGrupo(Long idGrupo);

}
