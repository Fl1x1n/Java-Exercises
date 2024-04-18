package org.Exemplos_Aulas;
import javax.swing.*;

public class Notas_Alunos_Graphic_Interface {
    public static void main(String[] args) {
        String nAInput = JOptionPane.showInputDialog(null, "Insira o número de alunos:", "Número de Alunos", JOptionPane.QUESTION_MESSAGE);

        int nA = Integer.parseInt(nAInput);

        float[] notas = new float[nA];
        float s = 0, mn = -1, menorn = Float.MAX_VALUE;
        int p = 0, n = 0;

        for (int i = 0; i < notas.length; i++) {
            String input = JOptionPane.showInputDialog(null, "Insira a nota do aluno " + (i + 1) + ":", "Entrada de Notas", JOptionPane.QUESTION_MESSAGE);
            notas[i] = Float.parseFloat(input);
            s += notas[i];

            if (notas[i] > mn) {
                mn = notas[i];
            }

            if (notas[i] < menorn) {
                menorn = notas[i];
            }

            if (notas[i] >= 9.5) {
                p++;
            } else {
                n++;
            }
        }
        float media = s / notas.length;

        JOptionPane.showMessageDialog(null, "A média das notas é: " + media, "Média das Notas", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "A menor nota é: " + menorn, "Menor Nota", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "A maior nota é: " + mn, "Maior Nota", JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Notas p: " + p + "\nNotas n: " + n, "Notas p/n", JOptionPane.INFORMATION_MESSAGE);

        double porcentagemp = (double) p / notas.length * 100;
        JOptionPane.showMessageDialog(null, "Porcentagem de notas p: " + porcentagemp + "%", "Porcentagem de Notas p", JOptionPane.INFORMATION_MESSAGE);
    }
}
