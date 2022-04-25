package design.patterns.B_Structural.adapter;

public class Main {
    public static void main(String[] args) {
        Database database = new AdapterJavaToDatabase();
        database.insert();
        database.update();
        database.select();
        database.delete();
        database = new DatabaseRunner();
        System.out.println("======================================");
        database.insert();
        database.update();
        database.select();
        database.delete();
    }
}
