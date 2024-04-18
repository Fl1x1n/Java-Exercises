package org.M11_Ft10;
import java.io.File;

public class UtilizaFile1 {
    public static void main(String[] args) {

        char separatorChar = File.separatorChar;
        System.out.println("Tipo de barra utilizada na plataforma: " + separatorChar);
        // deteta se o diretório é escrito com " ou com / (no windows é " e no Linux é /)


        File file = new File("C:\\Users\\Vítor\\Desktop\\Escola\\Turma 11ºGPI22_Vítor\\Programação - Exercícios\\Java\\Fichas\\Fichas_M11\\M11_Ft10\\src\\main\\java\\org\\M11_Ft10\\ficheiro");


        if (file.exists()) {
            // se o ficheiro existir
            System.out.println("Nome: " + file.getName());
            System.out.println("Directório: " + file.getParent());
            System.out.println("Caminho: " + file.getPath());
            System.out.println("Caminho completo: " + file.getAbsolutePath());
        } else {
            //se não existir
            System.out.println("não existe.");
        }
    }
}
// é questão de criar um ficheiro e testar apagado e criado