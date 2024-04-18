package org.ficha_trabalho7;
import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        double nota1, nota2, nota3, media;
        System.out.println("Entre com a primeira nota:");
        nota1 = new Scanner(System.in).nextDouble();
        System.out.println("Entre com a segunda nota:");
        nota2 = new Scanner(System.in).nextDouble();
        System.out.println("Entre com a terceira nota:");
        nota3 = new Scanner(System.in).nextDouble();
        media = (nota1+nota2+nota3)/3;
        if(media >= 7) {
            System.out.println("Aprovado com média "+media);
        }
        else if(media >=5) {
            System.out.println("Recuperação com média "+media);
        }
        else {
            System.out.println("Reprovado com média "+media);
        }
    }
}
