package org.M11_Ft6;

import java.io.*;

import java.io.*;

class ContaBancaria implements Serializable {
    private int numC;
    private String titular;
    private double saldo;

    public ContaBancaria(int numC, String titular, double saldo) {
        this.numC = numC;
        this.titular = titular;
        this.saldo = saldo;
    }

    public int getnumC() {
        return numC;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Número da Conta: " + numC + ", Titular: " + titular + ", Saldo: " + saldo;
    }
}

class Banco {
    public static void main(String[] args) {
        ContaBancaria contaBancaria1 = new ContaBancaria(1, "José Tavares", 0);
        ContaBancaria contaBancaria2 = new ContaBancaria(2, "Maria Marques", 150);

        try {
            // Escrever objetos no arquivo
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("ContasBancarias.txt"));
            outputStream.writeObject(contaBancaria1);
            outputStream.writeObject(contaBancaria2);
            outputStream.close();

            // Ler objetos do arquivo e exibir na tela
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("ContasBancarias.txt"));
            ContaBancaria conta1 = (ContaBancaria) inputStream.readObject();
            ContaBancaria conta2 = (ContaBancaria) inputStream.readObject();
            inputStream.close();

            System.out.println("Conta 1: " + conta1);
            System.out.println("Conta 2: " + conta2);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
