package com.panquesitos.recursos_humanos.service;

import com.panquesitos.recursos_humanos.model.Persona;
import com.panquesitos.recursos_humanos.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;

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
    //Cambiar contraseña
    public Persona cambiarContrasena(Long idEmpleado, String nuevaContrasena) {
        Persona empleado = empleadoRepository.findByIdEmpleado(idEmpleado);
        if (empleado != null) {
            empleado.setContrasena(nuevaContrasena);
            return empleadoRepository.save(empleado);
        }
        return null;
    }
    //eliminar empleado
    public void eliminarEmpleado(Long id) {
        empleadoRepository.deleteById(id);
    }

}
