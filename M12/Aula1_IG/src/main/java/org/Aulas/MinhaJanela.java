package org.Aulas;

import javax.swing.*;
import java.awt.*;

public class MinhaJanela extends JFrame {
    public MinhaJanela() {
        setTitle("A minha janela");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon("C:\\Users\\Vítor\\Desktop\\Escola\\Turma 11ºGPI22_Vítor\\Programação - Exercícios\\Java\\Fichas\\M12\\Aulas\\src\\main\\java\\org\\Aulas\\PC.PNG").getImage());
        setLayout(new FlowLayout());
        add(new JScrollPane(new JTextArea(10, 10)));
        JLabel label = new JLabel("Olá Mundo!");
        add(label);
        JButton b3 = new JButton("Clica aqui!!");
        JPanel painel = new JPanel();
        painel.setBackground(new Color(200, 160, 255));
        JButton b1 = new JButton("yes");
        JButton b2 = new JButton("no");
        painel.add(b1);
        painel.add(b2);
        painel.add(b3);
        getContentPane().add(painel);
        setVisible(true);
        pack();
    }

    public static void main(String[] args) {
        new MinhaJanela();
    }
}
