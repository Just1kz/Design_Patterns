package design.patterns.A_Creational.factory_method.example_two;

public class Human implements Dto {
    private String name;

    public Human() {
    }

    public Human(String name) {
        this.name = name;
    }

    @Override
    public void doSomething() {
        System.out.println("I'm Human");
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                '}';
    }
}
