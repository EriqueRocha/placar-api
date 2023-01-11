package com.atc.placarApi.service;

import com.atc.placarApi.repository.TimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TimeService {

    @Autowired
    private TimeRepository repository;

//    public void save(NovoTime novoTime){
//        Time time = new Time();
//        time.setNome(novoTime.getNome());
//
//        repository.save(time);
//
//    }


}
