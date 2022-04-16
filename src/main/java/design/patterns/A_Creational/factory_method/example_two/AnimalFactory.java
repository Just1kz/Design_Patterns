package design.patterns.A_Creational.factory_method.example_two;

public class AnimalFactory implements DtoFactory {
    @Override
    public Dto createDto() {
        return new Animal();
    }

    @Override
    public Dto createDtoWithName(String name) {
        return new Animal(name);
    }
}
