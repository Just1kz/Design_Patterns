package design.patterns.C_Behavioral.chain_of_responsobility;

public class SmsNotifier extends Notifier {
    public SmsNotifier(Priority priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Sending sms: " + message);
    }
}
