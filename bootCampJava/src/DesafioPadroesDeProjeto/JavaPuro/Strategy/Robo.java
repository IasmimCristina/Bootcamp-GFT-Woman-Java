package DesafioPadroesDeProjeto.JavaPuro.Strategy;

public class Robo {
    private AcoesRobo strategy;

    public void setStrategy(AcoesRobo strategy) {
        this.strategy = strategy;
    }

    public void mover() {
        strategy.mover();

    }
}
