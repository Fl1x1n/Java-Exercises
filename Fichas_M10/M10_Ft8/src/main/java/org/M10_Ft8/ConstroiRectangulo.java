package org.M10_Ft8;

class Retangulo {
    private static double x1;
    private static double y1;
    private static double x2;
    private static double y2;

    public Retangulo(double x1, double y1, double x2, double y2) {
        Retangulo.x1 = x1;
        Retangulo.y1 = y1;
        Retangulo.x2 = x2;
        Retangulo.y2 = y2;
    }
    static double base() {
        return x2-x1;
    }
    static double altura() {
        return y2-y1;
    }
    static double perimetro() {
        return 2*base()+2*altura();
    }
    static double area() {
        return base()*altura();
    }
}
public class ConstroiRectangulo extends FormaGeometrica {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(2.0, 1.0, 4.0, 5.0);
        System.out.println("Base: " + Retangulo.base());
        System.out.println("Altura: " + Retangulo.altura());
        System.out.println("Perímetro: " + Retangulo.perimetro());
        System.out.println("Área: " + Retangulo.area());
    }
}
