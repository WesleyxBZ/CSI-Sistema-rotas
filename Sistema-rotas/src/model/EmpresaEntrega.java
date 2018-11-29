package model;

import java.util.ArrayList;

public class EmpresaEntrega {
    
    private String nome;
    private ArrayList<Cidade> cidade = new ArrayList<Cidade>();
    private ArrayList<Funcionario> funcionario = new ArrayList<Funcionario>();
    private int codigo;
    static int cont=0;

    public EmpresaEntrega(String nome){
        this.nome = nome;
        this.codigo = cont;
        cont++;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void addCidade(Cidade cidade) {
        this.cidade.add(cidade);
    }

    public void removeCidade(Cidade cidade) {
        this.cidade.remove(cidade);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public void addFuncionario(Funcionario funcionario) {
        this.funcionario.add(funcionario);
    }

    public void removeFuncionario(Funcionario funcionario) {
        this.funcionario.remove(funcionario);
    }
    
}
