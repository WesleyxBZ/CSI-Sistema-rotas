package model;

import java.util.ArrayList;

public class Rota {
    
    private String nome;
    private Entregador entregador;
    private Distribuidora distribuidora;
    private ArrayList<Cliente> cliente = new ArrayList<Cliente>();
    private ArrayList<Estatistica> estatistica = new ArrayList<Estatistica>();

    public Rota(String nome, Entregador entregador, Distribuidora distribuidora){
        this.nome = nome;
        this.entregador= entregador;
        this.distribuidora = distribuidora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Entregador getEntregador() {
        return entregador;
    }

    public void setEntregador(Entregador entregador) {
        this.entregador= entregador;
    }

    public Distribuidora getDistribuidora() {
        return distribuidora;
    }

    public void setDistribuicao(Distribuidora distribuidora) {
        this.distribuidora = distribuidora;
    }

    public void addCliente(Cliente cliente) {
        this.cliente.add(cliente);
    }

    public void removeCliente(Cliente cliente) {
        this.cliente.remove(cliente);
    }
    
    public int getNumClientes(){
        return cliente.size();
    }
    
    public void addEstatistica(Estatistica estatistica){
        this.estatistica.add(estatistica);
    }
    
    public void removeEstatistica(Estatistica estatistica){
        this.estatistica.remove(estatistica);
    }
    
}
