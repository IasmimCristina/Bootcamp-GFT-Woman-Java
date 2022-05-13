package DesafioPadroesDeProjeto.JavaPuro.Facade;

public class Main {
    // Facade: um pouco controverso.
    //Providencia uma interface para reduzir a complexidade.
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.migrarCliente("Iasmim","5522685");
    }
}
