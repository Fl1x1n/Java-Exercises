package org.M10_Ft1;

public class Citadino extends Carro {
    public Citadino() {
    }

    //Redefinição do método buzina - sobreescrita (override)
    public void buzinar() {
//super.buzinar();
        System.out.println("Buzina do Citadino");
    }

}
