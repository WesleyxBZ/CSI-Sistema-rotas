package model;

public abstract class Funcionario {
    
    protected String nome;
    protected String cpf;
    protected EmpresaEntrega empresaEntrega;

    public Funcionario(String nome, String cpf, EmpresaEntrega empresaEntrega){
        this.nome = nome;
        this.cpf = cpf;
        this.empresaEntrega = empresaEntrega;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public EmpresaEntrega getEmpresaEntrega() {
        return empresaEntrega;
    }

    public void setEmpresaEntrega(EmpresaEntrega empresaEntrega) {
        this.empresaEntrega = empresaEntrega;
    }
    
}
