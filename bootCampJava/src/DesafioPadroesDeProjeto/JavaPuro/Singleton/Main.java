package DesafioPadroesDeProjeto.JavaPuro.Singleton;

public class Main {
    public static void main(String[] args) {

        //Teste para saber se 'inicial' possuirá o mesmo endereço de memória. - Singleton Lazy.
        System.out.println("--------------------");
        System.out.println("---Singleton Lazy---");
        SingletonInicial inicial = SingletonInicial.getInstance();
        System.out.println(inicial);
        inicial = SingletonInicial.getInstance();
        System.out.println(inicial);

        //Teste - Singleton Eager.
        System.out.println(" ");
        System.out.println("---------------------");
        System.out.println("---Singleton Eager---");
        SingletonMaisCurto eager = SingletonMaisCurto.getInstance();
        System.out.println(eager);
        eager = SingletonMaisCurto.getInstance();
        System.out.println(eager);

        //Teste - Singleton Lazy Holder.
        System.out.println(" ");
        System.out.println("-------------------------");
        System.out.println("--Singleton Lazy Holder--");
        SingletonLazyHolder holder = SingletonLazyHolder.getInstance();
        System.out.println(holder);
        holder = SingletonLazyHolder.getInstance();
        System.out.println(holder);
        System.out.println("-------------------------");

    }
}
