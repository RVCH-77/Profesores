package com.panquesitos.recursos_humanos.service;

import com.panquesitos.recursos_humanos.model.Rol;
import com.panquesitos.recursos_humanos.repository.RolRository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class RolService {

    @Autowired
   private RolRository rolRepository;

    //listar roles
    public List<Rol> listarRoles() {
        return rolRepository.findAll();
    }
}
