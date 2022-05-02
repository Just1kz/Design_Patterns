package design.patterns.B_Structural.decorator;

public class Main {
    public static void main(String[] args) {
        Developer developer = new MiddleDeveloper(new JuniorDeveloper());

        System.out.println(developer.work());
    }
}
