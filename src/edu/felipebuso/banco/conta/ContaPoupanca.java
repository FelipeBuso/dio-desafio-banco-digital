package edu.felipebuso.banco.conta;

import edu.felipebuso.banco.cliente.Cliente;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(String agencia, String conta, Cliente cliente) {
        super(agencia, conta, cliente, TipoConta.POUPANCA);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirDadosConta();
    }
}
