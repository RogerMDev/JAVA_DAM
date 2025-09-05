package com.login_exercice.domain;


import java.time.LocalDateTime;  

public class Usuario {
    
    private String username;
    private String password;
    private Role role;
    private String createdAt;

    public Usuario(String username, String password){
        validarUsername(username);
        validarPassword(password);
        this.username = username;
        this.password = password;
        this.role = Role.USER;
        this.createdAt = LocalDateTime.now().toString();
    }

    public Usuario(String username, String password, Role role, String createdAt){
        this.username = username;
        this.password = password;
        this.role = role;
        this.createdAt = createdAt;
    }

    private void validarUsername(String username){
        if (username == null){
            throw new IllegalArgumentException("El username no puede ser nulo");
        }
        if (username.length() < 3){
            throw new IllegalArgumentException("El username debe tener al menos 3 caracteres");
        }
        if (username.contains(" ")){
            throw new IllegalArgumentException("El username no puede contener espacios en blanco");   
        }
    }

    private void validarPassword(String password){
        if (password == null){
            throw new IllegalArgumentException("La password no puede ser nula");
        }
        if (password.length() < 6){
            throw new IllegalArgumentException("La password debe tener al menos 6 caracteres");
        }
        if (password.contains(" ")){
            throw new IllegalArgumentException("La password no puede contener espacios en blanco");   
        }
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Role getRole() {
        return role;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public boolean esAdmin() {
        return role == Role.ADMIN;
    }

    public void setPassword(String nuevaPassword){
        validarPassword(nuevaPassword);
        if (nuevaPassword.equals(this.password)){
            throw new IllegalArgumentException("La nueva contraseña no puede ser igual a la actual");
        }
        this.password = nuevaPassword;  
    }

    public String toCsvLine(){
        return username + ";" + password + ";" + role + ";" + createdAt;
    }
}
