package com.panquesitos.recursos_humanos.service;

import com.panquesitos.recursos_humanos.model.Profesor;
import com.panquesitos.recursos_humanos.repository.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class ProfesorService {

    @Autowired
    private ProfesorRepository profesorRepository;

    // Registrar profesor
    public Profesor registrarProfesor(Profesor profesor) {
        return profesorRepository.save(profesor);
    }

    // Login (buscar por correo)
    public Optional<Profesor> login(String correo, String contrasena) {
        return  profesorRepository.findByCorreo(correo)
                .filter(profesor -> profesor.getContrasena().equals(contrasena));
    }

    public List<Profesor> getAllProfesores() {
        return profesorRepository.findAll();
    }
    // Cambiar contraseña
    public Optional<Profesor> cambiarContrasena(Long id, String nuevaContrasena) {
        Optional<Profesor> op = profesorRepository.findById(id);
        op.ifPresent(p -> {
            p.setContrasena(nuevaContrasena);
            profesorRepository.save(p);
        });
        return op;
    }
}



