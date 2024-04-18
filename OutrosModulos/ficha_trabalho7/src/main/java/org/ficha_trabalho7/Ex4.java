package org.ficha_trabalho7;
import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        int a, b, c, aux;
        System.out.print("Escreva 3 números inteiros");
        a = new Scanner(System.in).nextInt();
        b = new Scanner(System.in).nextInt();
        c = new Scanner(System.in).nextInt();
        if(a>b){
            aux = b;
            b=a;
            a=aux;
        }
        if(b>c){
            aux=c;
            c=b;
            b=aux;
        }
        if(b<a){
            aux=b;
            b=a;
            a=aux;
        }
        System.out.print(" "+a +"<" +b +"<" +c);
    }
}

