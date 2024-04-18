package org.Ft9;
import javax.swing.*;
public class Ex4 {
    public static void main(String[] args) {

        String resultados = "";


        for (int n = 1; n <= 10; n++) {
            long fatorial = calcularFatorial(n);
            resultados += "O fatorial de " + n + " é: " + fatorial + "\n";
        }


        JOptionPane.showMessageDialog(null, resultados, "Fatoriais de 1 a 10", JOptionPane.INFORMATION_MESSAGE);
    }

//Estrutura própria para calcular o Fatorial. Bastante parecido com o C
    private static long calcularFatorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            long resultado = 1;
            for (int i = 1; i <= num; i++) {
                resultado *= i;
            }
            return resultado;
        }
    }
}
