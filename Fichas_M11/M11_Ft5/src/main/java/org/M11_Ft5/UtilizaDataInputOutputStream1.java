package org.M11_Ft5;

import java.io.*;

public class UtilizaDataInputOutputStream1 {
    public static void main(String[] args) {
        try {
            FileOutputStream fileFloat = new FileOutputStream ("Floats.txt");
            BufferedOutputStream buf = new BufferedOutputStream(fileFloat);
            //cria um buffer para o meu ficheiro com floats que será escrito
            DataOutputStream dout = new DataOutputStream(buf);
            /*variável que vai ser associada aos números que queremos colocar no meu
            ficheiro. Por outras palavras, irá ser usada para escrever os números no
            meu ficheiro*/
            FileInputStream fileFloat2 = new FileInputStream ("Floats.txt");
            BufferedInputStream buf2 = new BufferedInputStream(fileFloat2);
            /*cria um buffer para o meu ficheiro com floats que será lido, isto é, terá os
            seus números imprimidos no terminal*/
            DataInputStream data = new DataInputStream(buf2);
            /* variável que será associada aos números que quero ler do meu ficheiro.
            Por outras palavras, irá ser usada para ler os números que estão escritos no meu
            ficheiro.*/
            dout.writeFloat(3.14f);
            dout.writeFloat(2.78f);
            dout.writeFloat(1.68f);
            dout.close();
            //escreve os números no ficheiro
            float n1 = data.readFloat();
            float n2 = data.readFloat();
            float n3 = data.readFloat();
            //lê os números escritos no ficheiro
            System.out.println("Numero 1: "+ n1);
            System.out.println("Numero 2: "+ n2);
            System.out.println("Numero 3: "+ n3);
            //mostra os números que estão no ficheiro no terminal
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        // irá indicar o erro que possa estar associado ao código dentro do try
    }
}
/* apesar do código correr sem problemas, visto que o datainput/outputstream usa binário para
 escrever os números, estes estarão mal convertidos no ficheiro de texto, porém o pc irá
 identificá-los corretamente*/
