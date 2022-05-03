package design.patterns.C_Behavioral.chain_of_responsobility;

public class SimpleReportNotifier extends Notifier {
    public SimpleReportNotifier(Priority priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Notifying using simple report: " + message);
    }
}
