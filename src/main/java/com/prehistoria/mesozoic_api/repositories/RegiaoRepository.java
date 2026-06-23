package com.prehistoria.mesozoic_api.repositories;

import com.prehistoria.mesozoic_api.entities.Regiao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegiaoRepository extends JpaRepository<Regiao, Long> {
}
