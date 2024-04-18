package org.TesteModulo9;
import java.util.Scanner;
public class Ex4 {
    // este é ambos exercicio 4 e 5. Só reparei que estavam os dois juntos após acabar o código de ambos
        public static void main(String[] args) {
            boolean continuar;

            do{
            Scanner scanner = new Scanner(System.in);
            System.out.println("********** Empresa XPTO **********");
            System.out.print("Qual o nome do Empregado: ");
            String nome = scanner.nextLine(); // esta linha é inútil visto que o nome não é usado. Fica cá na mesma

            System.out.print("Qual a idade do empregado: ");
            int idade = scanner.nextInt();

            System.out.print("Qual o número de anos de serviço: ");
            int anSer = scanner.nextInt();

            System.out.print("Qual o número de filhos: ");
            int numFilhos = scanner.nextInt();

            float ajudaCusto = 0;

            if (idade > 45) {
                ajudaCusto += 5 * (idade - 45);
            }

            if (anSer <= 10) {
                ajudaCusto += 10 * anSer;
            } else {
                ajudaCusto += 10 * 10 + 20 * (anSer - 10);
            }

        ajudaCusto += 25 * numFilhos;

            System.out.println("Ajuda de custo: " + ajudaCusto + " €");
                System.out.print("Quer indicar outro empregado? (sim/não): ");
                scanner.nextLine(); // Limpar o buffer antes de ler a resposta, como o fflush em C
                String resposta = scanner.nextLine().toLowerCase();

                continuar = resposta.equals("sim");

            }
            while(continuar);
        }
        }


