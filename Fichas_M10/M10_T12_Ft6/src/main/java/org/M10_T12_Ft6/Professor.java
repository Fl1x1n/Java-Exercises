package org.M10_T12_Ft6;

public class Professor extends Pessoa
{
    //Atributos
    private int grupoDocencia;
    private int escalao;
    //Getters
    public int getGrupoDocencia(){
        return grupoDocencia;
    }
    public int getEscalao(){
        return escalao;
    }
    //Construtores
    public Professor(){
    }
    public Professor(String nome, String genero, int idade, int grupoDocencia, int escalao){
        super(nome, genero, idade);
        this.grupoDocencia = grupoDocencia;
        this.escalao = escalao;
    }
    // Métodos
    public void falar(){
        System.out.println(" e sou um Professor");
    }
}
