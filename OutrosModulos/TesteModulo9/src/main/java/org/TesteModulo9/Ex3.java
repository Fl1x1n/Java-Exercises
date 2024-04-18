package org.TesteModulo9;
import javax.swing.*;
import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        int n_nums = Integer.parseInt(JOptionPane.showInputDialog("Quantos números irá introduzir?"));

        double soma = 0;
        double maior = 0;
        double menor = 0;

        for (int i = 0; i < n_nums; i++) {
            String input = JOptionPane.showInputDialog("Introduz um número:");
            double valor = Double.parseDouble(input);

            soma += valor;

            if (valor > maior) {
                maior = valor;
            }
            if (valor < menor) {
                menor = valor;
            }
        }

        double media = soma / n_nums;

        JOptionPane.showMessageDialog(null,
                "Maior valor: " + maior +
                        "\nMenor valor: " + menor +
                        "\nMédia: " + media);
    }
}
