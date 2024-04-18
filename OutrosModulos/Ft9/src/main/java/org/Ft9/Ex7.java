package org.Ft9;
import javax.swing.JOptionPane;
public class Ex7 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite um valor inteiro para x:");

        try {
            int x = Integer.parseInt(input);
            StringBuilder result = new StringBuilder();

            while (x != 1) {
                result.append(x).append(" -> ");

                if (x % 2 == 0) {
                    x = x / 2;
                } else {
                    x = 3 * x + 1;
                }
            }

            result.append(x);
            JOptionPane.showMessageDialog(null, "Saída do programa para x = " + input + ":\n" + result.toString());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, insira um valor inteiro válido.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
