package com.atc.placarApi.model;

import javax.persistence.*;

@Entity
@Table(name = "tab_partidas")
public class Partida{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Embedded
    @ManyToOne(cascade = CascadeType.ALL)
    private Time time1;

    @Embedded
    @ManyToOne(cascade = CascadeType.ALL)
    private Time time2;

    @Embedded
    @ManyToOne(cascade = CascadeType.ALL)
    private Placar placar;

    @Enumerated(EnumType.STRING)
    private ResultadoPartida resultTime1;

    @Enumerated(EnumType.STRING)
    private ResultadoPartida resultTime2;

    @Enumerated(EnumType.STRING)
    private StatusPartida status;

    public Time getTime1() {
        return time1;
    }

    public void setTime1(Time time1) {
        this.time1 = time1;
    }

    public Time getTime2() {
        return time2;
    }

    public void setTime2(Time time2) {
        this.time2 = time2;
    }

    public ResultadoPartida getResultTime1() {
        return resultTime1;
    }

    public void setResultTime1(ResultadoPartida resultTime1) {
        this.resultTime1 = resultTime1;
    }

    public ResultadoPartida getResultTime2() {
        return resultTime2;
    }

    public void setResultTime2(ResultadoPartida resultTime2) {
        this.resultTime2 = resultTime2;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public Placar getPlacar() {
        return placar;
    }

    public void setPlacar(Placar placar) {
        this.placar = placar;
    }

    public StatusPartida getStatus() {
        return status;
    }

    public void setStatus(StatusPartida status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Partida{" +
                "time1=" + time1.getNome().toString() +
                ", time2=" + time2.getNome().toString() +
                ", placar=" + placar +
                ", status=" + status +
                '}';
    }
}
