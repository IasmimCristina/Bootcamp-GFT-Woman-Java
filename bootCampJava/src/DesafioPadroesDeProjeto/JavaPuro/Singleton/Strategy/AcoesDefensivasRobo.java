package DesafioPadroesDeProjeto.JavaPuro.Singleton.Strategy;

public class AcoesDefensivasRobo implements AcoesRobo{
    @Override
    public void mover() {
        System.out.println("Adotou a movimentação defensiva...");
    }
}
