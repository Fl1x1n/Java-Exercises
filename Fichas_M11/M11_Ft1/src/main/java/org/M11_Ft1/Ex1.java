package org.M11_Ft1;

public class Ex1 {

    public static void main(String args[]) {
        String str = "123abc";
        /* caso eu coloque letras no valor da string, o programa irá apontar diversos erros,
        visto que não é possível converter letras em números por serem 2 tipos diferentes de
        dados (números são int ou float(double), letras são char)
         */
        try {
            int eiro = Integer.parseInt(str);
            System.out.println("String 123 convertida em Inteiro:" + eiro);
        } catch (Exception erro) {
            System.out.println("Erro do código " + erro);
            erro.printStackTrace();
            /*esta função irá indicar os passos que o código deu para detetar o erro
            também indica onde este os encontrou
             */
        }
    }
}
