package org.FT7;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valorDepositado, rendimento, valorFinal;

        System.out.print("Digite o valor depositado: ");
        valorDepositado = scanner.nextDouble();

        rendimento = valorDepositado * 0.007; // 0.70% de juro
        valorFinal = valorDepositado + rendimento;

        System.out.println("O valor com rendimento após um mês é: " + valorFinal);

        scanner.close();
    }
}
