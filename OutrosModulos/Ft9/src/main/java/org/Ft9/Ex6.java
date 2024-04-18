package org.Ft9;
import javax.swing.*;
public class Ex6 {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        int a = 0;
        int b = 1;
        int c = 0;

        while (c <= 100) {
            result.append(c).append(", ");
            a = b;
            b = c;
            c = a + b;
        }

        JOptionPane.showMessageDialog(null, "Série de Fibonacci até 100:\n" + result.toString());
    }
}
