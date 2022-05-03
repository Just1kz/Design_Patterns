package design.patterns.B_Structural.composite;

public class CppDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println(getClass().getSimpleName() + " write code...");
    }
}
