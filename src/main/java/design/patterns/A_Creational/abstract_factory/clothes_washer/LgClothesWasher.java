package design.patterns.A_Creational.abstract_factory.clothes_washer;

public class LgClothesWasher implements ClothesWasher{
    @Override
    public void washing() {
        System.out.println(this.getClass().getSimpleName() + " washing...");
    }
}
