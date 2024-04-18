package org.M10_T12_Ft5;

public class Citadino extends Carro {
    public Citadino() {
    }

    //Redefinição do método buzina - sobreescrita (override)
    public void buzinar() {
//super.buzinar();
        System.out.println("Buzina do Citadino");
    }

}
