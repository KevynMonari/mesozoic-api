package com.prehistoria.mesozoic_api.controllers;

import com.prehistoria.mesozoic_api.entities.Fossil;
import com.prehistoria.mesozoic_api.repositories.FossilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

    @PutMapping("/{id}")
    public ResponseEntity<Fossil> atualizar (@PathVariable Long id, @RequestBody Fossil dadosAtualizados){
        return fossilRepository.findById(id)
                .map(fossilExistente -> {
                    fossilExistente.setTipoFossil(dadosAtualizados.getTipoFossil());
                    fossilExistente.setAnoDescoberta(dadosAtualizados.getAnoDescoberta());
                    fossilExistente.setPaleontologo(dadosAtualizados.getPaleontologo());

                    if (dadosAtualizados.getCriatura() != null){
                        fossilExistente.setCriatura(dadosAtualizados.getCriatura());
                    }

                    if (dadosAtualizados.getRegiao() != null){
                        fossilExistente.setRegiao(dadosAtualizados.getRegiao());
                    }

                    Fossil fossilSalvo = fossilRepository.save(fossilExistente);
                    return ResponseEntity.ok(fossilSalvo);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id){
        return fossilRepository.findById(id)
                .map(fossil -> {
                    fossilRepository.delete(fossil);;
                    return ResponseEntity.noContent().<Void>build();
                })
                .orElse(ResponseEntity.notFound().build());
    }
}
