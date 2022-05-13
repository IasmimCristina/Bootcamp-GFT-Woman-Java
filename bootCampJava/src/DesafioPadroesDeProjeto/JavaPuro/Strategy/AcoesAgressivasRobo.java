package DesafioPadroesDeProjeto.JavaPuro.Strategy;

public class AcoesAgressivasRobo implements  AcoesRobo{
    @Override
    public void mover() {
        System.out.println("Passou a se mover agressivamente...");
    }
}
