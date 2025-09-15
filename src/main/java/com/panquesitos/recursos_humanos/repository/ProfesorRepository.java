package com.panquesitos.recursos_humanos.repository;
import com.panquesitos.recursos_humanos.model.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProfesorRepository extends JpaRepository<Profesor, Long> {

    // Guardar un profesor
    Profesor save(Profesor profesor);

    //Cambiar la contraseña de un profesor
    Profesor findByIdProfesor(Long idProfesor);


    //Loggear un profesor
    Profesor findByCorreoAndContrasena(String correo, String contrasena);

 // Buscar un profesor por correo
    Optional<Profesor> findByCorreo(String correo);
}
