package design.patterns.A_Creational.abstract_factory.factories;

import design.patterns.A_Creational.abstract_factory.clothes_washer.ClothesWasher;
import design.patterns.A_Creational.abstract_factory.clothes_washer.LgClothesWasher;
import design.patterns.A_Creational.abstract_factory.freezer.Freezer;
import design.patterns.A_Creational.abstract_factory.freezer.LgFreezer;
import design.patterns.A_Creational.abstract_factory.television.LgTelevision;
import design.patterns.A_Creational.abstract_factory.television.Television;

public class LgFactory implements AbstractFactory {
    @Override
    public ClothesWasher createClothesWasher() {
        return new LgClothesWasher();
    }

    @Override
    public Freezer createFreezer() {
        return new LgFreezer();
    }

    @Override
    public Television createTelevision() {
        return new LgTelevision();
    }
}
