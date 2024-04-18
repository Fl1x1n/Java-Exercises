package org.FT7;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        // Cria um scanner para todos os Inputs

        System.out.println("Introduza o seu Nome: ");
        String Nome = input.next();
        // Lê o Nome

        System.out.println("Introduza o seu salário Fixo: ");
        float Sal = input.nextFloat();
        // Lê o Salário

        System.out.println("Introduza o total de Vendas: ");
        float TVendas = input.nextFloat();
        // Lê o total de vendas

        input.close();
        // fecha o scanner (para de sacar dados)

        double VendasComissao = TVendas * 0.30;
        double SalFino = VendasComissao + Sal;
        // faz as contas :)

        System.out.println("Nome:" + Nome);
        System.out.println("Salário Fixo: " + Sal);
        System.out.printf("Salário com as vendas: %.2f ", SalFino);
        // imprime o Nome, Salario Normal e o salário com o bonus

    }
}
