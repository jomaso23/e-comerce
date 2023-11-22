package com.proyecto.RestoBack.service;

import com.proyecto.RestoBack.model.BebidaCarta;

import java.util.List;

public interface BebidaCartaInterface {
    public BebidaCarta saveBebida(BebidaCarta bebida);
    public List<BebidaCarta> getAllBebidas();
    
}
