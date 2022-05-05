package design.patterns.C_Behavioral.strategy;

import design.patterns.C_Behavioral.state.Activity;

public class Developer {
    private Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void execute() {
        activity.justDoIt();
    }
}
