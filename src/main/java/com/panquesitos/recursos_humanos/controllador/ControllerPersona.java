package com.panquesitos.recursos_humanos.controllador;

import com.panquesitos.recursos_humanos.model.Persona;
import com.panquesitos.recursos_humanos.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/empleados")
public class ControllerPersona {

    @Autowired
    private EmpleadoService empleadoService;

    // Crear empleado
    @PostMapping
    public Persona crearEmpleado(@RequestBody Persona empleado) {
        return empleadoService.registrarEmpleado(empleado);
    }

    // Listar todos los empleados
    @GetMapping
    public List<Persona> listarEmpleados() {
        return empleadoService.listarEmpleados();
    }

    // Buscar empleado por ID
    @GetMapping("/{id}")
    public Optional<Persona> buscarPorId(@PathVariable Long id) {
        return empleadoService.buscarPorId(id);
    }

    // Buscar por nombre
    @GetMapping("/nombre/{nombre}")
    public Persona buscarPorNombre(@PathVariable String nombre) {
        return empleadoService.buscarPorNombre(nombre);
    }

    // Buscar por número de empleado
    @GetMapping("/numero/{numeroEmpleado}")
    public Persona buscarPorNumero(@PathVariable String numeroEmpleado) {
        return empleadoService.buscarPorNumeroEmpleado(numeroEmpleado);
    }

    // Buscar por usuario
    @GetMapping("/usuario/{usuario}")
    public Persona buscarPorUsuario(@PathVariable String usuario) {
        return empleadoService.buscarPorUsuario(usuario);
    }

    // Buscar por rol
    @GetMapping("/rol/{idRol}")
    public List<Persona> buscarPorRol(@PathVariable Long idRol) {
        return empleadoService.buscarPorRol(idRol);
    }

    // Cambiar contraseña
    @PutMapping("/{id}/cambiar-contrasena")
    public Persona cambiarContrasena(@PathVariable Long id, @RequestBody String nuevaContrasena) {
        return empleadoService.cambiarContrasena(id, nuevaContrasena);
    }

    // Eliminar empleado
    @DeleteMapping("/{id}")
    public void eliminarEmpleado(@PathVariable Long id) {
        empleadoService.eliminarEmpleado(id);
    }
}
