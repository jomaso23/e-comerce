package com.proyecto.RestoBack.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_usuario;
    private String user_name;
    private String password;
    private String role;
    
    public User() {
    }
    
    public User(String user_name, String password) {
        this.user_name = user_name;
        this.password = password;
    }
    
    public User(String user_name, String password, String role) {
        this.user_name = user_name;
        this.password = password;
        this.role = role;
    }
    
    public User(int id_usuario, String user_name, String password, String role) {
        this.id_usuario = id_usuario;
        this.user_name = user_name;
        this.password = password;
        this.role = role;
    }
    
    public int getId_usuario() {
        return id_usuario;
    }
    
    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }
    
    public String getUser_name() {
        return user_name;
    }
    
    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getRole() {
        return role;
    }
    
    public void setRole(String role) {
        this.role = role;
    }
}
