package com.atc.placarApi.controller;

import com.atc.placarApi.model.Placar;
import com.atc.placarApi.repository.PartidaRepository;
import com.atc.placarApi.repository.PlacarRepository;
import com.atc.placarApi.service.PlacarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/placares")
public class PlacarControler {

    @Autowired
    private PlacarRepository repository;

    @Autowired
    private PlacarService service;

    @Autowired
    private PartidaRepository repo;

    @Autowired
    private PartidaRepository serv;

    @GetMapping
    public List<Placar> findAll() {
        return repository.findAll();
    }

//    @PostMapping
//    public void save(@RequestBody AtualizarPlacar placar) {
//        service.save(placar);
//    }
//
//    @DeleteMapping("/deletar/{id}")
//    public void delete(Integer id){
//      if(repository.existsById(id)){
//          repo.deleteById(id);
//      }
//
//    }

}
