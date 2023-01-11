package com.atc.placarApi.repository;

import com.atc.placarApi.model.Placar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlacarRepository extends JpaRepository<Placar, Integer> {

}
