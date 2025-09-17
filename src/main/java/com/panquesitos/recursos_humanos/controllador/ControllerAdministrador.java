package com.panquesitos.recursos_humanos.controllador;

import com.panquesitos.recursos_humanos.model.Administradores;
import com.panquesitos.recursos_humanos.service.AdministradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/administrador")
public class ControllerAdministrador {

    @Autowired
    private AdministradorService service;

    // Listar todos los administradores
    @GetMapping
    public List<Administradores> getAll() {
        return service.getAllProfesores();
    }
    // Registrar administrador
    @PostMapping
    public void registrar(@RequestBody Administradores administrador) {
        service.registrarAdministrador(administrador);
    }
    // Login
    @PostMapping("/login")
    public Administradores login(@RequestBody Administradores administrador) {
        return service.login(administrador.getCorreo(), administrador.getContrasena());
    }
    // Buscar por correo
    @GetMapping("/correo/{correo}")
    public Administradores buscarPorCorreo(@PathVariable String correo) {
        return service.buscarPorCorreo(correo);}
    // Buscar por id
    @GetMapping("/{id}")
    public Administradores buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    }

