package org.ficha_trabalho7;
import java.util.Scanner;
public class Ex8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x,y;
        System.out.print("Digite o um número: ");
        x = input.nextInt();
        System.out.print("Digite um número diferente do primeiro: ");
        y = input.nextInt();
        if
        ( x > y ){
            System.out.println( +x+ " ... " +y);
        }
        else
        {
            if ( x < y ) {
                System.out.print ( +y+ " ... " +x);
            }
        }
    }
}
