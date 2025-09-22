package com.panquesitos.profesores.model;

import jakarta.persistence.*;

@Entity
@Table(name = "profesor_login")
public class ProfesorLogin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_login")
    private Long idLogin;

    @Column(name = "id_empleado", nullable = false, unique = true)
    private Long idEmpleado; // viene de RH

    @Column(name = "usuario", nullable = false, unique = true)
    private String usuario;

    @Column(name = "contrasena_hash", nullable = false)
    private String contrasenaHash;

    // Constructor vacío
    public ProfesorLogin() {}

    // Constructor con parámetros
    public ProfesorLogin(Long idEmpleado, String contrasenaHash) {
        this.idEmpleado = idEmpleado;
        this.contrasenaHash = contrasenaHash;
    }

    // Getters y Setters
    public Long getIdLogin() {
        return idLogin;
    }

    public void setIdLogin(Long idLogin) {
        this.idLogin = idLogin;
    }

    public Long getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Long idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getContrasenaHash() {
        return contrasenaHash;
    }

    public void setContrasenaHash(String contrasenaHash) {
        this.contrasenaHash = contrasenaHash;
    }
}
