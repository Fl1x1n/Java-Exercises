package org.Ft11;
import java.util.Scanner;

class Aluno {
    int id;
    String nome;
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            Aluno a1 = new Aluno();
            Aluno a2 = new Aluno();

            a2.id = 17;
            a2.nome = "Zé";

            a1.id = 15;
            a1.nome = "Bruno";

            System.out.println(a1.id);
            System.out.println(a1.nome);
            System.out.println(a1.id + " - " + a1.nome);

            System.out.println(a2.id);
            System.out.println(a2.nome);
            System.out.println(a2.id + " - " + a2.nome);

            System.out.println("Queres correr o programa outra vez ?");
            char escolhe = scanner.next().charAt(0);

            if (escolhe != 's' && escolhe != 'S') {
                break;
            }

        } while (true);

        System.out.println("Programa terminado");
    }
}
