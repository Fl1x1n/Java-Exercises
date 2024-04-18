package org.TesteM9;
import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("\nInsira o seu peso: ");
        float p = input.nextFloat();
        System.out.println("Insira a sua altura: ");
        float a = input.nextFloat();

        input.close();

        float imc=p/(a*a);

        System.out.println("O Seu IMC é de: " +imc);
    }
}
