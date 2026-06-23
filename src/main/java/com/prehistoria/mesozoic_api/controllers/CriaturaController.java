package com.prehistoria.mesozoic_api.controllers;

import com.prehistoria.mesozoic_api.entities.Criatura;
import com.prehistoria.mesozoic_api.repositories.CriaturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/criaturas")
public class CriaturaController {

    @Autowired
    private CriaturaRepository criaturaRepository;

    @GetMapping
    public List<Criatura> listarTodas(){
        return criaturaRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Criatura> buscarPorId(@PathVariable Long id){
        return criaturaRepository.findById(id)
                .map(criatura -> ResponseEntity.ok(criatura))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Criatura> criar(@RequestBody Criatura criatura){
        Criatura novaCriatura = criaturaRepository.save(criatura);
        return ResponseEntity.status(HttpStatus.CREATED).body(novaCriatura);
    }
}
