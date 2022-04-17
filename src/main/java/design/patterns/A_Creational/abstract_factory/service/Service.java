package design.patterns.A_Creational.abstract_factory.service;

import design.patterns.A_Creational.abstract_factory.clothes_washer.ClothesWasher;
import design.patterns.A_Creational.abstract_factory.factories.AbstractFactory;
import design.patterns.A_Creational.abstract_factory.freezer.Freezer;
import design.patterns.A_Creational.abstract_factory.television.Television;

public class Service {
    private final ClothesWasher clothesWasher;
    private final Freezer freezer;
    private final Television television;

    public Service(AbstractFactory abstractFactory) {
        this.clothesWasher = abstractFactory.createClothesWasher();
        this.freezer = abstractFactory.createFreezer();
        this.television = abstractFactory.createTelevision();
    }

    public void doSomething() {
        clothesWasher.washing();
        freezer.freeze();
        television.broadcast();
    }
}
