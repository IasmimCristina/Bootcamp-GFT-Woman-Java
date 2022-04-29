package bancoDigital;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente clienteConta) {
        super(clienteConta);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("-----------------------------");
        System.out.println("---Extrato -Conta poupança- --");
        super.extratoInformacoes();

        System.out.println("-----------------------------");


    }




}
