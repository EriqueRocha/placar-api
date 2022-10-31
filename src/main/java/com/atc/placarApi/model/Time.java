package com.atc.placarApi.model;

import javax.persistence.*;

@Entity
@Embeddable
@Table(name = "tab_times")
public class Time {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id;

   private String nome;

   public Integer getId() {
        return id;
    }

   public void setId(Integer id) {
        this.id = id;
    }

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
