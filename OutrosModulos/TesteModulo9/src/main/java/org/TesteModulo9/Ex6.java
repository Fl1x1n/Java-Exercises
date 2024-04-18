package org.TesteModulo9;
import java.util.Scanner;
public class Ex6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("********** Empresa XPTO **********");
        System.out.print("Qual o nome do Empregado: ");
        String nome = scanner.nextLine(); // Esta linha é inútil visto que o nome não é usado. Fica cá na mesma


        System.out.print("Salário Atual:");
        float sal_at = scanner.nextFloat();
        System.out.print("Qual o código do cargo (1 - Gerente, 2 - Engenheiro, 3 - Técnico): ");
        int codigoCargo = scanner.nextInt();

        float salarioAumentado = 0;

        switch (codigoCargo) {
            case 1: // Gerente
                salarioAumentado = sal_at * 0.1f + sal_at;
                break;
            case 2: // Engenheiro
                salarioAumentado = sal_at * 0.2f + sal_at;
                break;
            case 3: // Técnico
                salarioAumentado = sal_at * 0.3f + sal_at;
                break;
            default:
                System.out.println("Código de cargo inválido.");
        }

        System.out.println("Salário com aumento: " + salarioAumentado + " €");
    }
}
