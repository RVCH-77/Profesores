package com.panquesitos.recursos_humanos.repository;

import com.panquesitos.recursos_humanos.model.Materia;
import com.panquesitos.recursos_humanos.model.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface ProfesorRepository extends JpaRepository<Profesor, Long> {

    // Login
    Profesor findByCorreoAndContrasena(String correo, String contrasena);

    // Buscar por correo
    Optional<Profesor> findByCorreo(String correo);

    // buscar por materia
    Optional<Profesor> findByMateria(int materia);
}
