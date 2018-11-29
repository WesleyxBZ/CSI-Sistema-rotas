package model;

public class Cidade {
    
    private String nome;
    private EmpresaEntrega empresaEntrega;
    
    public Cidade(String nome, EmpresaEntrega empresaEntrega){
        this.nome = nome;
        this.empresaEntrega = empresaEntrega;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public EmpresaEntrega getEmpresaEntrega() {
        return empresaEntrega;
    }

    public void setEmpresaEntrega(EmpresaEntrega empresaEntrega) {
        this.empresaEntrega = empresaEntrega;
    }
    
}
