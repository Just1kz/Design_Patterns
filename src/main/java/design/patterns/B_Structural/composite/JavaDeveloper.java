package design.patterns.B_Structural.composite;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println(getClass().getSimpleName() + " write code...");
    }
}
