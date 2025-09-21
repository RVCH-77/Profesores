package com.panquesitos.recursos_humanos.repository;

import com.panquesitos.recursos_humanos.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmpleadoRepository extends JpaRepository<Persona, Long> {

    // Obtener el último número de empleado
    @Query(value = "SELECT numero_empleado FROM empleado ORDER BY id_empleado DESC LIMIT 1", nativeQuery = true)
    String findUltimoNumeroEmpleado();

    // Buscar por nombre
    Persona findByNombre(String nombre);

    // Buscar por número de empleado
    Persona findByNumeroEmpleado(String numeroEmpleado);

    // Buscar por usuario
    Persona findByUsuario(String usuario);

    // Listar todos los empleados
    List<Persona> findAll();

    // Buscar por ID (ya lo hereda JpaRepository, puedes quitarlo)
    // Persona findByIdEmpleado(Long idEmpleado);

    // Eliminar empleado (ya lo hereda JpaRepository, puedes usar deleteById)
    // void deleteById(Long id);

    // Buscar por rol
    List<Persona> findByRol_IdRol(Long idRol);

    //Cambiar contraseña
    Persona findByContrasena(String contrasena);

    // Login
    Persona findByUsuarioAndContrasena(String usuario, String contrasena);

}
