package com.proyecto.RestoBack.service;


import com.proyecto.RestoBack.model.PostreCarta;

import com.proyecto.RestoBack.repository.PostreCartaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostreCartaService implements PostreCartaInterface{
    
    @Autowired
    public PostreCartaRepository postreCartaRepository;
    
    @Override
    public PostreCarta savePostre(PostreCarta postre) {
        return postreCartaRepository.save(postre);
    }
    
    @Override
    public List<PostreCarta> getAllPostre() {
        return postreCartaRepository.findAll();
    }
}
