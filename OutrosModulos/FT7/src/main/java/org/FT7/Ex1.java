package org.FT7;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args ){

        Scanner mysanaDT = new Scanner(System.in);
        System.out.println("Introduz a distância que percorreste com o teu carro: ");
        float DT = mysanaDT.nextFloat();
        // As três linhas de cima irão guardar os dados que o utilizador introduziu na variável DT

        Scanner mysanaG = new Scanner(System.in);
        System.out.println("Introduza o combustível que o carro gastou no total: ");
        float Gasoile= mysanaG.nextFloat();
        // As três linhas de cima irão guardar os dados que o utilizador introduziu na variável Gasoile

        mysanaG.close();
        mysanaDT.close();

        // As linhas de cima fecham o scanner e as de baixo calculam e imprimem a media do consumo

        float Media_Gaesoile = DT / Gasoile;
        System.out.println("Este é o consumo  médio do teu carro: " + Media_Gaesoile);
    }
}
