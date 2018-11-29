package model;

public abstract class Colaborador extends Funcionario{
    
    Colaborador(String nome, String cpf, EmpresaEntrega empresaEntrega) {
        super(nome, cpf, empresaEntrega);
    }
  
}
