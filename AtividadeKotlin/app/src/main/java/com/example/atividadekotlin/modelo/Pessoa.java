package com.example.atividadekotlin.modelo;

import java.lang.reflect.Constructor;

public class Pessoa {

   private String nome;
   private int dataNascimento;
   private int idade;
   private float altura;

    Pessoa(String nome, float altura){
        this.nome=nome;
        this.altura=altura;

    }
    Pessoa(String nome, int dataNascimento, float altura){

        this.dataNascimento=dataNascimento;
        this.setIdade(2021-dataNascimento);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "<" + nome + ">" +
                "(<" + dataNascimento + ">," +
                "<" + altura +
                ">)";
    }

     public int calcularDataNascimento  (){

    dataNascimento= 2021 - this.getIdade();

        return dataNascimento;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(int dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getIdade() {
        return idade;
    }

    private void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}
