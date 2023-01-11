package com.atc.placarApi.controller;

import com.atc.placarApi.dto.NovoTime;
import com.atc.placarApi.model.Time;
import com.atc.placarApi.repository.PartidaRepository;
import com.atc.placarApi.repository.TimeRepository;
import com.atc.placarApi.service.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/times")
public class TimeController {
    @Autowired
    private TimeRepository repository;

    @Autowired
    private TimeService service;

    @Autowired
    private PartidaRepository repo;

    @Autowired
    private PartidaRepository serv;

    @GetMapping
    public List<Time> findAll(){
        return repository.findAll();
    }

//    @PostMapping
//    public void save(@RequestBody NovoTime time){
//        service.save(time);
//
//    }


}
