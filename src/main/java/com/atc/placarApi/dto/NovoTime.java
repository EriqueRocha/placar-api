package com.atc.placarApi.dto;

import com.atc.placarApi.model.Time;

public class NovoTime extends Time {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}
