package edu.felipebuso.banco;

import edu.felipebuso.banco.conta.Conta;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public void novaConta(Conta contaNova) {
        this.contas.add(contaNova);
    }

    public void encerraConta(Conta conta) {
        if (!contas.isEmpty()) {
            List<Conta> contasRemover = new ArrayList<>();
            contas.stream().forEach(c -> {
                if (c.equals(conta)) {
                    contasRemover.add(c);
                }
            });
            if (!contasRemover.isEmpty()) {
                contas.removeAll(contasRemover);
            }
        }
    }

    @Override
    public String toString() {
        return "Banco{" +
                "nome='" + nome + '\'' +
                ", contas abertas=" + contas.size() +
                '}';
    }
}
