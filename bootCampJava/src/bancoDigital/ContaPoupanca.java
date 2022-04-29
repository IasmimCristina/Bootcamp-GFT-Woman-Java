package bancoDigital;

public class ContaPoupanca extends Conta {
    //A criação de uma conta poupança dá ao cliente 300 reais como bônus.
    // As contas são criadas com esse bônus.
    //ESSA É CORRETA!!



    public void somaBonus() {
        System.out.println(String.format("Saldo inicial(sem bônus): %.2f", super.saldo));
        super.saldo += 300;
        System.out.println(String.format("Saldo total final: %.2f", super.saldo));


    }


    @Override
    public void imprimirExtrato() {
        System.out.println("-----------------------------");
        System.out.println("---Extrato -Conta poupança- --");
        somaBonus();
        super.extratoInformacoes();
        System.out.println("-----------------------------");


    }




}
