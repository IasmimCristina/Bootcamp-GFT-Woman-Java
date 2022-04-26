package bancoDigital;



public class Main {
    public static void main(String[] args) {
        //Criações de contas.
        Conta contac01 = new ContaCorrente();
        Conta contap01 = new ContaPoupanca();
        Conta contac02 = new ContaCorrente();
        Conta contap02 = new ContaPoupanca();
        Conta contac03 = new ContaCorrente();
        Conta contap03 = new ContaPoupanca();

        contac01.depositar(100);
        contac02.depositar(500);
        contap02.depositar(50);
        contac03.depositar(480);

        //Exemplo específico: Maria depositou 340, mas quer transferir o valor de 120 para outra conta.
        Conta contaMariaCorrente = new ContaCorrente();
        contaMariaCorrente.depositar(340);
        Conta contaMariaPoupanca = new ContaPoupanca();
        contaMariaCorrente.transferir(120,contaMariaPoupanca);

        //Exibição do exemplo de Maria:
        contaMariaCorrente.imprimirExtrato();
        contaMariaPoupanca.imprimirExtrato();

        //Exibição.
        contac01.imprimirExtrato();
        contap01.imprimirExtrato();
        contac02.imprimirExtrato();
        contap02.imprimirExtrato();
        contac03.imprimirExtrato();
        contap03.imprimirExtrato();

    }
}
