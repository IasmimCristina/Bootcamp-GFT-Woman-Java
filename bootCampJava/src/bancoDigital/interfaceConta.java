package bancoDigital;

public interface interfaceConta {
    //Interface: classe abstrata.
    //Abaixo: métodos com encapsulamento.
     void sacar(double valor);
     void depositar(double valor);
     void transferir(double valor, Conta contaDestino) ;
     void imprimirExtrato();



}
