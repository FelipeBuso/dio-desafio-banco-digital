package edu.felipebuso.banco.conta;

import edu.felipebuso.banco.cliente.Cliente;

public class ContaCorrente extends Conta {
    public ContaCorrente(String agencia, String conta, Cliente cliente) {
        super(agencia, conta, cliente, TipoConta.CORRENTE);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirDadosConta();
    }
}
