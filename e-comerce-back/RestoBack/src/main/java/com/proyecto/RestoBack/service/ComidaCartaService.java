package com.proyecto.RestoBack.service;


import com.proyecto.RestoBack.model.ComidaCarta;
import com.proyecto.RestoBack.repository.ComidaCartaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComidaCartaService implements ComidaCartaInterface{
    
    @Autowired
    public ComidaCartaRepository comidaCartaRepository;
    
    
    @Override
    public ComidaCarta saveComida(ComidaCarta comida) {
        return comidaCartaRepository.save(comida);
    }
    
    
    public List<ComidaCarta> getAllComida() {
        return comidaCartaRepository.findAll();
    }
}

