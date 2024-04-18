package org.Ft9;
import javax.swing.*;
public class Ex3 {
    public static void main(String[] args) {

        String result = "";

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                result += i + " ";
            }
        }

        JOptionPane.showMessageDialog(null, result, "Múltiplos de 3 entre 1 e 100", JOptionPane.INFORMATION_MESSAGE);
    }
}
