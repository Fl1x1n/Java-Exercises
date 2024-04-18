package org.M12_Tarefa14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculosCirculo extends JFrame {
    public CalculosCirculo (){
        setTitle("Círculo");
        setSize(230,150);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        JLabel jlabel1 = new JLabel("Medida do raio: ");
        JTextField jtextfield1 = new JTextField(10);
        JCheckBox jcheckbox1 = new JCheckBox("Área");
        JCheckBox jcheckbox2 = new JCheckBox("Perímetro");
        JButton jbutton1 = new JButton("Calcular");

        jbutton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (jcheckbox1.isSelected()){

                    double res = (Double.parseDouble(jtextfield1.getText()) * 3.141592653589793 * 2);
                    String msg = String.format("Área: %.2f", res);
                    // reduz as casas décimais para 2 (fica mais agradável à vista :)
                    JOptionPane.showMessageDialog(null, msg);
                }
                if (jcheckbox2.isSelected()){
                    double res = (Double.parseDouble(jtextfield1.getText())* 3.141592653589793 * Double.parseDouble(jtextfield1.getText()));
                    String msg = String.format("Perímetro: %.2f", res);
                    JOptionPane.showMessageDialog(null, msg);
                }
            }
        });

        add(jlabel1);
        add(jtextfield1);
        add(jcheckbox1);
        add(jcheckbox2);
        add(jbutton1);
        setVisible(true);
    }
    public static void main (String args[]){
        new CalculosCirculo();
    }
}
