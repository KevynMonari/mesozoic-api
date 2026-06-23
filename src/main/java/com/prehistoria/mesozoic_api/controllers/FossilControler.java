package com.prehistoria.mesozoic_api.controllers;

import com.prehistoria.mesozoic_api.entities.Fossil;
import com.prehistoria.mesozoic_api.repositories.FossilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/fossies")
public class FossilControler {

    @Autowired
    private FossilRepository fossilRepository;

    @GetMapping
    public List<Fossil> listarTodos(){
        return fossilRepository.findAll();
    }

    @PostMapping
    public Fossil salvar(@RequestBody Fossil fossil){
        return fossilRepository.save(fossil);
    }
}
