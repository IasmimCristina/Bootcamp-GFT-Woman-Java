package DesafioPadroesDeProjeto.JavaPuro.Singleton;

public class SingletonLazyHolder {
    //Possui uso de memória mais otimizado.
    //É thread safe.
    private static class InstanceHolder { //Instância encapsulada.
        public static SingletonLazyHolder instance = new SingletonLazyHolder();
    }

    private SingletonLazyHolder(){}

    public static SingletonLazyHolder getInstance() {

        return InstanceHolder.instance;
    }
}
