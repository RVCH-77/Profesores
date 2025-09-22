package com.panquesitos.profesores.controller;

import com.panquesitos.profesores.service.AuthService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "*") // permite pruebas desde Postman/Frontend
public class AuthController {
    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/login")
    public String login(@RequestBody Map<String, String> body) {
        Long idEmpleado = Long.valueOf(body.get("idEmpleado"));
        String password = body.get("password");
        boolean ok = authService.login(idEmpleado, password);
        return ok ? "Login correcto" : "Credenciales inválidas";
    }

    @PutMapping("/cambiar-contrasena")
    public String cambiarContrasena(@RequestBody Map<String, String> body) {
        Long idEmpleado = Long.valueOf(body.get("idEmpleado"));
        String nueva = body.get("nuevaContrasena");
        authService.cambiarContrasena(idEmpleado, nueva);
        return "Contraseña actualizada";
    }

    @PostMapping("/registrar")
    public String registrar(@RequestBody Map<String, String> body) {
        Long idEmpleado = Long.valueOf(body.get("idEmpleado"));
        String password = body.get("password");
        authService.registrarProfesor(idEmpleado, password);
        return "Profesor registrado en login de Profesores";
    }
}
