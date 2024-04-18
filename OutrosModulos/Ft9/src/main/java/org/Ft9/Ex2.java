package org.Ft9;
import javax.swing.*;
public class Ex2 {
    public static void main(String[] args) {
        int soma = 0;

        for (int i = 1; i <= 1000; i++) {
            soma += i;
        }

        JOptionPane.showMessageDialog(null, "A soma de 1 até 1000 é: " + soma, "Soma", JOptionPane.INFORMATION_MESSAGE);
    }
}
