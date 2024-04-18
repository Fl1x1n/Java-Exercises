package org.M10_Ft9;

public class Citadino extends Carro {
    public Citadino() {
    }

    //Redefinição do método buzina - sobreescrita (override)
@Override
    public void buzinar() {
//super.buzinar();
        System.out.println("Buzina do Citadino");
    }
// aqui já podemos usar o override, pois citadino é uma classe não principal (subclasse)
}
