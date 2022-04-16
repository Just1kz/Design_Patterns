package design.patterns.A_Creational.factory_method.example_two;

public interface DtoFactory {
    Dto createDto();

    Dto createDtoWithName(String name);
}
