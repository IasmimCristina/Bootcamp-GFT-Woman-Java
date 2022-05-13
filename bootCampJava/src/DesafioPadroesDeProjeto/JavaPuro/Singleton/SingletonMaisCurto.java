package DesafioPadroesDeProjeto.JavaPuro.Singleton;

public class SingletonMaisCurto {
    private static SingletonMaisCurto instance = new SingletonMaisCurto();
    //Ela já instancia inicialmente.

    private SingletonMaisCurto() {
    }

    public static SingletonMaisCurto getInstance() {
        return instance;
    }
}
