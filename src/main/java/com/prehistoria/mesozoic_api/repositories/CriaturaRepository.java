package com.prehistoria.mesozoic_api.repositories;

import com.prehistoria.mesozoic_api.entities.Criatura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CriaturaRepository extends JpaRepository<Criatura, Long> {
}
