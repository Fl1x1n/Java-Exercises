package org.InterGraph_P3;
import javax.swing.*;
import java.awt.*;
public class BoxLay extends JFrame{
    public BoxLay(){
        setTitle("Experiencias com Layouts - BoxLayout");
        setSize(150,300);
        setLocation(100,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel painel = new JPanel();
        painel.setLayout(new BoxLayout(painel,BoxLayout.Y_AXIS));
        for (int i = 0; i < 5; i++)
            painel.add(new JButton("Botão " + (i+1)));
        add(painel);
        setVisible(true);
    }
    public static void main(String[] args) {
        new BoxLay();

    }
}
