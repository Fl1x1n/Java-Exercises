package org.InterGraph_P3;
import java.awt.*;
import javax.swing.*;

public class BorderLay extends JFrame {
    public BorderLay(){
        setTitle("Experiencias com Layouts - BorderLayout");
        setSize(350,150);
        setLocation(100,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        JButton botaoNorte = new JButton("Norte");
        JButton botaoSul = new JButton("Sul");
        JButton botaoOeste = new JButton("Oeste");
        JButton botaoEste = new JButton("Este");
        JButton botaoCentro = new JButton("Centro");
        add("North", botaoNorte);
        add("South", botaoSul);
        add("West", botaoOeste);
        add("East", botaoEste);
        add("Center", botaoCentro);
        setVisible(true);
        pack();
    }
    public static void main(String[] args){
        new BorderLay();
    }
}
