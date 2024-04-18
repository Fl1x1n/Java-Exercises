package org.InterGraph_P3;
import javax.swing.*;
import java.awt.*;

public class FlowLay extends JFrame{
    public FlowLay(){
        setTitle("Experiências com Layouts - Flow Layout");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon().getImage());
        setLayout(new FlowLayout());
        JLabel rotulo = new JLabel("Escreva o seu nome: ");
        JTextField caixatexto = new JTextField(20);
        add(rotulo);
        add(caixatexto);
        JLabel rotulo1 = new JLabel("O que acha da interface Gráfica do Java ?");
        add(rotulo1);
        JTextArea textArea = new JTextArea(5, 10);
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane);
        JButton button = new JButton("Ok");
        add(button);
        setVisible(true);

    }
    public static void main (String args[]){
        new FlowLay();
    }
}
