package design.patterns.A_Creational.abstract_factory.factories;

import design.patterns.A_Creational.abstract_factory.clothes_washer.ClothesWasher;
import design.patterns.A_Creational.abstract_factory.freezer.Freezer;
import design.patterns.A_Creational.abstract_factory.television.Television;

public interface AbstractFactory {
    ClothesWasher createClothesWasher();
    Freezer createFreezer();
    Television createTelevision();
}
