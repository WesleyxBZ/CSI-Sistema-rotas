package model;

import java.util.ArrayList;

public class Estatistica {
    
    private String horaInicio;
    private String tempoGasto;
    private Entregador entregador;
    private TipoLocomocao tipoLocomocao;
    private ArrayList<Localizacao> rastro = new ArrayList<Localizacao>();
    private Rota rota;
    public static int cont=0;
    public int verifEntrega=0;

    public Estatistica(String horaInicio, Entregador entregador, TipoLocomocao tipoLocomocao, Rota rota) {
        this.horaInicio = horaInicio;
        this.tipoLocomocao = tipoLocomocao;
        this.rota = rota;
        this.entregador = entregador;
    }
    
    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getTempoGasto() {
        return tempoGasto;
    }

    public void setTempoGasto(String tempoGasto) {
        this.tempoGasto = tempoGasto;
    }

    public TipoLocomocao getTipoLocomocao() {
        return tipoLocomocao;
    }

    public void setTipoLocomocao(TipoLocomocao tipoLocomocao) {
        this.tipoLocomocao = tipoLocomocao;
    }

    public void addRastro(Localizacao rastro) {
        if(cont < rota.getNumClientes()){
            if(verifEntrega == 0){
                cont++;
                this.rastro.add(rastro);
            }else{
                System.out.println("Não há entregas pendentes!");
            }
            if(cont == rota.getNumClientes()){
                System.out.println("Última entrega concluida!");
                cont = 0;
                verifEntrega = 1;
            }
        }  
    }

    public Rota getRota() {
        return rota;
    }

    public void setRota(Rota rota) {
        this.rota = rota;
    }
    
}
