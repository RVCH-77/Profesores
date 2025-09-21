package com.panquesitos.recursos_humanos.repository;

import com.panquesitos.recursos_humanos.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmpleadoRepository extends JpaRepository<Persona, Long> {
    // Metodos

 // Guardar empleado
    @Query("SELECT e.numero_empleado FROM Empleado e ORDER BY e.idEmpleado DESC LIMIT 1")
    String findUltimoNumeroEmpleado();
    // buscar por nombre
    Persona findByNombre(String nombre);
    // buscar por numero de empleado
    Persona findByNumeroEmpleado(String numeroEmpleado);
    // buscar por usuario
    Persona findByUsuario(String usuario);
    // Login
    Persona findByUsuarioAndContrasena(String usuario, String contrasena);
    //Listar todos los empleados
    List<Persona> getAllPeople();
   //Cambiar contraseña
    Persona findByIdEmpleado(Long idEmpleado);

    //eliminar empleado
    void deleteById(Long id);
    //buscar por rol
    List<Persona> findByRol_IdRol(Long idRol);

}



