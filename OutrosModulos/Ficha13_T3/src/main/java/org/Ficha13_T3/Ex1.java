package org.Ficha13_T3;
import java.util.*;
import javax.swing.JOptionPane;
class Retangulo {
    private double x1, y1, x2, y2;
    public Retangulo() {
    }
    public Retangulo(double x1, double y1, double x2, double y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;

    }
    public double calculabase(){
        return x2 - x1;
    }
    public double calcularaltura(){
        return y2 - y1;
    }
    public double calcularper(){
        double base = calculabase();
        double altura = calcularaltura();
        return 2 * base + 2 * altura;
    }
    public double calcularArea() {
        double base = calculabase();
        double altura = calcularaltura();
        return base * altura;
    }
}
public class Ex1 {
    public static void main (String args[]){
        Retangulo MF = new Retangulo(2.0, 1.0, 4.0, 5.0);


        System.out.println("Base do retângulo: " + MF.calculabase());
        System.out.println("Altura do retângulo: " + MF.calcularaltura());
        System.out.println("Perímetro do retângulo: " + MF.calcularper());
        System.out.println("Área do retângulo: " + MF.calcularArea());
    }
}

