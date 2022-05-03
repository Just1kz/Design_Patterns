package design.patterns.C_Behavioral.chain_of_responsobility;

public class BugTracker {
    public static void main(String[] args) {
        Notifier reportNotifier = new SimpleReportNotifier(Priority.ROUTINE);
        Notifier emailNotifier = new EmailNotifier(Priority.IMPORTANT);
        Notifier smsNotifier = new SmsNotifier(Priority.ASAP);

        //Создание цепи обработки
        //Можно все спрятать в отдельном классе с инициализацией цепи а для клиентского кода оставить
        // только возможность отдать сообщение с приоритетом в обработку
        reportNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(smsNotifier);

        reportNotifier.notifyManager("Everything is OK.", Priority.ROUTINE);
        reportNotifier.notifyManager("Something went wrong!", Priority.IMPORTANT);
        reportNotifier.notifyManager("Huston, we're had a problem here!!!", Priority.ASAP);
    }
}
