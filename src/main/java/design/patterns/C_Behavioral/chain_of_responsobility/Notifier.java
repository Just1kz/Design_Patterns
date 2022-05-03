package design.patterns.C_Behavioral.chain_of_responsobility;

public abstract class Notifier {
    private final Priority priority;
    private Notifier nextNotifier;

    public Notifier(Priority priority) {
        this.priority = priority;
    }

    public void setNextNotifier(Notifier nextNotifier) {
        this.nextNotifier = nextNotifier;
    }

    /**
     * Так же в данном примере можно сделать разделенное исполнение для каждого отдельного приоритета
     * @param message - сообщение
     * @param priority - приоритет
     */
    public void notifyManager(String message, Priority priority) {
        if (priority.getLevel() >= this.priority.getLevel()) {
            write(message);
        }

        if (nextNotifier != null) {
            nextNotifier.notifyManager(message,priority);
        }
    }

    public abstract void write(String message);
}
