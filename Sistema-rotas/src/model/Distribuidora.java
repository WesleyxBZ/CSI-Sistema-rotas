package model;

import java.util.ArrayList;

public class Distribuidora {
    
    private String nome;
    private Cidade cidade;
    private ArrayList<Colaborador> colaborador = new ArrayList<Colaborador>();
    private ArrayList<Rota> rota = new ArrayList<Rota>();
    
    public Distribuidora(String nome, Cidade cidade){
        this.nome = nome;
        this.cidade = cidade;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
    
    public void addColaborador(Colaborador colaborador) {
        if(this.cidade.getEmpresaEntrega().getCodigo() == colaborador.getEmpresaEntrega().getCodigo()){
            this.colaborador.add(colaborador);
        }else{
            System.out.println("Colaborabor não está empregado nesta empresa.");
        }
    }

    public void removeColaborador(Colaborador colaborador) {
        this.colaborador.remove(colaborador);
    }
    
    public void addRota(Rota rota){
        this.rota.add(rota);
    }
    
    public void removeRota(Rota rota){
        this.rota.remove(rota);
    }
    
}
