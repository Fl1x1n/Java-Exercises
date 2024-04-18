package org.Tarefa1_M12;

import javax.swing.*;
import java.awt.*;

public class Minha1Janela extends JFrame{
    public Minha1Janela (){
        setTitle("Tarefa1");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        JLabel label = new JLabel("Olá Mundo!");
        add(label);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Minha1Janela();
    }
}



