package bancoDigital;

public class ContaCorrente extends Conta {
    @Override
    public void imprimirExtrato() {
        System.out.println("-----------------------------");
        System.out.println("---Extrato -Conta corrente- --");
        super.extratoInformacoes();
        System.out.println("-----------------------------");



    }


}