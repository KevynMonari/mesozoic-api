package com.prehistoria.mesozoic_api.controllers;

import com.prehistoria.mesozoic_api.entities.Periodo;
import com.prehistoria.mesozoic_api.repositories.PeriodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/periodos")
public class PeriodoController {

    @Autowired
    private PeriodoRepository periodoRepository;

    @GetMapping
    public List<Periodo> listarTodos() {
        return periodoRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Periodo> criar(@RequestBody Periodo periodo){
        Periodo novoPeriodo = periodoRepository.save(periodo);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoPeriodo);
    }
}
