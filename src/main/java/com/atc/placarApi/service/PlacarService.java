package com.atc.placarApi.service;

import com.atc.placarApi.dto.AtualizarPlacar;
import com.atc.placarApi.model.Placar;
import com.atc.placarApi.repository.PlacarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlacarService {
    @Autowired
    private PlacarRepository repository;

    public void save(AtualizarPlacar atualizarPlacar){
        Placar placar = new Placar();
        placar.setPontoTime1(atualizarPlacar.getPontoTime1());
        placar.setPontoTime2(atualizarPlacar.getPontoTime2());

        repository.save(placar);

    }

//    public void deleteById(@PathVariable("id") Integer id){
//        repository.deleteById(id);
//    }
}
