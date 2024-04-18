package org.Tarefa3_M10;

public class Retangulo {


    int x1, y1, x2, y2;


    public Retangulo() {

        x1 = 0;
        y1 = 0;
        x2 = 1;
        y2 = 1;
    }


    public Retangulo(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }


    public int calcularBase() {
        return Math.abs(x2 - x1);
    }


    public int calcularAltura() {
        return y2 - y1;
    }


    public int calcularPerimetro() {
        int base = calcularBase();
        int altura = calcularAltura();
        return 2 * base + 2 * altura;
    }


    public int calcularArea() {
        int base = calcularBase();
        int altura = calcularAltura();
        return base * altura;
    }

    // Exemplo de uso
    public static void main(String[] args) {

        Retangulo retangulo1 = new Retangulo();


        Retangulo retangulo2 = new Retangulo(1, 2, 4, 6);


        System.out.println("Retângulo 1 - Base: " + retangulo1.calcularBase() + ", Altura: " + retangulo1.calcularAltura());
        System.out.println("Retângulo 2 - Perímetro: " + retangulo2.calcularPerimetro() + ", Área: " + retangulo2.calcularArea());
    }
}