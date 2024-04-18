package org.Ficha12_T2;

public class Calculadora {
    public Calculadora() {
    }

    // Métodos
    public double somar(double valor1, double valor2) {
        return valor1 + valor2;
    }

    public double subtrair(double valor1, double valor2) {
        return valor1 - valor2;
    }

    public double multiplicar(double valor1, double valor2) {
        return valor1 * valor2;
    }

    public double dividir(double valor1, double valor2) {
        return valor1 / valor2;
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println("Soma = "+calculadora.somar(5.2,2.7));
        System.out.println("Subtracao = "+calculadora.subtrair(5.2, 2.7));
        System.out.println("Multiplicacao = "+calculadora.multiplicar (5.2,2.7));
        System.out.println("Divisao = "+calculadora.dividir(5.2,2.7));
    }
}
