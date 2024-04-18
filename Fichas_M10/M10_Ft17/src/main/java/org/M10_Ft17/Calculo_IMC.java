package org.M10_Ft17;

import javax.swing.JOptionPane;

public class Calculo_IMC {
    private char sexo;
    private double peso;
    private double altura;
    private double imc;

    // Constantes para valores de IMC
    private static final double[] IMC_HOMEM = {20.7, 26.4};
    private static final double[] IMC_MULHER = {19.1, 25.8};

    // Constantes para mensagens
    private static final String MSG_RESULTADO_HOMEM = "\n\n Resultado IMC (Masculino):";
    private static final String MSG_RESULTADO_MULHER = "\n\n Resultado IMC (Feminino):";
    private static final String MSG_ABAIXO_PESO = "\n- Você está abaixo do peso";
    private static final String MSG_PESO_IDEAL = "\n- Você está no peso ideal";
    private static final String MSG_ACIMA_PESO = "\n- Você está acima do peso";
    private static final String MSG_BEM_VINDO = "Cálculo de IMC \n (Versão 1.0) \n\n Criado na disciplina de PSI da ESRBP.";

    public void obterSexo() {
        String input = JOptionPane.showInputDialog(null, "Qual é o Teu sexo: masculino ou feminino? \nPara masculino digita [1]. \nPara feminino digita [2]. \n");
        char opcao = input.charAt(0);

        if (opcao == '1') {
            sexo = 'M';
            JOptionPane.showMessageDialog(null, "Escolheste: Masculino");
        } else if (opcao == '2') {
            sexo = 'F';
            JOptionPane.showMessageDialog(null, "Escolheste: Feminino");
        } else {
            JOptionPane.showMessageDialog(null, "Inválido.");
            System.exit(0);
        }
    }

    public void obterPeso() {
        String input = JOptionPane.showInputDialog(null, "Insire o teu peso (exemplo: 70.5):");
        peso = Double.parseDouble(input);
        JOptionPane.showMessageDialog(null, "Seu peso é: " + peso);
    }

    public void obterAltura() {
        String input = JOptionPane.showInputDialog(null, "Insire a tua altura em metros (exemplo: 1.75):");
        altura = Double.parseDouble(input);
        JOptionPane.showMessageDialog(null, "Sua altura é: " + altura);
    }

    public void calcularIMC() {
        imc = peso / Math.pow(altura, 2);
    }

    public void exibirResultado() {
        String message;

        if (sexo == 'M') {
            message = MSG_RESULTADO_HOMEM;
            if (imc < IMC_HOMEM[0]) {
                message += MSG_ABAIXO_PESO;
            } else if (imc >= IMC_HOMEM[0] && imc <= IMC_HOMEM[1]) {
                message += MSG_PESO_IDEAL;
            } else {
                message += MSG_ACIMA_PESO;
            }
        } else if (sexo == 'F') {
            message = MSG_RESULTADO_MULHER;
            if (imc < IMC_MULHER[0]) {
                message += MSG_ABAIXO_PESO;
            } else if (imc >= IMC_MULHER[0] && imc <= IMC_MULHER[1]) {
                message += MSG_PESO_IDEAL;
            } else {
                message += MSG_ACIMA_PESO;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Erro.");
            System.exit(0);
            return;
        }

        JOptionPane.showMessageDialog(null, message);
    }

    public static void main(String[] args) {
        Calculo_IMC calculadora = new Calculo_IMC();

        JOptionPane.showMessageDialog(null, MSG_BEM_VINDO);

        calculadora.obterSexo();
        calculadora.obterPeso();
        calculadora.obterAltura();
        calculadora.calcularIMC();
        calculadora.exibirResultado();
    }
}
