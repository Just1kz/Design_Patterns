package design.patterns.B_Structural.decorator;

public class MiddleDeveloper extends DeveloperDecorator {
    public MiddleDeveloper(Developer developer) {
        super(developer);
    }

    public String makeReview() {
        return "make review\n";
    }

    @Override
    public String work() {
        return getClass().getSimpleName() + " fix middle bugs, make middle feature and " + makeReview();
    }
}
