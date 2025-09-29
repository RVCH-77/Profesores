package com.panquesitos.profesores.service;

import com.panquesitos.profesores.model.Calificaciones;
import com.panquesitos.profesores.repository.CalificacionRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ServiceCalificacion {
    private final CalificacionRepository calificacionRepository;

    public ServiceCalificacion(CalificacionRepository calificacionRepository) {
        this.calificacionRepository = calificacionRepository;
    }

    public Calificaciones subirCalificacion(Calificaciones calificacion) {
        calificacion.setFecha(LocalDate.now());
        return calificacionRepository.save(calificacion);
    }

    public List<Calificaciones> consultarPorProfesor(Long idEmpleado) {
        return calificacionRepository.findByIdEmpleado(idEmpleado);
    }

    public List<Calificaciones> consultarPorAlumno(Long idAlumno) {
        return calificacionRepository.findByIdAlumno(idAlumno);
    }

    //listado por materia
    public List<Calificaciones> consultarPorMateria(Long idMateria) {
        return calificacionRepository.findByIdMateria(idMateria);
    }
    //listado por grupo
    public List<Calificaciones> consultarPorGrupo(Long idGrupo) {
        return calificacionRepository.findByIdGrupo(idGrupo);
    }
    //listado de todas las calificaciones
    public List<Calificaciones> consultarTodas() {
        return calificacionRepository.findAll();}


}
