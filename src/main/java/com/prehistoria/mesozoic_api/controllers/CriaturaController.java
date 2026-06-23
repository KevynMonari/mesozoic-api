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

    @GetMapping("/periodo/{periodoId}")
    public List<Criatura> listarPorPeriodo(@PathVariable Long periodoId){
        return criaturaRepository.findByPeriodoId(periodoId);
    }

    @PostMapping
    public ResponseEntity<Criatura> criar(@RequestBody Criatura criatura){
        Criatura novaCriatura = criaturaRepository.save(criatura);
        return ResponseEntity.status(HttpStatus.CREATED).body(novaCriatura);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id){
        return criaturaRepository.findById(id)
                .map(criatura -> {
                    criaturaRepository.delete(criatura);
                    return ResponseEntity.noContent().<Void>build();
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Criatura> atualziar(@PathVariable Long id, @RequestBody Criatura dadosAtualizados){
        return criaturaRepository.findById(id)
                .map(criaturaExistente -> {
                    criaturaExistente.setNomeCientifico(dadosAtualizados.getNomeCientifico());
                    criaturaExistente.setNomePopular(dadosAtualizados.getNomePopular());
                    criaturaExistente.setDieta(dadosAtualizados.getDieta());
                    criaturaExistente.setTamanho(dadosAtualizados.getTamanho());
                    criaturaExistente.setCuriosidade(dadosAtualizados.getCuriosidade());

                    if (dadosAtualizados.getPeriodo() != null){
                        criaturaExistente.setPeriodo(dadosAtualizados.getPeriodo());
                    }

                    Criatura criaturaSalva = criaturaRepository.save(criaturaExistente);
                    return ResponseEntity.ok(criaturaSalva);

                })
                .orElse(ResponseEntity.notFound().build());
    }
}
