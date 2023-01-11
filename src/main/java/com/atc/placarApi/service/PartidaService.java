package com.atc.placarApi.service;

import com.atc.placarApi.dto.AtualizarPlacar;
import com.atc.placarApi.dto.NovaPartida;
import com.atc.placarApi.model.Partida;
import com.atc.placarApi.model.Placar;
import com.atc.placarApi.model.Time;
import com.atc.placarApi.repository.PartidaRepository;
import com.atc.placarApi.repository.PlacarRepository;
import com.atc.placarApi.repository.TimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class PartidaService {

    @Autowired
    private PartidaRepository repository;

    @Autowired
    private PlacarRepository placarRepository;

    @Autowired
    private TimeRepository timeRepository;

    public void save(NovaPartida novaPartida) {
        Partida partida = new Partida();

        partida.setResultTime1(novaPartida.getResultTime1());
        partida.setResultTime2(novaPartida.getResultTime2());
        partida.setStatus(novaPartida.getStatus());

        Time time = new Time();
        Time time2 = new Time();
        time.setNome(String.valueOf(novaPartida.getTime1()));
        timeRepository.save(time);
        time2.setNome(String.valueOf(novaPartida.getTime2()));
        timeRepository.save(time2);

        Placar placar = new Placar();
        placar.setPontoTime1(novaPartida.getPontoTime1());
        placar.setPontoTime2(novaPartida.getPontoTime2());
        placarRepository.save(placar);

        partida.setTime1(time);
        partida.setTime2(time2);
        partida.setPlacar(placar);

        repository.save(partida);
    }

    public void update(AtualizarPlacar atualizarPlacar) {
        Placar placar = new Placar();
        placar.setId(Math.toIntExact(atualizarPlacar.getId()));
        placar.setPontoTime1(atualizarPlacar.getPontoTime1());
        placar.setPontoTime2(atualizarPlacar.getPontoTime2());

        placarRepository.save(placar);
    }

    public void deleteById(@PathVariable("id") Integer id){
        repository.deleteById(id);
    }
}
