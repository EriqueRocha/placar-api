package com.atc.placarApi.dto;

import com.atc.placarApi.model.ResultadoPartida;

public class NovaPartida {

    private NovoTime time1;
    private NovoTime time2;
    private int pontoTime1;
    private int pontoTime2;
    private ResultadoPartida resultTime1;
    private ResultadoPartida resultTime2;
    private ResultadoPartida status;

    public NovoTime getTime1() {
        return time1;
    }


    public void setTime1(NovoTime time1) {
        this.time1 = time1;
    }

    public NovoTime getTime2() {
        return time2;
    }

    public void setTime2(NovoTime time2) {
        this.time2 = time2;
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

    public ResultadoPartida getStatus() {
        return status;
    }

    public void setStatus(ResultadoPartida status) {
        this.status = status;
    }
}
