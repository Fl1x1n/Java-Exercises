package org.FT7;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius, fahrenheit;

        System.out.print("Digite a temperatura em graus Celsius: ");
        celsius = scanner.nextDouble();

        fahrenheit = (9 * celsius + 160) / 5;
        System.out.println("A temperatura em graus Fahrenheit é: " + fahrenheit);

        scanner.close();
    }
}
