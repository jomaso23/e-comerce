package com.proyecto.RestoBack.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ComidaCarta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id_comida;
    public String name;
    public String price;
    
    public ComidaCarta() {
    }
    
    public ComidaCarta(String name, String price) {
        this.name = name;
        this.price = price;
    }
    
    public ComidaCarta(int id_comida, String name, String price) {
        this.id_comida = id_comida;
        this.name = name;
        this.price = price;
    }
    
    public int getComida_Id() {
        return id_comida;
    }
    
    public void setComida_Id(int comida_Id) {
        this.id_comida = comida_Id;
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
