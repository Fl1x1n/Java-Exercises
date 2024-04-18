package org.Aulas;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OP extends JFrame {
    public OP(){
        setTitle("Exemplo de Botão");

        JButton jButton1 = new JButton("Ouro");
        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Clicaste no Ouro");
            }
        });

        JButton jButton2 = new JButton("Prata");
        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Clicaste na Prata");
            }
        });

        JPanel panel = new JPanel();
        panel.add(jButton1);
        panel.add(jButton2);

        add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,200);
        setVisible(true);
    }

    public static void main (String args[]){
        new OP();
    }
}
