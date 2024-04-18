package org.M12_Tarefa11;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
public class MaquinaSomar extends JFrame {
    public MaquinaSomar(){

        Scanner  scan = new Scanner(System.in);
        setTitle("Máquina de Somar");
        setSize (300,150);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(4,4));
        JLabel rotulo1 = new JLabel("Primeiro Número");
        JTextField textField = new JTextField(10);
        JLabel res = new JLabel();
        JLabel rotulo2 = new JLabel("Segundo Número");
        JTextField jTextField2 = new JTextField(10);
        JLabel resultado = new JLabel("Resultado");
        JTextField Resultado_caixa = new JTextField();
        Resultado_caixa.setEditable(false);

        JButton bt_somar = new JButton("Somar");
        bt_somar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int res = Integer.parseInt(textField.getText()) + Integer.parseInt(jTextField2.getText());
                // JOptionPane.showMessageDialog(null,"Resultado da soma: " + res);
                Resultado_caixa.setText(Integer.toString(res));
            }
        });
        JButton bt_subtrair = new JButton("Subtrair");
        bt_subtrair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int res = Integer.parseInt(textField.getText()) - Integer.parseInt(jTextField2.getText());
                // JOptionPane.showMessageDialog(null, "Resultado da subtração: " + res);
                Resultado_caixa.setText(Integer.toString(res));
            }
        });


        add(rotulo1);
        add(textField);
        add(rotulo2);
        add(jTextField2);
        add(bt_somar);
        add(bt_subtrair);
        add(resultado);
        add(Resultado_caixa);
        setVisible(true);
    }
    public static void main (String args[]){
        new MaquinaSomar();
    }
}
