package com.panquesitos.recursos_humanos.repository;

import com.panquesitos.recursos_humanos.model.Persona;
import com.panquesitos.recursos_humanos.model.Rol;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolRository  extends JpaRepository<Rol, Long> {

   //listar roles
    Rol findByNombre(String nombre);



}
