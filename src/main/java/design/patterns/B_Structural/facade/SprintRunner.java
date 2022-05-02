package design.patterns.B_Structural.facade;

public class SprintRunner {
    public static void main(String[] args) {
        new Job().doJob();

        BugTracker bugTracker = new BugTracker();

        bugTracker.startSprint();
        Developer developer = new Developer();
        developer.doJobBeforeDeadLine(bugTracker);

        bugTracker.finishSprint();
        developer.doJobBeforeDeadLine(bugTracker);

        System.out.println("======================\n");

        //Сокращаем клиентский код с помощью фасада - WorkFlow/WorkFlowImpl
        //предоставляя упрощенный интерфейс для работы скрывающий работу многих компонентов и доп. логику
        WorkFlow workFlow = new WorkFlowImpl();

        workFlow.startJob();

        System.out.println("======================\n");

        workFlow.finishJob();
    }
}
