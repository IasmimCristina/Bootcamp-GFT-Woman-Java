package bancoDigital;

public class ContaPoupanca extends Conta {
    @Override
    public void imprimirExtrato() {
        System.out.println("-----------------------------");
        System.out.println("---Extrato -Conta poupança- --");
        super.extratoInformacoes();
        System.out.println("-----------------------------");



    }





}
