package org.FT7;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o valor para A: ");
        int a = scanner.nextInt();


        System.out.print("Digite o valor para B: ");
        int b = scanner.nextInt();


        int temp = a;
        a = b;
        b = temp;


        System.out.println("o valor de A é: " + a);
        System.out.println(" o valor de B é: " + b);


        scanner.close();
    }
}

