package design.patterns.B_Structural.decorator;

public class DeveloperDecorator implements Developer {
    public Developer developer;

    public DeveloperDecorator(Developer developer) {
        this.developer = developer;
    }

    @Override
    public String work() {
        return developer.work();
    }
}
