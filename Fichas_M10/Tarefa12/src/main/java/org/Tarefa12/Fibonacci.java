package org.Tarefa12;
import javax.swing.*;
public class Fibonacci {
    public static void main(String[] args){
        int n = 20;

        StringBuilder result = new StringBuilder();
        result.append("Os primeiros 20 números da sequência de Fibonacci são:\n");

        for (int i = 0; i < n; i++) {
            result.append(fibonacci(i)).append(" ");
        }

        JOptionPane.showMessageDialog(null, result.toString(), "Sequência de Fibonacci",JOptionPane.INFORMATION_MESSAGE);
    }
// função que constrói a sequência
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}

