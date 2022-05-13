package DesafioPadroesDeProjeto.JavaPuro.Singleton.Strategy;

public class AcoesNormaisRobo implements  AcoesRobo{
    @Override
    public void mover() {
        System.out.println(" ");
        System.out.println("Começou a se mover...");
    }
}
