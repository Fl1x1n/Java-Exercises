package org.M10_Ft10;

public class ContaBancaria {

    private int num;
    private String tit;
    private double sal;

    public ContaBancaria() {
        this.num = gerarnum();
        this.tit = "";
        this.sal = 0.0;
    }

    public ContaBancaria(String tit, double SI) {
        this.num = gerarnum();
        this.tit = tit;
        this.sal = SI;
    }

    private int gerarnum() {
        // Número exemplo para num da conta bancária
        return 123456789;
    }

    public void depositar(double val) {
        this.sal += val;
    }

    public void levantar(double val) {
        if (val <= this.sal) {
            this.sal -= val;
        } else {
            System.out.println("saldo insuficiente.");
        }
    }

    public int getnum() {
        return this.num;
    }

    public String gettit() {
        return this.tit;
    }

    public double getsal() {
        return this.sal;
    }

}
