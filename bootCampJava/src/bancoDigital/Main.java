package bancoDigital;



public class Main {
    public static void main(String[] args) {
        //Criação das três clientes iniciais.
        Cliente cliente01 = new Cliente();
        cliente01.setNome("Ana");
        cliente01.setCpf("11111111111");
        Cliente cliente02 = new Cliente();
        cliente02.setNome("Paôla");
        cliente02.setCpf("22222222222");
        Cliente cliente03 = new Cliente();
        cliente03.setNome("Sandra");
        cliente03.setCpf("33333333333");

        //Criações de contas e exemplos.
        Conta contac01 = new ContaCorrente(cliente01);
        Conta contap01 = new ContaPoupanca(cliente01);
        Conta contac02 = new ContaCorrente(cliente02);
        Conta contap02 = new ContaPoupanca(cliente02);
        Conta contac03 = new ContaCorrente(cliente03);
        Conta contap03 = new ContaPoupanca(cliente03);

        contac01.depositar(100);
        contac02.depositar(500);
        contap02.depositar(50);
        contac03.depositar(480);

        //Exemplo específico: Maria depositou 340, mas quer transferir o valor de 120 para outra conta.
        Cliente clienteExemplo = new Cliente();
        clienteExemplo.setNome("Maria");
        clienteExemplo.setCpf("444444444444");

        Conta contaMariaCorrente = new ContaCorrente(clienteExemplo);
        contaMariaCorrente.depositar(340);
        Conta contaMariaPoupanca = new ContaPoupanca(clienteExemplo);
        contaMariaCorrente.transferir(120,contaMariaPoupanca);

        //Exibição do exemplo de Maria:
        contaMariaCorrente.imprimirExtrato();
        contaMariaPoupanca.imprimirExtrato();

        //Exibição das outras clientes.
        System.out.println("-------Lista de contas-------");
        contac01.imprimirExtrato();
        contap01.imprimirExtrato();
        contac02.imprimirExtrato();
        contap02.imprimirExtrato();
        contac03.imprimirExtrato();
        contap03.imprimirExtrato();
        contaMariaCorrente.imprimirExtrato();
        contaMariaPoupanca.imprimirExtrato();




    }
}
