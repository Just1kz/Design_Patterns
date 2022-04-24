package design.patterns.A_Creational.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance(1);
        System.out.println(singleton);
        singleton = Singleton.getInstance(2);
        System.out.println(singleton);
        singleton = Singleton.getInstance(3);
        System.out.println(singleton);
        singleton = Singleton.getInstance(4);
        System.out.println(singleton);
    }
}
