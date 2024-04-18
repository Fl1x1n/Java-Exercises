package org.M10_Ft14;

import javax.swing.*;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        //vai ler num como uma string e depois transformar num int com o "Integer.parseInt"
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um número: "));
        String teste[] = new String[10];
        teste[0] = "Iron Maiden";
        teste[1] = "Judas Priest";
        teste[2] = "Black Sabbath";
        teste[3] = "Megadeth";
        teste[4] = "The Smiths";
        teste[5] = "Vítor Veríssimo";
        teste[6] = "Pantera";
        teste[7] = "The Doors";
        teste[8] = "Pink Floyd";
        teste[9] = "Scorpions";

        if (num >= 0 && num <= 9) {
            JOptionPane.showMessageDialog(null, "Teste do Aluno: " + teste[num]);
        } else {
            JOptionPane.showMessageDialog(null, "Número inválido. Insira um número entre 0 e 9.");
        }
        System.exit(0);
    }
}