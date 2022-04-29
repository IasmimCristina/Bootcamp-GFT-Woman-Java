package bancoDigital;

public abstract class Conta implements interfaceConta {

    //Atributos
    protected Cliente clienteConta;
    protected static final int AGENCIA_EXEMPLO = 1;
    protected static int ID = 1;
    protected int agencia, numero;
    protected double saldo;
    Banco bancoConta = new Banco();



    public Conta(Cliente clienteConta) {
        this.agencia = Conta.AGENCIA_EXEMPLO;
        this.numero = ID++; //Cada conta terá im ID diferente e sequenial.
        this.clienteConta = clienteConta;

    }

    protected void extratoInformacoes() {
        //O saldo é diferente para as duas contas por conta do bônus.
        //Exibição da conta
        System.out.println(String.format("Títular: %s", this.clienteConta.getNome()));
        System.out.println(String.format("CPF: %s", this.clienteConta.getCpf()));
        System.out.println(String.format("Saldo total final: %.2f", this.saldo));
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Número: %d", this.numero));
        System.out.println(String.format("Banco: %s",bancoConta.getNome()));


    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor; // O 'this' neste caso não é obrigatório.

    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
        //Há um bônus de 150 reais se o depósito for maior ou igual a 500 reais.
        if (valor >= 500)
            this.saldo += 150;


    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor); //Pega de uma conta.
        contaDestino.depositar(valor);// Coloca em outra.

    }


    public int getAgencia() {
        return agencia;
    }


    public int getNumero() {
        return numero;
    }


    public double getSaldo() {
        return saldo;
    }


}
