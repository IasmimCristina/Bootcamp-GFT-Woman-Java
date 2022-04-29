package bancoDigital;

public class ContaCorrente extends Conta {
    //A criação de uma conta corrente dá ao cliente 150 reais como bônus se der um valor inicial maior que 100.
    private double bonus;



    @Override
    public void imprimirExtrato() {
        System.out.println("-----------------------------");
        System.out.println("---Extrato -Conta corrente- --");
        super.extratoInformacoes();
        System.out.println("-----------------------------");



    }
    public double getBonus() {
        return bonus;
    }


}
