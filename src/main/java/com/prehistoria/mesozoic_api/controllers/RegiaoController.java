package com.prehistoria.mesozoic_api.controllers;

import com.prehistoria.mesozoic_api.entities.Regiao;
import com.prehistoria.mesozoic_api.repositories.RegiaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public Regiao salvar(@RequestBody Regiao regiao){
        return regiaoRepository.save(regiao);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Regiao> atualizar(@PathVariable Long id, @RequestBody Regiao dadosAtualizados){
        return regiaoRepository.findById(id)
                .map(regiaoExistente -> {
                    regiaoExistente.setNomeLocal(dadosAtualizados.getNomeLocal());
                    regiaoExistente.setEstado(dadosAtualizados.getEstado());
                    regiaoExistente.setPais(dadosAtualizados.getPais());

                    Regiao regiaoSalva = regiaoRepository.save(regiaoExistente);
                    return ResponseEntity.ok(regiaoSalva);

                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id){
        return regiaoRepository.findById(id)
                .map(regiao -> {
                    regiaoRepository.delete(regiao);
                    return ResponseEntity.noContent().<Void>build();
                })
                .orElse(ResponseEntity.notFound().build());
    }
}
