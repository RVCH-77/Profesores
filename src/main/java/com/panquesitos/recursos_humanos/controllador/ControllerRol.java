package com.panquesitos.recursos_humanos.controllador;

import com.panquesitos.recursos_humanos.model.Persona;
import com.panquesitos.recursos_humanos.model.Rol;
import com.panquesitos.recursos_humanos.repository.RolRository;
import com.panquesitos.recursos_humanos.service.EmpleadoService;
import com.panquesitos.recursos_humanos.service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


    @RestController
    @RequestMapping("/roles")
    public class ControllerRol {

        @Autowired
        private RolService rolService;

       // Listar todos los roles;
        @GetMapping
        public List<Rol> listarRoles() {
            return rolService.listarRoles();
        }
    }
