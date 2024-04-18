package org.M11_Ft10;
import java.io.*;

public class UtilizaFile2 {
    public static void main(String[] args) {

        File file1 = new File("C:\\Users\\Vítor\\Desktop\\Escola\\Turma 11ºGPI22_Vítor\\Programação - Exercícios\\Java\\Fichas\\Fichas_M11\\M11_Ft10\\src\\main\\java\\org\\M11_Ft10\\Inteiros");


        if (file1.exists()) {

            File file2 = new File("C:\\Users\\Vítor\\Desktop\\Escola\\Turma 11ºGPI22_Vítor\\Programação - Exercícios\\Java\\Fichas\\Fichas_M11\\M11_Ft10\\src\\main\\java\\org\\M11_Ft10\\NumsInteiros");


            file1.renameTo(file2);
            //troca o nome do Ficheiro1 pelo ficheiro2


            file2.delete();
            //um pouco óbvio mas isto irá pagar o ficheiro 2


            File directory = new File("LingProg");
            // Cria um File que represente um diretório denominado "LingProg"


            directory.mkdir();
            //cria o diretório

            if (directory.exists()) {

                File file3 = new File(directory, "Modulo13.txt");
                File file4 = new File(directory, "Modulo14.txt");

                try {

                    file3.createNewFile();
                    file4.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


        File directory = new File("LingProg");
        String[] files = directory.list();
        if (files != null) {
            System.out.println("Ficheiros do diretório LingProg:");
            for (String fileName : files) {
                System.out.println(fileName);
            }
        }
    }
}
// isto criou o diretório, só não sei onde :)
