package com.panquesitos.profesores.controller;

import com.panquesitos.profesores.model.Calificaciones;
import com.panquesitos.profesores.service.ServiceCalificacion;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/calificaciones")
@CrossOrigin(origins = "*")
public class ControllerCalificacion {
    private final ServiceCalificacion calificacionService;


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
}
