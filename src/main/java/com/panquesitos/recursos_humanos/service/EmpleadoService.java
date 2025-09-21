package com.panquesitos.recursos_humanos.service;

import com.panquesitos.recursos_humanos.model.Persona;
import com.panquesitos.recursos_humanos.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoService {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    // Registrar empleado con número de empleado autogenerado
    public Persona registrarEmpleado(Persona empleado) {
        String ultimo = empleadoRepository.findUltimoNumeroEmpleado();

        int nuevoNumero = 1;
        if (ultimo != null && ultimo.startsWith("EMP")) {
            nuevoNumero = Integer.parseInt(ultimo.substring(3)) + 1;
        }

        String numeroEmpleado = String.format("EMP%03d", nuevoNumero);
        empleado.setNumeroEmpleado(numeroEmpleado);

        return empleadoRepository.save(empleado);
    }

    // Cambiar contraseña de empleado
    public Persona cambiarContrasena(Long idEmpleado, String nuevaContrasena) {
        Optional<Persona> optionalEmpleado = empleadoRepository.findById(idEmpleado);
        if (optionalEmpleado.isPresent()) {
            Persona empleado = optionalEmpleado.get();
            empleado.setContrasena(nuevaContrasena);
            return empleadoRepository.save(empleado);
        }
        return null;
    }

    // Eliminar empleado
    public void eliminarEmpleado(Long id) {
        empleadoRepository.deleteById(id);
    }

    // Listar todos los empleados
    public List<Persona> listarEmpleados() {
        return empleadoRepository.findAll();
    }

    // Buscar empleado por ID
    public Optional<Persona> buscarPorId(Long id) {
        return empleadoRepository.findById(id);
    }

    // Buscar por nombre
    public Persona buscarPorNombre(String nombre) {
        return empleadoRepository.findByNombre(nombre);
    }

    // Buscar por número de empleado
    public Persona buscarPorNumeroEmpleado(String numeroEmpleado) {
        return empleadoRepository.findByNumeroEmpleado(numeroEmpleado);
    }

    // Buscar por usuario
    public Persona buscarPorUsuario(String usuario) {
        return empleadoRepository.findByUsuario(usuario);
    }

    // Buscar por rol
    public List<Persona> buscarPorRol(Long idRol) {
        return empleadoRepository.findByRol_IdRol(idRol);
    }
}
