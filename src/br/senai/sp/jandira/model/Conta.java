package br.senai.sp.jandira.model;

public class Conta {

    private int numeroConta = 1234;

    private double saldo = 9652;

    private String agencia = "000-35-X";

    public void realizarDeposito(Double valor) {
        this.saldo += valor;
        System.out.println("O saldo da conta é de: " + saldo);
    }

    public void realizarSaque(Double valor) {
        this.saldo -= valor;
        System.out.println("O saldo da conta é de: " + saldo);
    }

    public void consultarSaldo() {
        System.out.println("Seu saldo é de: " + this.saldo);
    }
}