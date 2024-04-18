package org.Ficha12_T2;

import java.util.Scanner;

public class FazCalculos {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        Scanner s = new Scanner(System.in);

        System.out.print("Introduza o primeiro número: ");
        double num1 = s.nextDouble();

        System.out.print("Introduza o segundo número: ");
        double num2 = s.nextDouble();

        System.out.println("Soma = "+calculadora.somar(num1,num2));
        System.out.println("Subtracção = "+calculadora.subtrair(num1, num2));


        System.out.println("Multiplicação = "+calculadora.multiplicar(num1,num2));
        System.out.println("Divisão = "+calculadora.dividir(num1,num2));

    }
}
