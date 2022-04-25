package design.patterns.B_Structural.adapter;

public class AdapterJavaToDatabase extends Application implements Database {
    @Override
    public void insert() {
        saveObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void select() {
        readObject();
    }

    @Override
    public void delete() {
        deleteObject();
    }
}
