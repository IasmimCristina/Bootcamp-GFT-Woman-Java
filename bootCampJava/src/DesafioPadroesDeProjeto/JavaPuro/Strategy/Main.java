package DesafioPadroesDeProjeto.JavaPuro.Strategy;

public class Main {
    public static void main(String[] args) {
        //Strategy: simplifica a variação de algoritmos para a resolução de um problema.
        // Há muito polimorfismo.

        AcoesRobo normais = new AcoesNormaisRobo();
        AcoesRobo defensivas = new AcoesDefensivasRobo();
        AcoesRobo agressivas = new AcoesAgressivasRobo();

        Robo robo01 = new Robo();
        robo01.setStrategy(normais);

        robo01.mover();
        robo01.mover();
        System.out.println(" ");

        robo01.setStrategy(defensivas);

        robo01.mover();
        robo01.mover();
        robo01.mover();
        System.out.println(" ");


        robo01.setStrategy(agressivas);

        robo01.mover();


    }
}
