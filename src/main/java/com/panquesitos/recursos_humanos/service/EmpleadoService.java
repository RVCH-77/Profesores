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
        // Obtener el último número de empleado registrado
        String ultimo = empleadoRepository.findUltimoNumeroEmpleado();

        int nuevoNumero = 1;
        if (ultimo != null && ultimo.startsWith("EMP")) {
            // Extraer la parte numérica
            nuevoNumero = Integer.parseInt(ultimo.substring(3)) + 1;
        }

        // Generar el nuevo código con ceros a la izquierda (EMP001, EMP002...)
        String numeroEmpleado = String.format("EMP%03d", nuevoNumero);
        empleado.setNumeroEmpleado(numeroEmpleado);

        // Guardar
        return empleadoRepository.save(empleado);
    }

    // Eliminar empleado
    public void eliminarEmpleado(Long id) {
        empleadoRepository.deleteById(id);
    }

    // Obtener todos los empleados
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
