package org.M12_Tarefa12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class ConversorTemperatura extends JFrame {
    public ConversorTemperatura() {
        Scanner sc = new Scanner(System.in);
        setTitle("Conversor de Temperatura");
        setSize(300, 150);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 3));
        JLabel jLabel1 = new JLabel("Tipo de Conversão");
        JLabel jLabel2 = new JLabel("Valor a Converter");
        JButton jButton1 = new JButton("Converter");
        JRadioButton jrb1 = new JRadioButton("Cº -> Fº");
        JRadioButton jrb2 = new JRadioButton("Fº -> Cº");
        JTextField textField1 = new JTextField(10);
        ButtonGroup bg1 = new ButtonGroup();
        JPanel radiobts = new JPanel();
        radiobts.add(jrb1);
        radiobts.add(jrb2);
        bg1.add(jrb1);
        bg1.add(jrb2);
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (jrb1.isSelected()) {
                    int res = (Integer.parseInt(textField1.getText()) * 9 / 5 + 32);
                    JOptionPane.showMessageDialog(null, "Resultado da Conversão: " + res);

                } else if (jrb2.isSelected()) {
                    int a=Integer.parseInt(textField1.getText());
                    int  res1 = (a - 32) * 5 / 9;
                    JOptionPane.showMessageDialog(null, "Resultado da Conversão: " + res1);
                }
            }
        });

        add(jLabel1);
        add(radiobts);
        add(jLabel2);
        add(textField1);
        add(jButton1);

        setVisible(true);
    }

    public static void main(String[] args) {
        new ConversorTemperatura();
    }
}
