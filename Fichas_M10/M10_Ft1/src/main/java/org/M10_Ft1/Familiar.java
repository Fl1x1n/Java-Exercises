package org.M10_Ft1;

public class Familiar extends Carro {
    public Familiar() {
    }

    //Redefinição do método buzina - sobreescrita (override)
    public void buzinar() {
//super.buzinar();
        System.out.println("Buzina do Familiar");
    }

    //Métodos
    public void desligarAirbagPassageiro() {
        //Código aqui
    }
}
