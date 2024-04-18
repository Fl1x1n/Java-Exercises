package org.Aulas;
import javax.swing.*;
import java.awt.*;

public class FL extends JFrame{
    public FL() {
        setTitle("Experiencias com Layout - FlowLayout");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon("C:\\Users\\Vítor\\Desktop\\Escola\\Turma 11ºGPI22_Vítor\\Programação - Exercícios\\Java\\Fichas\\M12\\Aula1_IG\\src\\main\\java\\org\\Aulas\\PC.png").getImage());
        setLayout(new FlowLayout());
        JLabel rotulo = new JLabel("Escreva o seu nome:");
        JTextField caixaTexto = new JTextField(20);
        add(rotulo);
        add(caixaTexto);
        JLabel rotulo1 = new JLabel("O que achas da interface gráfica de java ?");
        add(rotulo1);
        JTextArea textArea = new JTextArea(5, 10);
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane);
        JButton button = new JButton("Ok");
        add(button);
        setVisible(true);
    }
        public static void main(String[] args){
            new FL();
        }
    }

