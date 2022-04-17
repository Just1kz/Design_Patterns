package design.patterns.A_Creational.abstract_factory;

import design.patterns.A_Creational.abstract_factory.factories.AbstractFactory;
import design.patterns.A_Creational.abstract_factory.factories.LgFactory;
import design.patterns.A_Creational.abstract_factory.factories.SamsungFactory;
import design.patterns.A_Creational.abstract_factory.service.Service;

import java.util.Locale;

public class Main {
    private static Service configurationService(String mark) {
        Service service;
        AbstractFactory abstractFactory;

        switch (mark.toLowerCase(Locale.ROOT)) {
            case "samsung":
                abstractFactory = new SamsungFactory();
                service = new Service(abstractFactory);
                break;
            case "lg":
                abstractFactory = new LgFactory();
                service = new Service(abstractFactory);
                break;
            default:
                throw new RuntimeException(mark + " is not supported");
        }

        return service;
    }

    public static void main(String[] args) {
        Service service = configurationService("lg");
        service.doSomething();
    }
}
