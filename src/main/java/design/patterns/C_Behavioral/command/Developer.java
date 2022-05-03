package design.patterns.C_Behavioral.command;

public class Developer {
    private final Command insert;
    private final Command select;
    private final Command update;
    private final Command delete;

    public Developer(Command insert, Command select, Command update, Command delete) {
        this.insert = insert;
        this.select = select;
        this.update = update;
        this.delete = delete;
    }

    public void insertRecord() {
        insert.execute();
    }

    public void selectRecord() {
        select.execute();
    }

    public void updateRecord() {
        update.execute();
    }

    public void deleteRecord() {
        delete.execute();
    }
}
