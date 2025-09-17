package com.panquesitos.recursos_humanos.service;

import com.panquesitos.recursos_humanos.model.Administradores;
import com.panquesitos.recursos_humanos.repository.AdministradoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdministradorService {

    @Autowired
    private AdministradoresRepository administradoresRepository;

    // Registrar administrador
    public void registrarAdministrador(Administradores administrador) {
        administradoresRepository.save(administrador);
    }

    // Login
    public Administradores login(String correo, String contrasena) {
        return administradoresRepository.findByCorreoAndContrasena(correo, contrasena);
    }

    // Buscar por correo
    public Administradores buscarPorCorreo(String correo) {
        return administradoresRepository.findByCorreo(correo);
    }

    // Buscar por id
    public Administradores buscarPorId(Long id) {
        return administradoresRepository.findById(id).orElse(null);
    }

    // Buscar por nombre (pueden existir varios con el mismo nombre)
    public List<Administradores> buscarPorNombre(String nombre) {
        return administradoresRepository.findByNombre(nombre);
    }

    // Listar todos los administradores
    public List<Administradores> getAllProfesores() {
        return administradoresRepository.findAll();
    }
}
