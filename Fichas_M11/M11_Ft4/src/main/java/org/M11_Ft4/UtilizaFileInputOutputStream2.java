package org.M11_Ft4;

import java.io.*;

public class UtilizaFileInputOutputStream2 {
    public static void main(String[] args) {
        String NA1 = "C:\\Users\\Vítor\\Desktop\\Escola\\Turma 11ºGPI22_Vítor\\Programação - Exercícios\\Java\\Fichas\\Fichas_M11\\M11_Ft4\\src\\main\\java\\org\\M11_Ft4\\Caracteres1";
        String NA2 = "C:\\Users\\Vítor\\Desktop\\Escola\\Turma 11ºGPI22_Vítor\\Programação - Exercícios\\Java\\Fichas\\Fichas_M11\\M11_Ft4\\src\\main\\java\\org\\M11_Ft4\\Caracteres2";

        try (FileReader fileReader = new FileReader(NA1);
             BufferedReader bufferedReader = new BufferedReader(fileReader);
             FileWriter fileWriter = new FileWriter(NA2);
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
            System.out.println("Caracteres transferidos com sucesso do arquivo de entrada para o arquivo de saída.");

        } catch (IOException e) {
            e.printStackTrace();
        }
        }
    }
