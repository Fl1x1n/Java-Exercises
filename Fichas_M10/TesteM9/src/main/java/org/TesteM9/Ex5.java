package org.TesteM9;
import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("\nIndique a quantia que gastou na sua compra: ");
        float compra = input.nextFloat();
        input.close();

        float SiT = compra/3;

        System.out.printf("\nEste é o valor de cada prestação:%.2f\n",SiT );
    }
}
