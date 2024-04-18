package org.Aulas;

import javax.swing.*;
import java.awt.*;

public class GL extends JFrame {
    public GL (){
        setTitle("Experéiências com Layouts - GridLayout");
        setSize(350, 150);
        setLocation(100,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3,2));
        JLabel rotulo1 = new JLabel("Escreva o nome de um Fruto");
        JTextField textField = new JTextField(10);
        JLabel rotulo2 = new JLabel("Selecione uma Bebida");
        JComboBox comboBox = new JComboBox();
        comboBox.addItem("Água");
        comboBox.addItem("Veneno");
        comboBox.addItem("Leite");
        comboBox.addItem("Vinho");
        JButton jButton = new JButton("ok");
        add(rotulo1);
        add(textField);
        add(rotulo2);
        add(comboBox);
        add(jButton);
        pack();
        setVisible(true);
    }
    public static void main (String args[]){
        new GL();
    }
}
