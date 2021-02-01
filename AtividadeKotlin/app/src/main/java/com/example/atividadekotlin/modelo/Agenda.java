package com.example.atividadekotlin.modelo;

import java.util.ArrayList;

public class Agenda {

    ArrayList <Pessoa> agenda= new ArrayList(10);

    public void armazenaPessoa(Pessoa p){
        if(agenda.size()>10){
            System.out.println("agenda cheia");
        }else {
            agenda.add(p);
        }

    };
    public void removePessoa(String nome){

    };
    public Pessoa buscaPessoa(String nome){
        Pessoa P = new Pessoa("fulano", 10 ,20);
        return P;
        //errado
    };
    public void printAgenda(){

    };
    public void printPessoa(int index){

    };
}
