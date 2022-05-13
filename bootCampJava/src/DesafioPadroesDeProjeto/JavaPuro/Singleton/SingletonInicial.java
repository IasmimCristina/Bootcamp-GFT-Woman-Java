package DesafioPadroesDeProjeto.JavaPuro.Singleton;

public class SingletonInicial {
   private static SingletonInicial instance; //Ela controla a sua própria instância.

   private SingletonInicial(){}

    public static SingletonInicial getInstance() {
       if (instance== null)
           instance = new SingletonInicial();
       return instance;
    }
}
