package bancoDigital;

public abstract class Conta implements interfaceConta   {

    //Atributos
    protected static final int AGENCIA_EXEMPLO = 1;
    private static int ID = 1;
    protected int agencia, numero;
    protected  double saldo;

    public Conta() {
        this.agencia = Conta.AGENCIA_EXEMPLO;
        this.numero = ID++; //Cada conta terá im ID diferente e sequenial.
    }
    protected void extratoInformacoes() {
        //O saldo é diferente para as duas contas por conta do bônus.
        System.out.println(String.format("Agência: %d",this.agencia));
        System.out.println(String.format("Número: %d",this.numero));


    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor; // O 'this' neste caso não é obrigatório.

    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;


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
