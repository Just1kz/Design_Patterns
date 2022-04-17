package design.patterns.A_Creational.abstract_factory.factories;

import design.patterns.A_Creational.abstract_factory.clothes_washer.ClothesWasher;
import design.patterns.A_Creational.abstract_factory.clothes_washer.SamsungClothesWasher;
import design.patterns.A_Creational.abstract_factory.freezer.Freezer;
import design.patterns.A_Creational.abstract_factory.freezer.SamsungFreezer;
import design.patterns.A_Creational.abstract_factory.television.SamsungTelevision;
import design.patterns.A_Creational.abstract_factory.television.Television;

public class SamsungFactory implements AbstractFactory {
    @Override
    public ClothesWasher createClothesWasher() {
        return new SamsungClothesWasher();
    }

    @Override
    public Freezer createFreezer() {
        return new SamsungFreezer();
    }

    @Override
    public Television createTelevision() {
        return new SamsungTelevision();
    }
}
