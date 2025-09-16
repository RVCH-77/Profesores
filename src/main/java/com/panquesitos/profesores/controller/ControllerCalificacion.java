package com.panquesitos.profesores.controller;


import com.panquesitos.profesores.model.Calificaciones;
import com.panquesitos.profesores.service.ServiceCalificacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/calificaciones")
public class ControllerCalificacion {

@Autowired
private ServiceCalificacion service;

// Registrar calificación
    @PostMapping
    public Calificaciones registrar(@RequestBody Calificaciones calificacion) {
        return service.registrarCalificacion(calificacion);
    }

    // Listar todas las calificaciones
    @GetMapping
    public List<Calificaciones> listar() {
        return service.getAllCalificaciones();
    }

}
