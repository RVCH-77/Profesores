package com.panquesitos.recursos_humanos.controllador;

import com.panquesitos.recursos_humanos.model.Profesor;
import com.panquesitos.recursos_humanos.service.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/profesores")
public class ControllerPorfesor {

    @Autowired
    private ProfesorService service;

    @GetMapping
    public List<Profesor> getAll() {
        return service.getAllProfesores();
    }

    @PostMapping
    public ResponseEntity<Profesor> crear(@RequestBody Profesor profesor) {
        Profesor creado = service.registrarProfesor(profesor);
        return ResponseEntity.status(HttpStatus.CREATED).body(creado);
    }

    @PostMapping("/login")
    public ResponseEntity<Profesor> login(@RequestBody Map<String, String> body) {
        String correo = body.get("correo");
        String contrasena = body.get("contrasena");
        Optional<Profesor> op = service.login(correo, contrasena);
        return op.map(ResponseEntity::ok)
                .orElse(ResponseEntity.status(HttpStatus.UNAUTHORIZED).build());
    }

    @PutMapping("/{id}/password")
    public ResponseEntity<Profesor> cambiarPassword(@PathVariable Long id, @RequestBody Map<String, String> body) {
        String nueva = body.get("contrasena");
        Optional<Profesor> op = service.cambiarContrasena(id, nueva);
        return op.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }
}
