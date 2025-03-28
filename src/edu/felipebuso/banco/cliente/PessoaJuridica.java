package edu.felipebuso.banco.cliente;

public class PessoaJuridica implements Cliente {
    private String razaoSocial;
    private String cnpj;

    public PessoaJuridica(String razaoSocial, String cnpj) {
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
    }

    @Override
    public String getIdentificacao() {
        return "Razão Social: " + razaoSocial + ", CNPJ: " + cnpj;
    }
}
