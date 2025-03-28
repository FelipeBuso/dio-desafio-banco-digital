package edu.felipebuso.banco;

import edu.felipebuso.banco.cliente.Cliente;
import edu.felipebuso.banco.cliente.PessoaFisica;
import edu.felipebuso.banco.cliente.PessoaJuridica;
import edu.felipebuso.banco.conta.Conta;
import edu.felipebuso.banco.conta.ContaCorrente;
import edu.felipebuso.banco.conta.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("BancoDigital");
        System.out.println(banco.toString());
        Cliente pf = new PessoaFisica("Felipe", "12345678912");
        Cliente pj = new PessoaJuridica("DIO", "12345678912345");
        Conta cc = new ContaCorrente("1234", "7891-9", pj);
        cc.imprimirExtrato();
        Conta cp = new ContaPoupanca("7980", "654321", pf);
        cp.imprimirExtrato();
        banco.novaConta(cc);
        System.out.println(banco.toString());
        banco.novaConta(cp);
        System.out.println(banco.toString());

        cc.depositar(200);
        cc.transferir(100, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        banco.encerraConta(cp);

        System.out.println(banco.toString());
    }
}
