package com.proyecto.RestoBack.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PostreCarta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id_postre;
    public String name;
    public String price;
    
    public PostreCarta() {
    }
    
    public PostreCarta(String name, String price) {
        this.name = name;
        this.price = price;
    }
    
    public PostreCarta(int id_postre, String name, String price) {
        this.id_postre = id_postre;
        this.name = name;
        this.price = price;
    }
    
    public int getPostre_id() {
        return id_postre;
    }
    
    public void setPostre_id(int postre_id) {
        this.id_postre = postre_id;
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
