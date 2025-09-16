package com.panquesitos.recursos_humanos.controllador;

import com.panquesitos.recursos_humanos.model.Materia;
import com.panquesitos.recursos_humanos.repository.MateriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/materias")
public class ControllerMateria {

    @Autowired
    private final MateriaRepository materiaRepository;

    public ControllerMateria(MateriaRepository materiaRepository) {
        this.materiaRepository = materiaRepository;
    }

    @GetMapping
    public List<Materia> listar() {
        return materiaRepository.findAll();
    }

    @PostMapping
    public Materia crear(@RequestBody Materia materia) {
        return materiaRepository.save(materia);
    }

}
