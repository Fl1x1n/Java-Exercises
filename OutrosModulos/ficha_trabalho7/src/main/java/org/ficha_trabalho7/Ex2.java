package org.ficha_trabalho7;

public class Ex2 {
    public static void main(String[] args) {
        int idade = 15;
        boolean amigoDoDono = true;
        if (idade < 18 && amigoDoDono == false) {
            System.out.println("Não pode entrar");
        }
        else {
            System.out.println("Pode entrar, porque é amigo do meu patrão!!!");
        }
    }
}
