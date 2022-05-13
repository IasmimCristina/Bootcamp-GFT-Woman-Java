package DesafioPadroesDeProjeto.JavaPuro.Facade.subsistema01;

public class Service {

    public static void salvarCliente(String nome, String cidade, String cep, String estado) {
        System.out.println("-------------------------------");
        System.out.println("Novo cliente salvo com sucesso.");
        System.out.println(nome);
        System.out.println(cep);
        System.out.println(cidade);
        System.out.println(estado);
    }

    private Service() {
    }

}
