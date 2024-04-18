package org.FT7;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valorCompra, valorPrestacao;

        System.out.print("Digite o valor da compra: ");
        valorCompra = scanner.nextDouble();

        valorPrestacao = valorCompra / 5;

        System.out.println("O valor de cada prestação é: " + valorPrestacao);

        scanner.close();
    }
}
