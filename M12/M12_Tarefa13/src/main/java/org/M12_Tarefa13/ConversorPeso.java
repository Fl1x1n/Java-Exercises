package org.M12_Tarefa13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class ConversorPeso extends JFrame {
    public ConversorPeso() {
        String[] opt = {"Onças -> gramas", "gramas -> Onças"};
        Scanner sc = new Scanner(System.in);
        setTitle("Conversor de Peso");
        setSize(300, 150);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 3));
        JLabel jLabel1 = new JLabel("Tipo de Conversão");
        JLabel jLabel2 = new JLabel("Valor a Converter");
        JButton jButton1 = new JButton("Converter");
        JTextField textField1 = new JTextField(10);
        JComboBox<String> jComboBox1 = new JComboBox<>(opt);
        JLabel jLabel3 = new JLabel("Resultado");
        JTextField Resultado_caixa = new JTextField();
        Resultado_caixa.setEditable(false);

        jComboBox1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (jComboBox1.getSelectedIndex()==0){
                    double res1 = (Double.parseDouble(textField1.getText()) / 28.34952);
                    Resultado_caixa.setText(Double.toString(res1));

                } else if (jComboBox1.getSelectedIndex()==1) {
                    double res2 = (Double.parseDouble(textField1.getText()) * 28.34952);
                    Resultado_caixa.setText(Double.toString(res2));
                }
            }
        });

        add(jLabel2);
        add(textField1);
        add(jLabel1);
        add(jComboBox1);
        add(jLabel3);
        add(Resultado_caixa);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ConversorPeso();
    }
}
