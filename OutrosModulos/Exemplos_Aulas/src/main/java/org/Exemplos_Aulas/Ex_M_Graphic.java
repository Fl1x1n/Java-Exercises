package org.Exemplos_Aulas;
import javax.swing.JOptionPane;
public class Ex_M_Graphic {
    public static void main(String[] args){
        String nome;
        nome= JOptionPane.showInputDialog("Insira o seu nome: ");
        String mensagem= "O nome inserido foi: " +nome;
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
