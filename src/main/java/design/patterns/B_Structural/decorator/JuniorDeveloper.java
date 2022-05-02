package design.patterns.B_Structural.decorator;

public final class JuniorDeveloper implements Developer {
    @Override
    public String work() {
        return getClass().getSimpleName() + " fix lights bugs and make lights feature\n";
    }
}
