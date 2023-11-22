package com.proyecto.RestoBack.service;

import com.proyecto.RestoBack.model.BebidaCarta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.proyecto.RestoBack.repository.BebidaCartaRepository;

import java.util.List;

@Service
public class BebidaCartaService implements BebidaCartaInterface{
    
    @Autowired
    public BebidaCartaRepository bebidaCartaRepository;
    @Override
    public BebidaCarta saveBebida(BebidaCarta bebida) {
        return bebidaCartaRepository.save(bebida);
    }
    
    public List<BebidaCarta> getAllBebidas() {
        return bebidaCartaRepository.findAll();
    }
    
    public void  deleteBebida(Integer id){bebidaCartaRepository.deleteById(id);}
}
