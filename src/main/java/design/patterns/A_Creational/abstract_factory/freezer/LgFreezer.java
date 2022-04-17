package design.patterns.A_Creational.abstract_factory.freezer;

public class LgFreezer implements Freezer {
    @Override
    public void freeze() {
        System.out.println(this.getClass().getSimpleName() + " freezing...");
    }
}
