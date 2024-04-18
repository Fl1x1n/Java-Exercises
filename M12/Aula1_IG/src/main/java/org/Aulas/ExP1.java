package org.Aulas;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExP1 extends JFrame {
    public ExP1(){
        setTitle("Exemplo de Botão");
        JButton jButton = new JButton("Clica aqui");
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jButton.setText("Clicaste no Botao");
                jButton.setFont(new Font("Metal Lord", Font.PLAIN, 20));
            }
        });
        add(jButton);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,200);
        setVisible(true);
    }
    public static void main (String args[]){
        new ExP1();
    }
}
