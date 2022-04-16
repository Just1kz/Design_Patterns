package design.patterns.A_Creational.factory_method.example_two;

public class Animal implements Dto {
    private String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public void doSomething() {
        System.out.println("I'm Animal");
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
