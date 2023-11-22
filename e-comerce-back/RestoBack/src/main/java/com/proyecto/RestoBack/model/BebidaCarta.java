package com.proyecto.RestoBack.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity

public class BebidaCarta {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_bebida;
    private String name;
    private String price;
    
    public BebidaCarta() {
    }
    
    public BebidaCarta(String name, String price) {
        this.name = name;
        this.price = price;
    }
    
    public BebidaCarta(int id_bebida, String name, String price) {
        this.id_bebida = id_bebida;
        this.name = name;
        this.price = price;
    }
    
    public int getId_Bebida() {
        return id_bebida;
    }
    
    public void setId_Bebida(int id_Bebida) {
        this.id_bebida = id_Bebida;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getPrice() {
        return price;
    }
    
    public void setPrice(String price) {
        this.price = price;
    }
}