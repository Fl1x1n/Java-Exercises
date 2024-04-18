package org.M11_Ft4;

import java.io.*;

public class UtilizaFileInputOutputStream3 {
    public static void main (String args[]){
        String NA1 = "C:\\Users\\Vítor\\Desktop\\Escola\\Turma 11ºGPI22_Vítor\\Programação - Exercícios\\Java\\Fichas\\Fichas_M11\\M11_Ft4\\src\\main\\java\\org\\M11_Ft4\\Imagem1.png";
        String NA2 = "C:\\Users\\Vítor\\Desktop\\Escola\\Turma 11ºGPI22_Vítor\\Programação - Exercícios\\Java\\Fichas\\Fichas_M11\\M11_Ft4\\src\\main\\java\\org\\M11_Ft4\\Imagem2.png";
        try{
       FileInputStream Fentrada = new FileInputStream(NA1);
            FileOutputStream Fsaida = new FileOutputStream(NA2);

       byte[] buffer = new byte[1024];
       int bytesread;

            while ((bytesread = Fentrada.read(buffer)) != -1) {
                Fsaida.write(buffer, 0, bytesread);
            }
            Fentrada.close();
            Fsaida.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
