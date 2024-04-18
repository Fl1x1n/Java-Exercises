package org.FT7;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double precoCusto, percentualAumento, precoVenda;

        System.out.print("Digite o preço de custo do produto: ");
        precoCusto = scanner.nextDouble();

        System.out.print("Digite o percentual de aumento desejado: ");
        percentualAumento = scanner.nextDouble();

        precoVenda = precoCusto + (precoCusto * (percentualAumento / 100));

        System.out.println("O valor de venda do produto é: " + precoVenda);

        scanner.close();
    }
}
