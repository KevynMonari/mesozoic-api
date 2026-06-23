package com.prehistoria.mesozoic_api.controllers;

import com.prehistoria.mesozoic_api.entities.Regiao;
import com.prehistoria.mesozoic_api.repositories.RegiaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/regioes")
public class RegiaoController {

    @Autowired
    private RegiaoRepository regiaoRepository;

    @GetMapping
    public List<Regiao> listarTodas(){
        return regiaoRepository.findAll();
    }
}
