package design.patterns.B_Structural.facade;

public class Developer {
    public void doJobBeforeDeadLine(BugTracker bugTracker) {
        if (bugTracker.isActiveSprint()) {
            System.out.println("Developer is solving problems...");
        } else {
            System.out.println("Developer is reading Habrhabr...");
        }
    }
}
