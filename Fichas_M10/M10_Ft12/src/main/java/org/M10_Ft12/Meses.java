package org.M10_Ft12;
import javax.swing.*;
public class Meses {
   public static void main (String args[]){
       String months[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
       String seasons[] ={"Inverno", "Inverno", "Primavera", "Primavera", "Primavera", "Verão", "Verão", "Verão", "Outono", "Outono", "Outono", "Inverno"};
       String days[] = {"31", "28 ou 29", "31", "30", "31", "30", "31", "31", "30", "31", "30", "31"};
       int i;
       System.out.printf("|----Meses do Ano----|");
       for (i=0;i<=12;i++){
           /* No Terminal
           System.out.printf("\n%d mês: %s tem %s dias e é da estação %s\n", i+1, months[i], days[i], seasons[i]);
            */
           // é criada uma variável de tipo jframe, que posteriormente será usada como instância para "acomodar" o Joptionpane
           JFrame f;
           f=new JFrame();
           JOptionPane.showMessageDialog(f, i+1 +" mês: " + months[i] + " tem " + days[i] + " dias e é da estação " + seasons[i] + "\n");
       }
   }
}
