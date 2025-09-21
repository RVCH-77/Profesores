package com.panquesitos.recursos_humanos.controllador;

import com.panquesitos.recursos_humanos.model.Persona;
import com.panquesitos.recursos_humanos.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:3001")


@RequestMapping("/empleados")
public class ControllerPersona {

    @Autowired
    private EmpleadoService empleadoService;

    // Crear empleado
    @PostMapping
    public ResponseEntity<?> registrarEmpleado(@RequestBody Persona empleado) {
        try {
            Persona nuevoEmpleado = empleadoService.registrarEmpleado(empleado);
            return ResponseEntity.status(HttpStatus.CREATED).body(nuevoEmpleado);
        } catch (Exception e) {
            e.printStackTrace(); // <--- esto imprime la causa exacta en consola
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(Map.of("error", e.getMessage()));
        }
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

    //Buscar por usuario y contraseña
    @PostMapping("/login")
    public ResponseEntity<Persona> login(@RequestBody Map<String, String> body) {
        // Tomamos los valores del body; si no existe "usuario", usamos "username"
        String usuario = body.getOrDefault("usuario", body.get("username"));
        String contrasena = body.getOrDefault("contrasena", body.get("password"));

        System.out.println("Usuario: " + usuario + ", Contraseña: " + contrasena);

        Optional<Persona> op = empleadoService.login(usuario, contrasena);
        return op.map(ResponseEntity::ok)
                .orElse(ResponseEntity.status(HttpStatus.UNAUTHORIZED).build());
    }

}
