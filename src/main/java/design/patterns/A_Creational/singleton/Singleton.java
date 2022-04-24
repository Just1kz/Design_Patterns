package design.patterns.A_Creational.singleton;

public final class Singleton {
    private static Singleton singleton;
    public int id;

    public Singleton(int id) {
        this.id = id;
    }

    public static Singleton getInstance(int id) {
        if (singleton == null) {
            singleton = new Singleton(id);
        } else {
            singleton.id = id;
        }
        return singleton;
    }

    @Override
    public String toString() {
        return "Singleton{" +
                "link=" + super.toString() +
                ", id=" + id +
                '}';
    }
}
