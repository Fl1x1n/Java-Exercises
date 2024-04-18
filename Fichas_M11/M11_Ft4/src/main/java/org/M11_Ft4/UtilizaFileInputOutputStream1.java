package org.M11_Ft4;

import java.io.*;

public class UtilizaFileInputOutputStream1 {
    public static void main(String[] args) {
        String nomeArquivo1 = "C:\\Users\\Vítor\\Desktop\\Escola\\Turma 11ºGPI22_Vítor\\Programação - Exercícios\\Java\\Fichas\\Fichas_M11\\M11_Ft4\\src\\main\\java\\org\\M11_Ft4\\Inteiros1.txt";
        String nomeArquivo2 = "C:\\Users\\Vítor\\Desktop\\Escola\\Turma 11ºGPI22_Vítor\\Programação - Exercícios\\Java\\Fichas\\Fichas_M11\\M11_Ft4\\src\\main\\java\\org\\M11_Ft4\\Inteiros2.txt";

        try (FileReader fileReader = new FileReader(nomeArquivo1);
             BufferedReader bufferedReader = new BufferedReader(fileReader);
             FileWriter fileWriter = new FileWriter(nomeArquivo2);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

            String linha;
            while ((linha = bufferedReader.readLine()) != null) {
                try {
                    // Escreve a linha diretamente no arquivo de saída
                    bufferedWriter.write(linha);
                    bufferedWriter.newLine();
                } catch (NumberFormatException e) {
                    // Se a linha não contiver um número, ignorar
                }
            }
            System.out.println("Números transferidos com sucesso do arquivo de entrada para o arquivo de saída.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
