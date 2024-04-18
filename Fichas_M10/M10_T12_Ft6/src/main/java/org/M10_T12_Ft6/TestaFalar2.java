package org.M10_T12_Ft6;
import java.util.Scanner;

public class TestaFalar2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Pessoa pessoa;
        System.out.print("Insira o tipo de Pessoa (A ou a - Aluno; P ou p - Professor): ");
        String tipoPessoa=s.nextLine();

        if (tipoPessoa.equals("A") || tipoPessoa.equals("a"))
            pessoa = new Aluno("Pedro Martins", "Masculino", 15, 23, "A");
        else if (tipoPessoa.equals("P") || tipoPessoa.equals("p"))
            pessoa = new Professor("Helena Lopes", "Feminino", 40, 550, 2);
        else {
            pessoa = new Pessoa();
            System.out.println("O tipo de pessoa que inseriu não existe por isso foi criada uma instância genérica de Pessoa");
        }
        System.out.println("Olá, o meu nome é " + pessoa.getNome() + " sou do sexo " + pessoa.getGenero() + " e tenho " + pessoa.getIdade() + " anos");
        if (pessoa instanceof Aluno)
            System.out.println("O meu número é " + ((Aluno)pessoa).getNumAluno() + " e a minha turma é " +((Aluno)pessoa).getTurma());
        else if (pessoa instanceof Professor)
            System.out.println("O meu grupo de docência é " + ((Professor)pessoa).getGrupoDocencia() + " e o meu escalão é " + ((Professor)pessoa).getEscalao());
        pessoa.falar();
    }
}
