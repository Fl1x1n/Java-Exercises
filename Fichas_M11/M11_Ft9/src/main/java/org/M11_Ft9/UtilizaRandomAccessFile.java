package org.M11_Ft9;

import java.io.*;

public class UtilizaRandomAccessFile {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        try (RandomAccessFile archive = new RandomAccessFile("C:\\Users\\Vítor\\Desktop\\Escola\\Turma 11ºGPI22_Vítor\\Programação - Exercícios\\Java\\Fichas\\Fichas_M11\\M11_Ft9\\src\\main\\java\\org\\M11_Ft9\\numeros.txt", "rw")) {
        // o rw indica que será feita a leitura (read) e a escrita (write)
            int length = 10;
            /*era possível fazer de uma maneira mais otimizada usando o .length,
            porém assim fica mais simples a nível de sintax (preguiça também)
             */
            for (int i = 0; i < length; i++) {
                int numero = nums[i];
                archive.writeInt(numero);
            }
            // vai escrever os números no meu ficheiro

            System.out.println("Posição atual do ponteiro: " + archive.getFilePointer());
            /*com algum conhecimento de inglês, sabemos que este print irá mostrar
            onde temos o nosso apontador
             */


            archive.seek(16);
            //troca a posição do apontador para 16

            int numposition20= archive.readInt();
            /*o readInt irá ler o número que se encontra a 4 bytes
            na frente da posição do apontador. Visto que o apontador
            está no 16, irá andar 4 bytes (16+4=20), dando portanto
            o número que está na "casa" 20
             */
            System.out.println("Número da posição 20 bytes: " + numposition20);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
