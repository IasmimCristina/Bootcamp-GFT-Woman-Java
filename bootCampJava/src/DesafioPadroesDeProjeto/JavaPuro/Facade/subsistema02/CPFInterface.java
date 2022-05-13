package DesafioPadroesDeProjeto.JavaPuro.Facade.subsistema02;


public class CPFInterface {

    private static CPFInterface instance = new CPFInterface();
    private CPFInterface() {
    }
    public static CPFInterface getInstance() {
        return instance;
    }

    public  String pegarCidade(String cpf) {
        return "Cidade do cliente baseado no CEP.";
    }
    public  String pegarEstado(String cpf) {
        return "Estado do cliente baseado no CEP.";
    }

}
