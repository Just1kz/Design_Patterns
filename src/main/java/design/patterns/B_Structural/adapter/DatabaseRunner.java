package design.patterns.B_Structural.adapter;

public class DatabaseRunner implements Database {
    @Override
    public void insert() {
        System.out.println("db insert");
    }

    @Override
    public void update() {
        System.out.println("db update");
    }

    @Override
    public void select() {
        System.out.println("db select");
    }

    @Override
    public void delete() {
        System.out.println("db delete");
    }
}
