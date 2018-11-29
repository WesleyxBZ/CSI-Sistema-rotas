package view;

import model.Cidade;
import model.Cliente;
import model.Distribuidora;
import model.Rota;
import model.Colaborador;
import model.EmpresaEntrega;
import model.Entregador;
import model.Estatistica;
import model.GerenteVenda;
import model.Localizacao;
import model.TipoColaborador;
import static model.TipoLocomocao.Van;

public class Tela {
    
    public static void main(String[] args) {
        
        // EMPRESA
        EmpresaEntrega emp1 = new EmpresaEntrega("AgiLOG Transportes");
        
        EmpresaEntrega emp2 = new EmpresaEntrega("JetLog Transportes");
        
        // ADMINISTRADOR
        GerenteVenda adm1 = new GerenteVenda("Ana Chagas", "24684935478", emp1);
        
        GerenteVenda adm2 = new GerenteVenda("Cassio Oliveira", "024563201202", emp2);
        
        // ADD funcionario em empresa
        emp1.addFuncionario(adm1);
        
        emp2.addFuncionario(adm2);
        
        // COLABORADOR
        Colaborador colab1 = adm1.criarColaborador(TipoColaborador.Entregador, "Joao Avila", "5454145641", emp1);
        Colaborador colab2 = adm1.criarColaborador(TipoColaborador.Secretaria, "Maria Silva", "5489657154", emp1);
        Colaborador colab3 = adm1.criarColaborador(TipoColaborador.GerenteVenda, "Michele Varga", "12065895421", emp1);
        
        Colaborador colab4 = adm2.criarColaborador(TipoColaborador.Entregador, "Marina Pitanga", "2013604002", emp2);
        
        // CIDADE
        Cidade cid1 = new Cidade("Santa Maria", emp1);
        
        // ADD cidade em empresa
        emp1.addCidade(cid1);
        
        // DISTRIBUIDORA
        Distribuidora dist1 = new Distribuidora("001-2018", cid1);
        
        // ADD colaborador em distribuidora
        dist1.addColaborador(colab1);
        dist1.addColaborador(colab2);
        
        //dist1.addColaborador(colab4); // Colaborabor não está empregado nesta empresa.
        
        // ROTA
        Rota r1 = new Rota("Rota Santa Maria.1", (Entregador) colab1, dist1);
        
        // LOCALIZACAO
        Localizacao casa1 = new Localizacao(412000f, 86354f);
        Localizacao casa2 = new Localizacao(412006f, 86383f);
        
        // CLIENTE
        Cliente c1 = new Cliente("João Oliveira", "02598452165", 
        "Rua das maças nº5", "Rua da uva nº64", casa1, "fotoCasa.jpg");
        Cliente c2 = new Cliente("Enzo Aristo", "5468129634", 
        "Rua das maças nº23", " ", casa2, "fotoCasa.jpg");

        // ADD cliente em rota
        r1.addCliente(c1);
        r1.addCliente(c2);
        
        // EXECUCAO DA ROTA
        Estatistica est1 = new Estatistica("18:24", (Entregador) colab1 , Van, r1);
        
        // ADD rastro
        est1.addRastro(casa1);
        est1.addRastro(casa2); // Última entrega concluida!
        est1.addRastro(casa2); // Não há entregas pendentes!
        
        
    }
    
}
