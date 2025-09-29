package com.panquesitos.profesores.controller;

import com.panquesitos.profesores.model.Calificaciones;
import com.panquesitos.profesores.service.ServiceCalificacion;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/calificaciones")
public class ControllerCalificacion {
    private final ServiceCalificacion calificacionService;

    //listado de todas las calificaciones
    @GetMapping
    public List<Calificaciones> todas() {
        return calificacionService.consultarTodas();
    }

    public ControllerCalificacion(ServiceCalificacion calificacionService) {
        this.calificacionService = calificacionService;
    }

    @PostMapping("/subir")
    public Calificaciones subir(@RequestBody Calificaciones calificacion) {
        return calificacionService.subirCalificacion(calificacion);
    }

    @GetMapping("/profesor/{idEmpleado}")
    public List<Calificaciones> porProfesor(@PathVariable Long idEmpleado) {
        return calificacionService.consultarPorProfesor(idEmpleado);
    }

    @GetMapping("/alumno/{idAlumno}")
    public List<Calificaciones> porAlumno(@PathVariable Long idAlumno) {
        return calificacionService.consultarPorAlumno(idAlumno);
    }
    @GetMapping("/materia/{idMateria}")
    public List<Calificaciones> porMateria(@PathVariable Long idMateria) {
        return calificacionService.consultarPorMateria(idMateria);
    }

    @GetMapping("/grupo/{idGrupo}")
    public List<Calificaciones> porGrupo(@PathVariable Long idGrupo) {
        return calificacionService.consultarPorGrupo(idGrupo);
    }


}
