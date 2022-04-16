package design.patterns.A_Creational.factory_method.example_two;

public class HumanFactory implements DtoFactory {
    @Override
    public Dto createDto() {
        return new Human();
    }

    @Override
    public Dto createDtoWithName(String name) {
        return new Human(name);
    }
}
