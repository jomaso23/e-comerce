package com.proyecto.RestoBack.service;


import com.proyecto.RestoBack.model.ComidaCarta;

import java.util.List;

public interface ComidaCartaInterface {
    public ComidaCarta saveComida(ComidaCarta comida);
    public List<ComidaCarta> getAllComida();
    
}
