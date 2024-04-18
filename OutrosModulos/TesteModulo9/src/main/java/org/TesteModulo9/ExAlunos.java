package org.TesteModulo9;
import java.util.Scanner;
public class ExAlunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escreve o Nº de alunos na turma: ");
        int tamT = scanner.nextInt();


        String[] nAlunos = new String[tamT];
        int i;
        System.out.print("Digite os nomes dos alunos:\n");
        for (i = 0; i < tamT; i++) {
            System.out.print(" nº " + (i + 1) + ": ");
            nAlunos[i] = scanner.next();
        }


        System.out.println("11º GPSI - " + i + " alunos\n");
        for (i=0; i<tamT; i++) {
            System.out.println("Nº"+ i + ": " + nAlunos[i]);

        }
    }
}