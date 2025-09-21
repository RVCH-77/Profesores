package com.panquesitos.recursos_humanos.controllador;

import com.panquesitos.recursos_humanos.model.Persona;
import com.panquesitos.recursos_humanos.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

public class ControllerPersona {

    @RestController
    @CrossOrigin(origins = "http://localhost:3000")

    @RequestMapping("/empleados")
    public class EmpleadoController {

        @Autowired
        private EmpleadoService empleadoService;

        @PostMapping
        public Persona crearEmpleado(@RequestBody Persona empleado) {
            return empleadoService.registrarEmpleado(empleado);
        }
    }
    // buscar por nombre


}
