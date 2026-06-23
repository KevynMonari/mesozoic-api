package com.prehistoria.mesozoic_api.repositories;

import com.prehistoria.mesozoic_api.entities.Periodo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeriodoRepository extends JpaRepository<Periodo, Long> {
}
