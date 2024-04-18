package org.M10_Ft8;

public class ConstroiCirculo extends FormaGeometrica {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(1.0, 1.0, 5.0);
        Circulo circulo2 = new Circulo(5.0, 2.0, 3.0);

        System.out.println("Perímetro do círculo 1: " + circulo1.calcularPerimetro());
        System.out.println("Área do círculo 1: " + circulo1.calcularArea());

        System.out.println("Perímetro do círculo 2: " + circulo2.calcularPerimetro());
        System.out.println("Área do círculo 2: " + circulo2.calcularArea());

        circulo2.aumentarRaio(2.0);

        System.out.println("Novo perímetro do círculo 2: " + circulo2.calcularPerimetro());
        System.out.println("Nova área do círculo 2: " + circulo2.calcularArea());

        if (circulo1.verificarRaioMaior(circulo2)) {
            System.out.println("O raio do círculo 1 é maior que o raio do círculo 2.");
        } else {
            System.out.println("O raio do círculo 1 não é maior que o raio do círculo 2.");
        }
    }

    static class Circulo {
        private double x;
        private double y;
        private double raio;

        public Circulo(double x, double y, double raio) {
            this.x = x;
            this.y = y;
            this.raio = raio;
        }

        public double calcularPerimetro() {
            return 2 * Math.PI * raio;
        }

        public double calcularArea() {
            return Math.PI * Math.pow(raio, 2);
        }

        public void aumentarRaio(double valor) {
            raio += valor;
        }

        public boolean verificarRaioMaior(Circulo outroCirculo) {
            return this.raio > outroCirculo.raio;
        }
    }
}