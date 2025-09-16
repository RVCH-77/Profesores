package com.panquesitos.profesores.service;

import com.panquesitos.profesores.model.Calificaciones;
import com.panquesitos.profesores.repository.CalificacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class ServiceCalificacion {

    @Autowired
    private CalificacionRepository calificacionRepository;

    //Registrar calificación
    public Calificaciones registrarCalificacion(Calificaciones calificacion) {
        return calificacionRepository.save(calificacion);
    }

    //Listar todas las calificaciones
    public List<Calificaciones> getAllCalificaciones() {
        return calificacionRepository.findAll();
    }

}
