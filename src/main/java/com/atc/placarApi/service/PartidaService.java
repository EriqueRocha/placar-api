package com.atc.placarApi.service;

import com.atc.placarApi.dto.AtualizarPonto;
import com.atc.placarApi.dto.NovaPartida;
import com.atc.placarApi.model.Partida;
import com.atc.placarApi.model.Time;
import com.atc.placarApi.repository.PartidaRepository;
import com.atc.placarApi.repository.TimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PartidaService{

    @Autowired
    private PartidaRepository repository;

    @Autowired
    private TimeRepository timeRepository;

    public void save(NovaPartida novaPartida){
        Partida partida = new Partida();
        partida.setPontoTime1(novaPartida.getPontoTime1());
        partida.setPontoTime2(novaPartida.getPontoTime2());
        partida.setResultTime1(novaPartida.getResultTime1());
        partida.setResultTime2(novaPartida.getResultTime2());
        partida.setStatus(novaPartida.getStatus());

        Time time = new Time();
        Time time2 = new Time();
            time.setNome(String.valueOf(novaPartida.getTime1()));
        timeRepository.save(time);
            time2.setNome(String.valueOf(novaPartida.getTime2()));
        timeRepository.save(time2);

        partida.setTime1(time);
        partida.setTime2(time2);

        repository.save(partida);


    }

    public void update(AtualizarPonto atualizarPonto){
        Partida partida = new Partida();
        partida.setPontoTime1(atualizarPonto.getPontoTime1());
        partida.setPontoTime2(atualizarPonto.getPontoTime2());

        repository.save(partida);
    }

}
