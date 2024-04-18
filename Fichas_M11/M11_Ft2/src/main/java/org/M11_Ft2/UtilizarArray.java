package org.M11_Ft2;
import java.util.Scanner;

public class UtilizarArray {
    public static void main(String[] args) {

        String[] nomes = new String[3];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Introduza o nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        System.out.println("O nome na posição 3 é: " + nomes[2]);
      /*Caso nós coloquemos "3" no índice da posição, o código irá dizer que esse
        mesmo índice estará fora de "margem" visto que só escrevemos 3 nomes e a (dito
        de forma informal) fila de casas começa no 0. (casa 0, casa 1 e casa 2)
       */

        try {
            System.out.println("O nome na posição 3 é: " + nomes[3]);
        }catch (Exception erro) {
            erro.printStackTrace();
        }
        scanner.close();

    }
}
