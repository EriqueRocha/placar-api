package com.atc.placarApi.controller;

import com.atc.placarApi.dto.AtualizarPonto;
import com.atc.placarApi.dto.NovaPartida;
import com.atc.placarApi.model.Partida;
import com.atc.placarApi.repository.PartidaRepository;
import com.atc.placarApi.service.PartidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/partidas")
public class PartidaController {

    @Autowired
    private PartidaRepository repository;

    @Autowired
    private PartidaService service;


    @GetMapping
    public List<Partida> findAll(){
        return repository.findAll();
    }

    @PostMapping
    public void save(@RequestBody NovaPartida partida){
        service.save(partida);
    }

    @GetMapping("/editar/{id}")
    public String editarPonto(@PathVariable("id") long id, Model model){
        Optional<Partida> pontoAnterior = repository.findById((int) id);

        Partida partida = pontoAnterior.get();
        model.addAttribute("partida", partida);

        return String.valueOf(repository.findById(partida.getId()));
    }

    @PostMapping("/editar/{id}")
    public void update(@PathVariable("id") long id, AtualizarPonto atualizarPonto){
        service.update(atualizarPonto);
    }
}
