package design.patterns.A_Creational.abstract_factory.television;

import design.patterns.A_Creational.abstract_factory.television.Television;

public class SamsungTelevision implements Television {
    @Override
    public void broadcast() {
        System.out.println(this.getClass().getSimpleName() + " broadcasting...");
    }
}
