package com.panquesitos.recursos_humanos.service;

import com.panquesitos.recursos_humanos.model.Profesor;
import com.panquesitos.recursos_humanos.repository.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.time.LocalDate;
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
    public Optional<Profesor> login(String correo) {
        return profesorRepository.findByCorreo(correo);
    }
}



