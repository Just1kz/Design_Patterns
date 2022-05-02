package design.patterns.B_Structural.facade;

public class WorkFlowImpl implements WorkFlow {
    private Developer developer = new Developer();
    private BugTracker bugTracker = new BugTracker();
    private Job job = new Job();

    @Override
    public void startJob() {
        bugTracker.startSprint();
        commonFlow();
    }

    @Override
    public void finishJob() {
        bugTracker.finishSprint();
        commonFlow();
    }

    private void commonFlow() {
        job.doJob();
        developer.doJobBeforeDeadLine(bugTracker);
    }
}
