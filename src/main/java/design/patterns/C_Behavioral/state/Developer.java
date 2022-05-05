package design.patterns.C_Behavioral.state;

public class Developer {
    private Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void changeActivity() {
        if (activity instanceof SleepActivity) {
            setActivity(new CodeActivity());
        } else if (activity instanceof CodeActivity) {
            setActivity(new ReadActivity());
        } else if (activity instanceof  ReadActivity) {
            setActivity(new TrainActivity());
        } else if (activity instanceof  TrainActivity) {
            setActivity(new SleepActivity());
        }
    }

    public void justDoIt() {
        activity.justDoIt();
    }
}
