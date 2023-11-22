package com.proyecto.RestoBack.repository;

import com.proyecto.RestoBack.model.PostreCarta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostreCartaRepository extends JpaRepository<PostreCarta,Integer> {
}