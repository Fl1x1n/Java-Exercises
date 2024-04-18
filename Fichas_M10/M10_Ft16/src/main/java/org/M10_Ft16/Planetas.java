package org.M10_Ft16;

public class Planetas {
    public static void main(String[] args) {
        //Sintax diferente do habitual, para variar um pouco :)
        String[] planetas = {
                "Mercurio",
                "Venus",
                "Terra",
                "Marte",
                "Jupiter",
                "Saturno",
                "Urano",
                "Neptuno"
        };



        // Como na ficha anterior, pesquisa a posição do planeta favorito (neste caso urano)
        String planetaFavorito = "Urano";
        int posicao = pesquisarPosicao(planetas, planetaFavorito);
        System.out.println("\nA posição de " + planetaFavorito + " na lista é: " + posicao);
    }

    // Método para ordenar os planetas por ordem alfabética
    // Sintax diferente. Tinha começado este exercício antes do teste(recorrendo a um site que ensina java (w3 schools)), por isso justifica um pouco a sintax confusa no meu teste.
    private static void ordenarPorOrdemAlfabetica(String[] planetas) {
        for (int i = 0; i < planetas.length - 1; i++) {
            for (int j = i + 1; j < planetas.length; j++) {
                if (planetas[i].compareTo(planetas[j]) > 0) {
                    // Troca os planetas com base na posição caso estes estejam fora de ordem
                    String temp = planetas[i];
                    planetas[i] = planetas[j];
                    planetas[j] = temp;
                }
            }
        }
    }

    // Método para pesquisar a posição de um planeta na lista
    private static int pesquisarPosicao(String[] planetas, String planeta) {
        for (int i = 0; i < planetas.length; i++) {
            if (planetas[i].equals(planeta)) {
                // Retorna a posição do planeta se encontrado
                return i + 1; // +1 para ajustar a posição inicial para 1 ao invés de 0
            }
        }
        // Retorna -1 se o planeta não for encontrado
        return -1;
    }
}
