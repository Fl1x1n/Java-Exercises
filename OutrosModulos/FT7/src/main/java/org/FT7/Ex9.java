package org.FT7;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double raio, area;

        System.out.print("Digite o raio do círculo: ");
        raio = scanner.nextDouble();

        area = Math.PI * (raio * raio);

        System.out.println("A área do círculo é: " + area);

        scanner.close();
    }
}
