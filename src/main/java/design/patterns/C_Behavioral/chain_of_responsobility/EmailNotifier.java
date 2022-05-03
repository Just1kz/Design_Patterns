package design.patterns.C_Behavioral.chain_of_responsobility;

public class EmailNotifier extends Notifier {
    public EmailNotifier(Priority priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Sending email: " + message);
    }
}
