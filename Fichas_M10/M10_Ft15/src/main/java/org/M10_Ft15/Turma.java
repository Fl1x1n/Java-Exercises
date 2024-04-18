package org.M10_Ft15;

import java.util.Arrays;

public class Turma {
    public static void main (String args[]){
        String nomes[] = new String[11];
        nomes[0] = "Rodrigo Gaspar";
        nomes[1] = "Tiago Gonçalves";
        nomes[2] = "Tiago Santos";
        nomes[3] = "Tiago Carmo";
        nomes[4] = "Rafael Martins";
        nomes[5] = "Vítor Veríssimo";
        nomes[6] = "Rafael Matos";
        nomes[7] = "Leonardo Carrondo";
        nomes[8] = "Paulo Abrantes";
        nomes[9] = "Lucas Nabais";
        nomes[10] = "Moustapha Seydi";

        // Ordena por ordem alfabética
        Arrays.sort(nomes);

        // Mostra os nomes
        System.out.println("Nomes dos alunos em ordem alfabética:");
        for (String nome : nomes) {
            System.out.println(nome);
        }


        String nomePesquisado = "Vítor Veríssimo";
        int posicao = Arrays.binarySearch(nomes, nomePesquisado) + 1;
        //como já é do conhecimento, os dados são armazenados em 0's e 1's. BynarySearch irá pesquisar os nomes de acordo com as suas casas, alocadas em bits (0´s e 1's)
        System.out.println("\nA posição de " + nomePesquisado + " na lista é: " + posicao);
    }
}

