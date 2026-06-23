package com.prehistoria.mesozoic_api.repositories;

import com.prehistoria.mesozoic_api.entities.Fossil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FossilRepository extends JpaRepository<Fossil, Long> {
}
