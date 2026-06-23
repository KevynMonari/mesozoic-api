package com.prehistoria.mesozoic_api.repositories;

import com.prehistoria.mesozoic_api.entities.Criatura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CriaturaRepository extends JpaRepository<Criatura, Long> {
    List<Criatura> findByPeriodoId(Long periodoId);
}
