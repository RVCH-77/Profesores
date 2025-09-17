package com.panquesitos.recursos_humanos.service;

import com.panquesitos.recursos_humanos.repository.AdministradoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdministradorService {

    // Aquí puedes agregar métodos específicos para la lógica de negocio relacionada con los administradores


    @Autowired
   private AdministradoresRepository administradoresRepository;


    //registrar administrador
    public void registrarAdministrador(com.panquesitos.recursos_humanos.model.Administradores administrador) {
        administradoresRepository.save(administrador);
    }

    // Login
    public com.panquesitos.recursos_humanos.model.Administradores login(String correo, String contrasena) {
        return administradoresRepository.findByCorreoAndContrasena(correo, contrasena);
    }

    // Buscar por correo
    public com.panquesitos.recursos_humanos.model.Administradores buscarPorCorreo(String correo) {
        return administradoresRepository.findByCorreo(correo);
    }
    // Buscar por id
    public com.panquesitos.recursos_humanos.model.Administradores buscarPorId(long id) {
        return administradoresRepository.findById(id);
    }
    // Buscar por nombre
    public com.panquesitos.recursos_humanos.model.Administradores buscarPorNombre(String nombre) {
        return administradoresRepository.findByNombre(nombre);}






}
