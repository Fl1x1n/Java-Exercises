package org.M10_T12_Ft6;

public abstract class Pessoa {
    //Atributos (Estado)
    private String nome; // Nome da Pessoa
    private String genero; // Sexo da Pessoa
    private int idade; // Idade da Pessoa

    //Construtor para os objectos da classe Pessoa

    public Pessoa(String nome, String genero, int idade) {
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
    }
    public abstract Pessoa() {
        //este tipo de modificador não é permitido (abstract)
    }
    //Métodos (Comportamento)
    void falar() {
        System.out.println("Sou uma pessoa");
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    // Getter e Setter para o atributo genero
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    // Getter e Setter para o atributo idade
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
}
