package org.M10_Ft1;

public class Carro {
    public void buzinar() {
    }

    public static class Carro1 {
        // Atributos
        private String marca;
        private String modelo;
        private float capacidadeTanqueCombustivel;

        // Construtores
        public Carro1() {
        }

        // Getters e Setters
        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public float getCapacidadeTanqueCombustivel() {
            return capacidadeTanqueCombustivel;
        }

        public void setCapacidadeTanqueCombustivel(float capacidadeTanqueCombustivel) {
            this.capacidadeTanqueCombustivel = capacidadeTanqueCombustivel;
        }

        // Métodos
        public void ligar() {
            System.out.println("Carro ligado");
        }

        public void desligar() {
            System.out.println("Carro desligado");
        }

        public void acelerar() {
            System.out.println("Carro acelerando");
        }

        public void travar() {
            System.out.println("Carro travando");
        }

        public void buzinar() {
            System.out.println("Buzina do Carro");
        }
    }
}
