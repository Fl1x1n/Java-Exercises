package org.M10_Ft11;

public class CartaoCliente {
    // Atributos
    private long numCartao;
    private String titCar;
    private double numPCar = 0;

    // Getters e Setters
    public long getNumCartao() {
        return numCartao;
    }

    public void setNumCartao(long numCartao) {
        this.numCartao = numCartao;
    }

    public String gettitCar() {
        return titCar;
    }

    public void settitCar(String titCar) {
        this.titCar = titCar;
    }

    public double getnumPCar() {
        return numPCar;
    }

    // Construtores
    public CartaoCliente() {
        this.numCartao = gerarNumeroCartao();
    }

    public CartaoCliente(String titCar) {
        this.numCartao = gerarNumeroCartao();
        this.titCar = titCar;
    }

    // Métodos
    private long gerarNumeroCartao() {
        // Código para gerar um número de cartão único
        return 1234567890;
    }

    public void creditarPontos(double valorCompra) {
        numPCar += valorCompra;
    }

    public void debitarPontos(double valorPremio) {
        numPCar -= valorPremio;
    }

    public void transferirPontos(CartaoCliente cartaoOrigem) {
        numPCar += cartaoOrigem.getnumPCar();
        cartaoOrigem.numPCar = 0;
    }

    public void mostrarPontos() {
        System.out.println(numPCar);
    }

    public static void main(String[] args) {
        CartaoCliente cc1 = new CartaoCliente("Carla");
        CartaoCliente cc2 = new CartaoCliente("Susana");

        System.out.println("Número do cartão de Carla: " + cc1.getNumCartao());
        System.out.println("Número do cartão de Susana: " + cc2.getNumCartao());
    }
}