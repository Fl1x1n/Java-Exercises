package org.M10_Ft9;

import java.util.Scanner;

class TestaBuzinar2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        /* Solicita ao utilizador a introdução do tipo de carro que pretende: "citadino",
        "familiar" ou "jipe" */
        System.out.print("Insira o tipo de carro: ");
        String tipoCarro = s.nextLine();
        /* Declara uma variável do tipo Carro e não uma instância da classe Carro pois, para  isso, seria necessário ter a linha de código: Carro carro = new Carro(); */
        Carro carro1 = new Carro();
        /* Compara o tipo de carro inserido pelo utilizador com as subclasses de Carro e cria  uma instância de uma delas */
        if (tipoCarro.equals("citadino")) carro1 = new Citadino();
        else if (tipoCarro.equals("familiar")) carro1 = new Familiar();
        else if (tipoCarro.equals("jipe")) carro1 = new Jipe();
        else carro1 = new Carro();
        //Invoca o método buzina implementado na subclasse correspondente ao tipo de  carro inserido pelo utilizador
        carro1.buzinar();
    }
}
