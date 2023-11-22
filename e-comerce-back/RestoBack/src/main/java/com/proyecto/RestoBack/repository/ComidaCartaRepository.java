package com.proyecto.RestoBack.repository;

import com.proyecto.RestoBack.model.ComidaCarta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComidaCartaRepository extends JpaRepository<ComidaCarta,Integer> {
}