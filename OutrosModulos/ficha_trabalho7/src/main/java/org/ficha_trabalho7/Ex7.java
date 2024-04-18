package org.ficha_trabalho7;
import java.util.Scanner;
public class Ex7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y;
        System.out.print("Digite um número: ");
        x = input.nextInt();
        System.out.print("Digite um número diferente do primeiro: ");
        y = input.nextInt();
        if ( x < y ) {
            System.out.printf("O numero " +x+ "é o menor");
        }
        else
        {
            if ( x > y ){
                System.out.printf("O numero " +y+ "é menor");
            }
        }
    }
}
