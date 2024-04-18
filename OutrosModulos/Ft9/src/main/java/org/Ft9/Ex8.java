package org.Ft9;
import javax.swing.JOptionPane;
public class Ex8 {

    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para gerar a tabela:"));

        StringBuilder tabela = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                tabela.append(i * j).append(" ");
            }
            tabela.append("\n");
        }

        JOptionPane.showMessageDialog(null, "Tabela multiplicativa para n = " + n + ":\n" + tabela.toString());
    }
}