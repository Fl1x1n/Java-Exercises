package org.M11_Ft8;
import java.io.*;

public class UtilizaFileReaderWriter {
    public static void main(String[] args) {


            try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Vítor\\Desktop\\Escola\\Turma 11ºGPI22_Vítor\\Programação - Exercícios\\Java\\Fichas\\Fichas_M11\\M11_Ft8\\src\\main\\java\\org\\M11_Ft8\\Strings.txt"))) {
                for (int i = 1; i <= 5; i++) {
                    writer.write("Linha " + i);
                    writer.newLine();
                }
                // vai escrever 5 strings com o filewriter, tendo este um bufferedwriter atribuido
            } catch (IOException e) {
                e.printStackTrace();
            }

            try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Vítor\\Desktop\\Escola\\Turma 11ºGPI22_Vítor\\Programação - Exercícios\\Java\\Fichas\\Fichas_M11\\M11_Ft8\\src\\main\\java\\org\\M11_Ft8\\Strings.txt"))) {
                String li;
                int contali = 0;
                while ((li = reader.readLine()) != null) {
                    /* o reader ("leitor" irá ler as linhas enquanto estas não
                    possuirem um valor diferente de null. Quando não ouver mais strings
                    e o loop chegar a uma linha em branco (nula), o loop para.
                     */
                    System.out.println(li);
                }
                //vai ler 5 strings com o filewriter, tendo este um bufferedwriter atribuido
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

