package com.panquesitos.recursos_humanos.repository;

import com.panquesitos.recursos_humanos.model.Materia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MateriaRepository extends JpaRepository<Materia, Integer >{

    // Buscar por nombre
    Materia findByNombre(String nombre);
}
