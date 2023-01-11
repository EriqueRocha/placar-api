package com.atc.placarApi.controller;

import com.atc.placarApi.dto.AtualizarPlacar;
import com.atc.placarApi.dto.NovaPartida;
import com.atc.placarApi.model.Partida;
import com.atc.placarApi.repository.PartidaRepository;
import com.atc.placarApi.service.PartidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/partidas")
public class PartidaController {

    @Autowired
    private PartidaRepository repository;

    @Autowired
    private PartidaService service;

    @GetMapping("/ver-partidas")
    public List<Partida> findAll(){
        return repository.findAll();
    }

    @PostMapping
    public void save(@RequestBody NovaPartida partida){
        service.save(partida);
    }

    @GetMapping("/ver/{id}")
    public String editarPonto(@PathVariable("id") long id, Model model){
        Optional<Partida> pontoAnterior = repository.findById((int) id);

        Partida partida = pontoAnterior.get();
        model.addAttribute("partida", partida);

        return String.valueOf(repository.findById(partida.getId()));
    }

    @PutMapping("/placar/editar/{id}")
    public void update(@RequestBody AtualizarPlacar atualizarPlacar){
        service.update(atualizarPlacar);
    }

    @DeleteMapping("/deletar/{id}")
    public void delete(Integer id){
        if(repository.existsById(id)){
            repository.deleteById(id);
        }

    }
}
