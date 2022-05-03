package design.patterns.C_Behavioral.command;

public class DeleteCommand implements Command {
    private final DataBase dataBase;

    public DeleteCommand(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public void execute() {
        dataBase.delete();
    }
}
