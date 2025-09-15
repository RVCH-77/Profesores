package com.panquesitos.recursos_humanos.controllador;

import com.panquesitos.recursos_humanos.model.Profesor;
import com.panquesitos.recursos_humanos.service.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/profesores")
public class ControllerPorfesor {
    @Autowired
    private ProfesorService profesorService;

    // Inyectar el repositorio directamente para obtener todos los profesores
    @GetMapping
    public List<Profesor> getAll() {
        return profesorService.getAllProfesores();
    }

    // Registrar profesor
    @PostMapping
    public ResponseEntity<Profesor> registrar(@RequestBody Profesor profesor) {
        Profesor guardado = profesorService.registrarProfesor(profesor);
        return ResponseEntity.ok(guardado);
    }

    // Login básico (solo busca por correo)
    @GetMapping("/login")
    public ResponseEntity<Profesor> login(@RequestParam String correo) {
        Optional<Profesor> profesor = profesorService.login(correo);
        return profesor.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
