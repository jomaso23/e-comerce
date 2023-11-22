package com.proyecto.RestoBack.controller;

import com.proyecto.RestoBack.model.BebidaCarta;
import com.proyecto.RestoBack.model.ComidaCarta;
import com.proyecto.RestoBack.model.PostreCarta;
import com.proyecto.RestoBack.service.BebidaCartaService;
import com.proyecto.RestoBack.service.ComidaCartaService;
import com.proyecto.RestoBack.service.PostreCartaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/alimentos")

public class AlimentosCartaController {
    @Autowired
    private BebidaCartaService bebidaCartaService;
    @Autowired
    private ComidaCartaService comidaCartaService;
    @Autowired
    private PostreCartaService postreCartaService;
    
    //controladores de BEBIDA
    @PostMapping("/agregarBebida")
    public BebidaCarta saveBebida(@RequestBody BebidaCarta bebidaCarta){
        return bebidaCartaService.saveBebida(bebidaCarta);
    }
    @GetMapping("/traerBebida")
    public List<BebidaCarta> getAllBebidas(){
        return bebidaCartaService.getAllBebidas();
    }
    
    @DeleteMapping("/eliminarBebida/{id}")
    public  void deleteBebida(@PathVariable int id){
        bebidaCartaService.deleteBebida(id);
    }
    //controladores de COMIDA
    @PostMapping("/agregarComida")
    public ComidaCarta saveComida(@RequestBody ComidaCarta comidaCarta){
        return comidaCartaService.saveComida(comidaCarta);
    }
    @GetMapping("/traerComida")
    public List<ComidaCarta> getAllComida(){
        return comidaCartaService.getAllComida();
    }
    
    //controladores de POSTRE
    @PostMapping("/agregarPostre")
    public PostreCarta savePostre(@RequestBody PostreCarta postreCarta){
        return postreCartaService.savePostre(postreCarta);
    }
    @GetMapping("/traerPostre")
    public List<PostreCarta> getAllPostre(){
        return postreCartaService.getAllPostre();
    }
}


