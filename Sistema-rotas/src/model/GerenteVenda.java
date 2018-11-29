package model;

 public class GerenteVenda extends Colaborador implements Administrador {
    
    public GerenteVenda(String nome, String cpf, EmpresaEntrega empresaEntrega) {
        super(nome, cpf, empresaEntrega);
    }
    
    @Override
    public Colaborador criarColaborador(TipoColaborador tipoColaborador, String nome, String cpf, EmpresaEntrega empresaEntrega){
        
        switch (tipoColaborador) {
        case Entregador:
            return new Entregador(nome, cpf, empresaEntrega);
        case Secretaria:
            return new Secretaria(nome, cpf, empresaEntrega);
        case GerenteVenda:
            return new GerenteVenda(nome, cpf, empresaEntrega);
        default:
            break;
        }
        
        return null;
    }
    
}
