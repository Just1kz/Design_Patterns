package design.patterns.B_Structural.flyweight.example_two;

public class CppDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println(getClass().getSimpleName() + writeCode);
    }
}
