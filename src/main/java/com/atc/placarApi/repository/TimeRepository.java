package com.atc.placarApi.repository;

import com.atc.placarApi.model.Time;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimeRepository extends JpaRepository<Time, Integer> {
}
