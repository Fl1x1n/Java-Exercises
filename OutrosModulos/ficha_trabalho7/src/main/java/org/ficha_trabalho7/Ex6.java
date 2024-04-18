package org.ficha_trabalho7;
import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Digite um número: ");
        num = input.nextInt();
        if ( num >= 20 ){
            System.out.print( "O número " +num+ " é maior que 20");
        }
        else
        {
            if ( num < 20 ){
                System.out.print( "O número " +num+ " é menor que 20");
            }
        }
    }
}
