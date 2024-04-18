package org.FT7;
import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Introduza o seu Nome: ");
        String Nome = input.next();

        System.out.println("Introduza a sua 1ª Nota: ");
        Float Nota1 = input.nextFloat();

        System.out.println("Introduza a sua 2ª Nota: ");
        Float Nota2 = input.nextFloat();

        System.out.println("Introduza a sua 3ª Nota: ");
        Float Nota3 = input.nextFloat();

        input.close();

        float media = (Nota1+Nota2+Nota3)/3;

        System.out.println("Nome: " + Nome);
        System.out.printf("Média das Notas: %.2f ", media);

    }
}
