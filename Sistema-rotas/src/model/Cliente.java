package model;

public class Cliente {
    
    private String nome;
    private String enderecoPrinc;
    private String enderecoSec;
    private Localizacao localizacao;
    private String cpf;
    private String fotosResidencia;
    
    public Cliente(String nome, String cpf, String enderecoPrinc, String enderecoSec, Localizacao localizacao, String fotosResidencia){
        this.nome = nome;
        this.enderecoPrinc = enderecoPrinc;
        this.enderecoSec = enderecoSec;
        this.cpf = cpf;
        this.localizacao = localizacao;
        this.fotosResidencia = fotosResidencia;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEnderecoPrinc() {
        return enderecoPrinc;
    }

    public void setEnderecoPrinc(String enderecoPrinc) {
        this.enderecoPrinc = enderecoPrinc;
    }

    public String getEnderecoSec() {
        return enderecoSec;
    }

    public void setEnderecoSec(String enderecoSec) {
        this.enderecoSec = enderecoSec;
    }

    public Localizacao getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(Localizacao localizacao) {
        this.localizacao = localizacao;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getFotosResidencia() {
        return fotosResidencia;
    }

    public void setFotosResidencia(String fotosResidencia) {
        this.fotosResidencia = fotosResidencia;
    }
    
}
