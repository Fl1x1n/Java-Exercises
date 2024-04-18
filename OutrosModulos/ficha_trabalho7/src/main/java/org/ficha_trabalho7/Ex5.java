package org.ficha_trabalho7;
import javax.swing.*;
public class Ex5 {
    public static void main(String[] args) {
        String str = JOptionPane.showInputDialog("Digite um número");
        int num = Integer.parseInt(str);
        for (int i = 1; i<=num; i++) {
            if(num%i==0){
                System.out.println(i);
            }
        }
    }
}
