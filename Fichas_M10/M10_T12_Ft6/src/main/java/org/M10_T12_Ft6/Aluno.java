package org.M10_T12_Ft6;

public class Aluno extends Pessoa {
    //Atributos
    private int numAluno;
    private String turma;
    // Getters
    public int getNumAluno() {
        return numAluno;
    }
    public String getTurma() {
        return turma;
    }
    //Construtores
    public Aluno(){
    }
    public Aluno(String nome, String genero, int idade, int numAluno,String turma){
        super (nome, genero, idade);
        this.numAluno = numAluno;
        this.turma = turma;
    }
    // Métodos
    public void falar(){
        System.out.println("e sou um Aluno");
    }
}
