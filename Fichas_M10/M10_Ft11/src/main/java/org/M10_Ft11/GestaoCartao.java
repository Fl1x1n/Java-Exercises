package org.M10_Ft11;

public class GestaoCartao {

    public static void main(String[] args) {
        // Cria duas instâncias da classe CartaoCliente
        CartaoCliente cartao1 = new CartaoCliente("Carla");
        CartaoCliente cartao2 = new CartaoCliente("Susana");

        // Imprime o número do cartão de cada cliente
        System.out.println("Número do cartão de Carla: " + cartao1.getNumCartao());
        System.out.println("Número do cartão de Susana: " + cartao2.getNumCartao());
    }
}