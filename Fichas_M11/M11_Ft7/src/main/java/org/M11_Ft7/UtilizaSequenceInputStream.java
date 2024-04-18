package org.M11_Ft7;

import java.io.*;

public class UtilizaSequenceInputStream {
    public static void main(String[] args) {
        StringBuilder sisFile = new StringBuilder();
        try {
            FileInputStream file1 = new FileInputStream("C:\\Users\\Vítor\\Desktop\\Escola\\Turma 11ºGPI22_Vítor\\Programação - Exercícios\\Java\\Fichas\\Fichas_M11\\M11_Ft7\\src\\main\\java\\org\\M11_Ft7\\Inteiros1.txt");
            FileInputStream file2 = new FileInputStream("C:\\Users\\Vítor\\Desktop\\Escola\\Turma 11ºGPI22_Vítor\\Programação - Exercícios\\Java\\Fichas\\Fichas_M11\\M11_Ft7\\src\\main\\java\\org\\M11_Ft7\\Inteiros2.txt");
            /*indica 2 ficheiros que já estão criados numa pasta*/
            BufferedInputStream fileBuf1 = new BufferedInputStream(file1);
            BufferedInputStream fileBuf2 = new BufferedInputStream(file2);
            /*cria um buffer para cada um deles para permitir uma leitura mais otimizada*/
            SequenceInputStream sis = new SequenceInputStream(fileBuf1, fileBuf2);
            /* "junta" ambos os arquivos, para que estes possam ser lidos de uma vez só, sem ser
            necessário lê-los em separado
             */
            FileOutputStream file3 = new FileOutputStream("C:\\Users\\Vítor\\Desktop\\Escola\\Turma 11ºGPI22_Vítor\\Programação - Exercícios\\Java\\Fichas\\Fichas_M11\\M11_Ft7\\src\\main\\java\\org\\M11_Ft7\\Inteiros1e2.txt");
            // cria um "Ficheiro de Saída" onde os dados dos ficheiros 1 e 2 serão colocados
            int i;
            while ((i = sis.read()) != -1) {
                sisFile.append((char) i);
                /* isto vai ler os bytes como valores inteiros (passam de bytes a números) e
                transforma-os num caractere (char) */
            }
            /*Um loop que irá atribuir cada byte dos ficheiros 1 e 2 à variável i (passa, basicamente
             os números do File 1 e File 2 para a variável i  */
            file3.write(sisFile.toString().getBytes());
                        // Converte os caracteres de volta a números (int) usando a codificação do sistema
            //isto irá escrever esses números no file 3
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/* O Código teve de ser escrito assim pois caso fosse feito sem o while e todo este processo,
não iriam aparecer números, e sim caracteres especiais (está relacionado com a leitura de
bytes a nível do computador mesmo. Não sei se o turno 1 conseguiu fazer sem isto, mas esta
foi a forma que encontrei para realizar o pretendido na ficha).
Recursos:
w3Schools
Baeldung
 */
