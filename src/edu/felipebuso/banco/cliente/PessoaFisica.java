package edu.felipebuso.banco.cliente;

public class PessoaFisica implements Cliente {
    private String nome;
    private String cpf;

    public PessoaFisica(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String getIdentificacao() {
        return "Nome: " + nome + ", CPF: " + cpf;
    }
}
