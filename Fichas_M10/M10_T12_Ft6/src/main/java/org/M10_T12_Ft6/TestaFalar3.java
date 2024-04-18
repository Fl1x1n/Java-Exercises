package org.M10_T12_Ft6;

import java.util.Scanner;
public class TestaFalar3 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Pessoa pessoa;
        System.out.print("Insira o tipo de Pessoa (A ou a - Aluno; P ou p – Professor): ");
        String tipoPessoa = s.nextLine();
        if (tipoPessoa.equals("A") || tipoPessoa.equals("a"))
            pessoa = new Aluno();
        else if (tipoPessoa.equals("P") || tipoPessoa.equals("p"))
            pessoa = new Professor();
        else {
            pessoa = new Pessoa();
            // Por estar abstrato, é impossível usar nesta parte do código
            System.out.println("O tipo de pessoa que inseriu não existe por isso foi criada uma instância genérica de Pessoa");
        }
        System.out.print("Nome da pessoa? ");
        pessoa.setNome(s.nextLine());
        System.out.print("Género da pessoa? ");
        pessoa.setGenero(s.nextLine());
        System.out.print("Idade da pessoa? ");
        pessoa.setIdade(Integer.parseInt(s.nextLine ()));
        System.out.println("Olá, o meu nome é " + pessoa.getNome() + " sou do sexo " + pessoa.getGenero() + " e tenho " + pessoa.getIdade() + " anos");
        pessoa.falar();
    }
}
