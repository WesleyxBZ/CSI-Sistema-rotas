package model;

interface Administrador {
    
    public Colaborador criarColaborador(TipoColaborador tipoColaborador, String nome, String cpf, EmpresaEntrega empresaEntrega);
        
}
