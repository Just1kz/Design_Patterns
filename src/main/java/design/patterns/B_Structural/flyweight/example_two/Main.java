package design.patterns.B_Structural.flyweight.example_two;

import java.util.ArrayList;
import java.util.List;

/**
 *  Так же данный пример можно расширить DTO классы некими атрибутами и переопределить equals+hashCode
 *  для более широкого приминения данного паттерна, так как на практике используются более специфичные объекты.
 */
public class Main {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = new DeveloperFactory();

        List<Developer> list = new ArrayList<>();

        list.add(developerFactory.getDeveloperBySpecialty("java"));
        list.add(developerFactory.getDeveloperBySpecialty("java"));
        list.add(developerFactory.getDeveloperBySpecialty("java"));
        list.add(developerFactory.getDeveloperBySpecialty("java"));
        list.add(developerFactory.getDeveloperBySpecialty("java"));
        list.add(developerFactory.getDeveloperBySpecialty("c++"));
        list.add(developerFactory.getDeveloperBySpecialty("c++"));
        list.add(developerFactory.getDeveloperBySpecialty("c++"));
        list.add(developerFactory.getDeveloperBySpecialty("c++"));
        list.add(developerFactory.getDeveloperBySpecialty("c++"));

        list.forEach(Developer::writeCode);
    }
}
