package org.M10_Ft10;

public class Banco1 {

    public static void main(String[] args) {
        // Cria uma conta bancária
        ContaBancaria conta1 = new ContaBancaria("Eddie the Head", 1986.0);

        // Imprime o número da conta e o saldo desta
        System.out.println("Número da conta: " + conta1.getnum());
        System.out.println("Saldo: " + conta1.getsal());

        // Faz um depósito de 100€
        conta1.depositar(100.0);

        // Mostra o saldo
        System.out.println("Saldo: " + conta1.getsal());

        // Faz um saca 20€
        conta1.levantar(20.0);

        // Mostra denovo o saldo
        System.out.println("Saldo: " + conta1.getsal());

        // Cria outra conta bancária
        ContaBancaria conta2 = new ContaBancaria("Vic Rattlehead", 666.0);

        // Imprime o número da  segunda conta e o seu saldo
        System.out.println("Número da conta: " + conta2.getnum());
        System.out.println("Saldo: " + conta2.getsal());

        // Comentário:
        // O número da conta 2 é diferente do número da conta 1, pois cada conta
        // tem um número único gerado automaticamente pelo método gerarNumero() da
        // classe ContaBancaria.
    }

}
