package DesafioPadroesDeProjeto.JavaPuro.Facade;

import DesafioPadroesDeProjeto.JavaPuro.Facade.subsistema01.Service;
import DesafioPadroesDeProjeto.JavaPuro.Facade.subsistema02.CPFInterface;

public class Facade {
    //Exemplo prático.
    //Base de clientes.
    //Migração

    public void migrarCliente(String nome, String cep) {
        String estado = CPFInterface.getInstance().pegarEstado(cep);
        String cidade = CPFInterface.getInstance().pegarCidade(cep);
        Service.salvarCliente(nome,cep, estado, cidade);
    }

}
