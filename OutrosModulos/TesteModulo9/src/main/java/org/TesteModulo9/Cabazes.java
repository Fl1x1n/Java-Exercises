package org.TesteModulo9;
import java.util.Scanner;
public class Cabazes {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Introduz um valor para o 1º: ");
            float c1 = scanner.nextFloat();
            System.out.print("Introduz um valor para o 2º: ");
            float c2 = scanner.nextFloat();
            System.out.print("Introduz um valor para o 3º: ");
            float c3 = scanner.nextFloat();
            System.out.print("Introduz um valor para o 4º: ");
            float c4 = scanner.nextFloat();
            System.out.print("Introduz um valor para o 5º: ");
            float c5 = scanner.nextFloat();

            float tV = c1 + c2 + c3 + c4 + c5;

            if (tV > 50) {
                System.out.println("Teve lucro.");
            } else {
                System.out.println("No próximo mês será melhor.");
            }
        }
    }

