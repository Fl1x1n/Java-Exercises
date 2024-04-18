package org.FT10;

public class FT10 {
    public static void main(String[] args) {
        Conta minhaConta = new Conta();
        minhaConta.titular = "Maria";
        minhaConta.saldo = 1000.0;
        System.out.println("Saldo atual: " + minhaConta.saldo);

        // Teste do método levanta
        minhaConta.saldo = 1000;
        boolean consegui = minhaConta.levanta(2000);
        if (consegui) {
            System.out.println("Consegui levantar");
        } else {
            System.out.println("Não consegui levantar");
        }

        // Teste do método deposita
        minhaConta.deposita(500);
        System.out.println("Novo saldo após depósito: " + minhaConta.saldo);

        // TestaReferencias
        TestaReferencias.testaReferencias();

        // TestaCarro
        TestaCarro.testaCarro();
    }
}

class Conta {
    String titular;
    double saldo;

    boolean levanta(double quantidade) {
        if (this.saldo >= quantidade) {
            this.saldo -= quantidade;
            System.out.println("Saque de " + quantidade + " realizado com sucesso.");
            return true;
        } else {
            System.out.println("Saldo insuficiente para saque de " + quantidade);
            return false;
        }
    }

    void deposita(double quantidade) {
        this.saldo += quantidade;
        System.out.println("Depósito de " + quantidade + " realizado com sucesso.");
    }
}

class TestaReferencias {
    public static void testaReferencias() {
        Conta c1 = new Conta();
        c1.deposita(100);
        Conta c2 = c1;
        c2.deposita(200);
        System.out.println("Saldo c1: " + c1.saldo);
        System.out.println("Saldo c2: " + c2.saldo);
    }
}

class Carro {
    String cor;
    String modelo;
    double velocidadeAtual;
    double velocidadeMaxima;

    void liga() {
        System.out.println("O carro está ligado");
    }

    void acelera(double quantidade) {
        double velocidadeNova = this.velocidadeAtual + quantidade;
        this.velocidadeAtual = velocidadeNova;
    }

    int pegaMarcha() {
        if (this.velocidadeAtual < 0) {
            return -1;
        }
        if (this.velocidadeAtual < 40) {
            return 1;
        }
        if (this.velocidadeAtual < 80) {
            return 2;
        }
        return 3;
    }
}

class TestaCarro {
    public static void testaCarro() {
        Carro meuCarro = new Carro();
        meuCarro.cor = "Verde";
        meuCarro.modelo = "Fusca";
        meuCarro.velocidadeAtual = 0;
        meuCarro.velocidadeMaxima = 80;

        meuCarro.liga();
        meuCarro.acelera(20);
        System.out.println("Velocidade atual do carro: " + meuCarro.velocidadeAtual);
    }
}
