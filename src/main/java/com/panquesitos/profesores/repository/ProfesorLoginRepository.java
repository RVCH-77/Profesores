package com.panquesitos.profesores.repository;

import com.panquesitos.profesores.model.ProfesorLogin;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface ProfesorLoginRepository extends JpaRepository<ProfesorLogin, Long> {
    // Buscar por nombre de usuario
    ProfesorLogin findByUsuario(String usuario);
    // Buscar por idEmpleado
    Optional<ProfesorLogin> findByIdEmpleado(Long idEmpleado);



}
