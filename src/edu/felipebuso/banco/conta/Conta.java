package edu.felipebuso.banco.conta;

import edu.felipebuso.banco.cliente.Cliente;

public abstract class Conta implements IConta {
    private String agencia;
    private String conta;
    private double saldo = 0;
    private Cliente cliente;
    private TipoConta tipo;

    public Conta(String agencia, String conta, Cliente cliente,
                 TipoConta tipo) {
        this.agencia = agencia;
        this.conta = conta;
        this.cliente = cliente;
        this.tipo = tipo;
    }

    protected String getAgencia() {
        return agencia;
    }

    protected String getConta() {
        return conta;
    }

    protected double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            saldo -= valor;
        }
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            saldo -= valor;
            contaDestino.depositar(valor);
        }
    }


    protected void imprimirDadosConta() {
        System.out.println(String.format(this.cliente.getIdentificacao()));
        System.out.println("Agencia: " + this.agencia);
        System.out.println("Conta: " + this.conta);
        System.out.println("Tipo: " + this.tipo);
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}
