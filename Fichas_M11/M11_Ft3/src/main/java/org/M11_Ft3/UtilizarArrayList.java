package org.M11_Ft3;

import java.util.ArrayList;

public class UtilizarArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(2);
        lista.add(4);
        lista.add(6);
        lista.add(8);
        lista.add(10);

        try {
            System.out.println("O elemento na posição 6 é: " + lista.get(5));
        } catch (IndexOutOfBoundsException erro) {
            System.out.println("O índice passado como parâmetro num dos métodos que estás a usar está fora dos limites do array.\n" + erro);
        }
    }
}