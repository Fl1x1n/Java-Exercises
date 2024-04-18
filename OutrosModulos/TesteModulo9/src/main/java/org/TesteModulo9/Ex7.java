package org.TesteModulo9;


class Pessoa {
    int anoNascimento;
    String nome;
}

public class Ex7 {

    // Método para calcular a idade com base no ano atual
    public static int calcularIdade(Pessoa pessoa) {
        int anoAtual = 2023;
        return anoAtual - pessoa.anoNascimento;
    }

    public static void main(String[] args) {
        Pessoa a1 = new Pessoa();
        Pessoa a2 = new Pessoa();

        a1.anoNascimento = 1879;
        a1.nome = "Albert Einstein";

        a2.anoNascimento = 1643;
        a2.nome = "Isaac Newton";

        // Chamando o método para calcular a idade e exibindo o resultado
        int idadeA1 = calcularIdade(a1);
        int idadeA2 = calcularIdade(a2);
        System.out.println("******** Sistema de Informações de Idade ********\n");
        System.out.println("Se " + a1.nome + " fosse vivo teria atualmente " + idadeA1 + " anos.");
        System.out.println("Se " + a2.nome + " fosse vivo teria atualmente " + idadeA2 + " anos.");
    }
}
