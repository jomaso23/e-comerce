package com.proyecto.RestoBack.service;


import com.proyecto.RestoBack.model.PostreCarta;

import java.util.List;

public interface PostreCartaInterface {
    public PostreCarta savePostre(PostreCarta postre);
    public List<PostreCarta> getAllPostre();
    
}
