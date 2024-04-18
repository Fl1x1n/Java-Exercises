package org.M10_Ft13;
import javax.swing.*;
public class Iguais {
    public static void main(String args[]) {
        int ar1[] = {24, 12, 45};
        int ar2[] = {24, 13, 45};
        JFrame f;
        JFrame g;
        int i;
        f = new JFrame();
        g = new JFrame();
        // é criada uma variável de tipo jframe, que posteriormente será usada como instância para "acomodar" o Joptionpane
        for (i = 0; i < 3; i++) {
            if (ar1[i] == ar2[i]) {


                JOptionPane.showMessageDialog(f, "A variável da casa " + (i+1) +" é igual");
            } else {
                JOptionPane.showMessageDialog(g, "A variável da casa " + (i+1) +" é diferente");
            }
        }
        // Função Útil
        System.exit(0); // Para o código

    }
}
