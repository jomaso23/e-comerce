package com.proyecto.RestoBack.repository;

import com.proyecto.RestoBack.model.BebidaCarta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BebidaCartaRepository extends JpaRepository<BebidaCarta,Integer> {
}