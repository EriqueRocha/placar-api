package com.atc.placarApi.model;

import javax.persistence.*;

@Entity
@Embeddable
@Table(name = "tab_placar")
public class Placar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private int pontoTime1;
    private int pontoTime2;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getPontoTime1() {
        return pontoTime1;
    }

    public void setPontoTime1(int pontoTime1) {
        this.pontoTime1 = pontoTime1;
    }

    public int getPontoTime2() {
        return pontoTime2;
    }

    public void setPontoTime2(int pontoTime2) {
        this.pontoTime2 = pontoTime2;
    }

    @Override
    public String toString() {
        return "{" +
                "pontoTime1=" + pontoTime1 +
                ", pontoTime2=" + pontoTime2 +
                '}';
    }
}
