package design.patterns.B_Structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Team implements Developer {
    private final List<Developer> developers = new ArrayList<>();

    public void addDeveloper(Developer developer) {
        System.out.println("add " + developer.getClass().getSimpleName() +" in team");
        developers.add(developer);
    }

    public void removeDeveloper(Developer developer) {
        developers.remove(developer);
    }

    @Override
    public void writeCode() {
        System.out.println("Team is start work...");
        developers.forEach(Developer::writeCode);
    }
}
