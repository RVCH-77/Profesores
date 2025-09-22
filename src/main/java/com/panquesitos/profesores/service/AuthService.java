package com.panquesitos.profesores.service;

import com.panquesitos.profesores.model.ProfesorLogin;
import com.panquesitos.profesores.repository.ProfesorLoginRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthService {
    private final ProfesorLoginRepository loginRepository;
    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public AuthService(ProfesorLoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    public boolean login(Long idEmpleado, String password) {
        Optional<ProfesorLogin> opt = loginRepository.findByIdEmpleado(idEmpleado);
        return opt.isPresent() && passwordEncoder.matches(password, opt.get().getContrasenaHash());
    }

    public void cambiarContrasena(Long idEmpleado, String nuevaContrasena) {
        ProfesorLogin login = loginRepository.findByIdEmpleado(idEmpleado)
                .orElseThrow(() -> new RuntimeException("Profesor no encontrado"));
        login.setContrasenaHash(passwordEncoder.encode(nuevaContrasena));
        loginRepository.save(login);
    }

    public ProfesorLogin registrarProfesor(Long idEmpleado, String passwordPlano) {
        ProfesorLogin nuevo = new ProfesorLogin();
        nuevo.setIdEmpleado(idEmpleado);
        nuevo.setContrasenaHash(passwordEncoder.encode(passwordPlano));
        return loginRepository.save(nuevo);
    }
}
